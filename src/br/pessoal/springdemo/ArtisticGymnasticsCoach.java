package br.pessoal.springdemo;

public class ArtisticGymnasticsCoach implements Coach {

    private final FortuneService fortuneService;

    public ArtisticGymnasticsCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Jump 3 times in a single foot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
