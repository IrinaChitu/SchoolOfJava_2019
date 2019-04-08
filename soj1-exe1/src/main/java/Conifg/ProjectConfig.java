package Conifg;


import Objects.Pisica;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // adnotare (= marcam o caracteristica a unui alt element): clasa de configurare
public class ProjectConfig {
    //declaram un bean = cream o instanta si o punem in interiorul contextului, care ajunge in spring

    @Bean
    // @Scope("protoype") // => acum va crea instante diferite
    public Pisica pisica() { // reprezinta instanta | nu are un nume standard pt o metoda (de obicei cu verb)
        Pisica c = new Pisica();
        c.name = "Tom";
        return c;
    }

}
