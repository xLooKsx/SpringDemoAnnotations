package br.pessoal.springdemo;

public class LazyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Take a day off pls";
    }
}
