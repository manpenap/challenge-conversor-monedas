package com.alura.challenge.modelos;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraDeCambio {
    private ConsultaApi consulta = new ConsultaApi();
    private static final Map<Integer, String[]> conversiones = new HashMap<>();

    static{
        conversiones.put(1,new String[]{"USD","ARS"});
        conversiones.put(2,new String[]{"ARS","USD"});
        conversiones.put(3,new String[]{"USD","BRL"});
        conversiones.put(4,new String[]{"BRL","USD"});
        conversiones.put(5,new String[]{"USD","COP"});
        conversiones.put(6,new String[]{"COP","USD"});
    }

    public String calcular(int opcion, double cantidadDivisa){
        String[] monedas = conversiones.get(opcion);
        if(monedas == null){
            return "Opción inválida.";
        }

        TipoDeCambio resultado = consulta.buscarTipoCambio(monedas[0],monedas[1],cantidadDivisa);
        return String.format("El valor de %.2f [%s] corresponde a %.2f[%s]",
                cantidadDivisa,monedas[0],resultado.conversion_result(),monedas[1]);
    }


}
