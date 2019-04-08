package main;

import Conifg.ProjectConfig;
import Objects.Pisica;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) { // try cu resurse
            Pisica p = context.getBean(Pisica.class); // preia referinta la un obiect creat (e un singur obiect creat => daca mai creez o pisica, imi da ac referinta
            System.out.println(p);

            Pisica p2 = context.getBean(Pisica.class);
            System.out.println(p2);
        }
    }
}
