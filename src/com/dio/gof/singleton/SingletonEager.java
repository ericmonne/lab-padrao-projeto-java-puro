package com.dio.gof.singleton;

/**
 * Singleton "ávido"
 *
 * @author ericmonne
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
