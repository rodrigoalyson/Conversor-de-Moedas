package ConversorDeMoedasAlysonRodrigo;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaTaxaCambio {

    public TaxaCambio buscaTaxaCambio(String moedaBase, String moedaConvertida, float valorTotal) {

        // URI EXEMPLO PARA SABER A TAXA: https://v6.exchangerate-api.com/v6/844ea9317766cd165c68d010/pair/USD/EUR
        // URI EXEMPLO PARA COLOCAR QUALQUER VALOR: https://v6.exchangerate-api.com/v6/844ea9317766cd165c68d010/pair/USD/EUR/10

        URI taxaSite = URI.create("https://v6.exchangerate-api.com/v6/844ea9317766cd165c68d010/pair/" + moedaBase + "/" + moedaConvertida + "/" + valorTotal);

        //LINHA DE BAIXA ELIMINADA, POIS JA ESTAMOS FAZENDO ISSO NA LINHA27
        //HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(taxaSite)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), TaxaCambio.class);

        } catch (Exception e) {
            throw new RuntimeException("Código não encontrado");
        }

    }

}
