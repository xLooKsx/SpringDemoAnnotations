package br.pessoal.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PropertiesFortuneService implements FortuneService{

    @Value("${foo.fortunes}")
    private String[] propertiesFortune;

    private final Random random = new Random();
    @Override
    public String getFortune() {
        int randomIndex = random.nextInt(propertiesFortune.length);
        return propertiesFortune[randomIndex];
    }
}
