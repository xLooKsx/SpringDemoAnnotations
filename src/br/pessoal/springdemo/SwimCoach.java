package br.pessoal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    //If you don't use the '$' symbol the value passed in @Value is going to be literal
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Autowired
    private FortuneService propertiesFortuneService;
    @Override
    public String getDailyWorkout() {
        return "hold your breath for 3 minutes";
    }

    @Override
    public String getDailyFortune() {
        return propertiesFortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
