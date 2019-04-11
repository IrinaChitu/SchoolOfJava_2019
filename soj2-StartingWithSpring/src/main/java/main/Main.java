package main;

import beans.TransactionRepository;
import beans.TransactionService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try( AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) { // mergi in clasa respectiva si preia configurarile de acolo

//            TransactionRepository transactionRepository = context.getBean(TransactionRepository.class); // by type
            TransactionRepository transactionRepository = context.getBean("transactionRepository", TransactionRepository.class); //by name
//            TransactionRepository transactionRepository2 = context.getBean("transactionRepository2", TransactionRepository.class); //by name
            TransactionRepository transactionRepository2 = context.getBean("transactionRepository", TransactionRepository.class); //by name

            transactionRepository2.setNume("Singleton"); // daca avem acelasi bean => ac instanta

            System.out.println(transactionRepository);
            System.out.println(transactionRepository2);




            TransactionRepository transactionRepositoryPrototype = context.getBean("transactionRepository2", TransactionRepository.class); //by name
            TransactionRepository transactionRepositoryPrototype2 = context.getBean("transactionRepository2", TransactionRepository.class); //by name

            transactionRepositoryPrototype2.setNume("Prototype"); // => instante diferite

            System.out.println(transactionRepositoryPrototype);
            System.out.println(transactionRepositoryPrototype2);


            TransactionService transactionService = context.getBean(TransactionService.class);
            System.out.println(transactionService.getTransactionRepository()); //trebuia sa imi dea transaction 1
        }

        // context.close(); - cu try nu mai e nevoie sa inchidem manual contextul
    }
}
