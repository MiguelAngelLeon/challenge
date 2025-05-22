import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String direccion = "https://v6.exchangerate-api.com/v6/2e665ce5788c722d7e9cd6f8/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
            ConversorMoneda conversorMoneda = gson.fromJson(json, ConversorMoneda.class);
            System.out.println(conversorMoneda);

            double rate = conversorMoneda.conversion_rates().get("AED").getAsDouble();
            System.out.println(rate);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


// Convert to JSON


// Accessing object



    }
}
