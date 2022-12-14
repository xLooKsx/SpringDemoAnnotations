package br.pessoal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println(">>> Default Constructor FootballCoach has called <<<");
    }

    @Autowired
    private FortuneService textFileFortuneService;
    @Override
    public String getDailyWorkout() {
        return "make 3 goals every 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return textFileFortuneService.getFortune();
    }
}
