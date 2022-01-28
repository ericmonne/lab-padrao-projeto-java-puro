package com.dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("R2D2 está se movendo agressivamente...");
    }
}
