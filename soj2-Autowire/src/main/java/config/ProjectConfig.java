package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repositories.TransactionRepository;

@Configuration
@ComponentScan(basePackages = {"repositories", "service"})  // spune clasei de configurare sa caute acolo beanuri
// bean-urile se pot crea astfel:
// @Repository
// @Bean
// @Component
public class ProjectConfig {

    @Bean
    public TransactionRepository transactionRepository() {
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("Transaction 1");
        return transactionRepository;
    }
}
