package com.alura.challenge.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    private final HttpClient client = HttpClient.newHttpClient();

    public TipoDeCambio buscarTipoCambio(String monedaBase, String monedaDestino, double montoACambiar){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2e5f80639dd2f6cd0dbbf675/pair/"
        + monedaBase + "/"
        + monedaDestino + "/"
        + montoACambiar);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoDeCambio.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    };
}
