package br.pessoal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">>> Default Constructor has called <<<");
    }

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
