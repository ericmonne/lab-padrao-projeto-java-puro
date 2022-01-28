package com.dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("R2D2 está se movendo defensivamente...");
    }
}
