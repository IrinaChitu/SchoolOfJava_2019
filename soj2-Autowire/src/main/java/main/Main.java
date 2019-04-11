package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.TransactionService;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            TransactionService transactionService = context.getBean(TransactionService.class);

            System.out.println(transactionService);
        }
    }
}
