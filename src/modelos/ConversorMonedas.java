package modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMonedas {

    public static Conversion iniciarConversion() {

        String menu = """
                
                
                Bienvenido@ al conversor de monedas
                                
                Usarlo es en definitiva simple, solo debes...
                Ingresar la moneda base (en formato de tres letras mayúsculas) y
                en seguida la moneda objetivo (en formato de tres letras mayúsculas).
                 - Por ejemplo: 'MXN' a 'USD'

                Consulta la lista de códigos de moneda en: https://www.exchangerate-api.com/docs/supported-currencies
                
                
                """;


        Scanner sc = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("Ingresa la moneda base: ");
        String monedaBase = sc.nextLine();
        System.out.println("Ingresa la moneda objetivo: ");
        String monedaObjetivo = sc.nextLine();

        String direccion = String.
                format("https://v6.exchangerate-api.com/v6/d07b37842df0fc0e7f1f340e/pair/%s/%s", monedaBase, monedaObjetivo);

        // Establecer el cliente para método predeterminado GET y HTTP/2
        HttpClient cliente = HttpClient.newHttpClient();

        // Construir la petición (request) mediante el patrón de diseño Builder
        HttpRequest peticion = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

        try {

            // Enviar la petición mediante el cliente
            HttpResponse respuesta = cliente
                    .send(peticion, HttpResponse.BodyHandlers.ofString());

            // Estandarizando la respuesta
            String json = String.valueOf(respuesta.body()).replace("conversion_rate", "conversionRate").
                    replace("base_code", "baseCode").
                    replace("target_code", "targetCode");

            Conversion conversion = gson.fromJson(json, Conversion.class);

            if(conversion.baseCode()==null){
                return null;
            }

            return conversion;

        } catch (IOException e) {
            e.getMessage();
        } catch (InterruptedException e) {
            e.getMessage();
        }

        return null;
    }

}
