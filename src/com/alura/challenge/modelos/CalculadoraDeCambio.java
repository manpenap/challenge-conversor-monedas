package com.alura.challenge.modelos;

public class CalculadoraDeCambio {
    public String calcular(int opcion, double cantidadDivisa){
        ConsultaApi consulta = new ConsultaApi();
        String monedaBase = "";
        String monedaDestino = "";
        String mensaje="";

        switch (opcion){
            case 1:
                monedaBase = "USD";
                monedaDestino = "ARS";
                break;
            case 2:
                monedaBase = "ARS";
                monedaDestino = "USD";
                break;
            case 3:
                monedaBase = "USD";
                monedaDestino = "BRL";
                break;
            case 4:
                monedaBase = "BRL";
                monedaDestino = "USD";
                break;
            case 5:
                monedaBase = "USD";
                monedaDestino = "COP";
                break;
            case 6:
                monedaBase = "COP";
                monedaDestino = "USD";
        }

        TipoDeCambio resultado = consulta.buscarTipoCambio(monedaBase,monedaDestino,cantidadDivisa);
        mensaje = "El valor de " + cantidadDivisa + "["+ monedaBase +"] "
                + "corresponde al valor final de =>>>" + resultado.conversion_result()
                + "["+ monedaDestino +"]";
        return mensaje;
    }
}
