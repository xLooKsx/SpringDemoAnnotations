package br.pessoal.springdemo;

public class BasketballCoach implements Coach{

    private final FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "bounce ball between your legs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
