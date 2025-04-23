package com.alura.challenge.principal;

import com.alura.challenge.modelos.ConsultaApi;
import com.alura.challenge.modelos.TipoDeCambio;

public class Main {

    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();

        TipoDeCambio tipoDeCambio = consulta.buscarTipoCambio(
                "CLP",
                "USD",
                1000);

        System.out.println(tipoDeCambio.conversion_result());
    }

}
