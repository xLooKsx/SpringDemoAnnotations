package br.pessoal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

//Change the scope to be created a new bean every time instead use singleton
//@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    /**
     * Instead Use the @Qualifier annotation is possible to name the variable name the same name as the java class.
     * private FortuneService randomFortuneService;
     * */

    public TennisCoach() {
        System.out.println(">>> Default Constructor has called <<<");
    }

    //this annotation makes this method execute automatically after constructor
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("TennisCoach: inside doMyStartUpStuff");
    }

    //this annotation makes this method execute automatically when the bean is going to be deleted
    @PreDestroy
    public void doMyCleanStuff(){
        System.out.println("TennisCoach: inside doMyCleanStuff");
    }

    /**
     * Whe We need to inject dependencies in constructor/setter/method and need qualifier annotation you have to pass
     * the qualifier annotation inside method params like this.
     *
     * In this case I think it's better to put the variable name the same name as the java class and don't use qualifier annotation
     *
//   *     @Autowired
     *     public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
     *         System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
     *         this.fortuneService = fortuneService;
     *     }
     * */


    //Constructor injection
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //Setter Injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">>> TennisCoach: Inside setFortuneService method <<<");
//        this.fortuneService = fortuneService;
//    }
}
