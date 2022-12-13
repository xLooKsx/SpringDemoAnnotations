package br.pessoal.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private final String[] randomFortune = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private final Random random = new Random();
    @Override
    public String getFortune() {

        int randomIndex = random.nextInt(randomFortune.length);
        return randomFortune[randomIndex];
    }
}
