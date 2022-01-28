package com.dio.gof.subsistema2.cep;

import com.dio.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Gotham";
    }
    public String recuperarEstado(String cep){
        return "Amapá";
    }
}
