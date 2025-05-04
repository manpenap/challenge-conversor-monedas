package com.alura.challenge.utils;

import com.alura.challenge.modelos.TipoDeCambio;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorHistorial {
    public void guardarConversiones(List<TipoDeCambio> listaDeConversiones) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter historial = new FileWriter( "historialConversiones.json");
        historial.write(gson.toJson(listaDeConversiones));
        historial.close();
    }
}
