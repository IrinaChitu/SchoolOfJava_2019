package main;

import config.ProjectConfig;
import model.BankAccount;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.BankAccountRepository;
import service.BankAccountService;
import service.TransactionService;


public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            TransactionService transactionService = context.getBean(TransactionService.class);

            System.out.println(transactionService);


            //Service contine atribut Repository
            //Main contine atribut Service
            //Service <-/-> Repository (nu ar trebui sa existe legatura directa)

            BankAccount bankAccount1 = new BankAccount();
            bankAccount1.setIban("1");
            bankAccount1.setOwnerName("Jhon Doe");
            bankAccount1.setBalance(500.00);
            BankAccount bankAccount2 = new BankAccount();
            bankAccount2.setIban("2");
            bankAccount2.setOwnerName("Jenny Doe");
            bankAccount2.setBalance(1000.00);

            BankAccountService bankAccountService = context.getBean(BankAccountService.class);

            bankAccountService.addBankAccount(bankAccount1);
            bankAccountService.addBankAccount(bankAccount2);

            System.out.println(bankAccount1); // sout
            System.out.println(bankAccount2);

            bankAccountService.transferMoney("1", "2", 200);

            System.out.println(bankAccount1);
            System.out.println(bankAccount2);
        }
    }
}
