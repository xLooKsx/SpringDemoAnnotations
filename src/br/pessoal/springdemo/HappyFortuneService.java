package br.pessoal.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You are going to have a great day today";
    }
}
