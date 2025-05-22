import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Presentacion textoMenu = new Presentacion();
        int busqueda = 0;
        double valorACambiar = 0;
        String monedaPrincipal = "USD";
        String monedaDeCambio = "COP";
        while (busqueda != 7){
            try {
                Presentacion.exibirMenu();
                busqueda = Integer.valueOf(lectura.nextLine());
                switch (busqueda){
                    case 1:
                        monedaPrincipal = "USD";
                        monedaDeCambio = "ARS";
                        break;
                    case 2:
                        monedaPrincipal = "ARS";
                        monedaDeCambio = "USD";
                        break;
                    case 3:
                        monedaPrincipal = "USD";
                        monedaDeCambio = "BRL";
                        break;
                    case 4:
                        monedaPrincipal = "BRL";
                        monedaDeCambio = "USD";
                        break;
                    case 5:
                        monedaPrincipal = "USD";
                        monedaDeCambio = "COP";
                        break;
                    case 6:
                        monedaPrincipal = "COP";
                        monedaDeCambio = "USD";
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema, gracias por utilizar el conversor de moneda");
                        break;
                    default:
                        System.out.println("Valor numerico no valido detectado, intente con un valor entero del 1 al 7!");
                }
                if(busqueda != 7 && busqueda < 8) {
                    String direccion = "https://v6.exchangerate-api.com/v6/2e665ce5788c722d7e9cd6f8/latest/"  + monedaPrincipal;
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(direccion))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    ConversorMoneda conversorMoneda = gson.fromJson(json, ConversorMoneda.class);
                    double rate = conversorMoneda.conversion_rates().get(monedaDeCambio).getAsDouble();
                    System.out.println("Ingrese valor "  + monedaPrincipal + " a convertir");
                    valorACambiar = Double.valueOf(lectura.nextLine());
                    double valorFinal = valorACambiar * rate;
                    System.out.println("el valor " + valorACambiar + " " + monedaPrincipal + " es igual a " + valorFinal + " " + monedaDeCambio);


                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }catch (NumberFormatException e){
                System.out.println("Valor no numerico detectado, intente con un valor numerico");
            }
        }




// Convert to JSON


// Accessing object



    }
}
