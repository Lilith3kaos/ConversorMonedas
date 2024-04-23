import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {

    public MonedaExchange buscaMoneda(String tipoDeCambio){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7f7e478940e0fbd7e8c11ec/latest/"+ tipoDeCambio);
//        System.out.println("**" + direccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),MonedaExchange.class);

        } catch (Exception e) {
            throw new RuntimeException("***ERROR***" +e);
        }


    }

}

