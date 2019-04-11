package config;

import beans.TransactionRepository;
import beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean

    public TransactionRepository transactionRepository() { // clasa pe care vreau sa o fac bean | sa o creez si sa o accesez
         TransactionRepository transactionRepository = new TransactionRepository();
         transactionRepository.setNume("Transaction 1");
         return transactionRepository;
    }

    @Bean
    // @Primary
    @Scope(scopeName = "prototype") // de tip prototype duuh => nu mai e singleton
    public TransactionRepository transactionRepository2() { // daca vreau 2 bean-uri pe aceeasi clasa => eroare | 3 metode de a evita: qualifier, cu name: sau setam una ca fiind primara
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("Transaction 2");
        return transactionRepository;
    }

    @Bean
    public TransactionService transactionService() {
        TransactionService transactionService = new TransactionService();
        transactionService.setTransactionRepository(new TransactionRepository());   // se instantiaza mereu un ob nou
        transactionService.setTransactionRepository(transactionRepository());
        return transactionService;
    }
}
