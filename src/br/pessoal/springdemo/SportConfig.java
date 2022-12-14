package br.pessoal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("br.pessoal.springdemo")
public class SportConfig {

    /**
     * If I'm not using componentScan I need to define my beans manually, in this scenario I do not use @Component annotation
     * those classes are just POJOs
     * */
    //define bean for sadFortune Service
    @Bean
    public SadFortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for basketballCoach and inject dependency
    @Bean
    public BasketballCoach basketballCoach(){
        return new BasketballCoach(sadFortuneService());
    }
}