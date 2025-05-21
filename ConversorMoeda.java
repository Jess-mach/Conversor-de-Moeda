import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class ConversorMoeda {
    public static final String KEY_VALUE = "XXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    // Setting URL
    static String url_str = "https://v6.exchangerate-api.com/v6/" + KEY_VALUE + "/latest/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        boolean continuar = true;

         while (continuar) {
             continuar = menuEscolha(scanner,continuar);
         }

        scanner.close();
    }

    private static boolean menuEscolha(Scanner scanner, boolean continuar) {
        System.out.println("----------------------------------------");
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1. Dólar para Real");
        System.out.println("2. Real para Dólar");
        System.out.println("3. Dólar para Peso Argentino");
        System.out.println("4. Peso Argentino para Dólar");
        System.out.println("5. Dólar para Peso Colombiano");
        System.out.println("6. Peso Colombiano para Dólar");
        System.out.println("7. Sair");
        System.out.println("-------------------------------------------");

        int opcao = scanner.nextInt();

        if (opcao == 7){
            System.out.println("****************************");
            System.out.println("Saindo do Conversor de Moeda!");
            System.out.println("*****************************");
            return false;
        }

        System.out.println("Informe o valor que deseja coverter:");
        String valorConverter = scanner.next();

        // Lógica para cada opção
        switch (opcao) {
            case 1: {
                // Dólar para Real

                String resultado = pegarFatorDeConversao("USD", "BRL");

                System.out.println("Valor em Real: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }
            case 2: {
                // Real para Dólar

                String resultado = pegarFatorDeConversao("BRL", "USD");

                System.out.println("Valor em Dólar: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }
            case 3: {
                // Dolar para Peso Argentino

                String resultado = pegarFatorDeConversao("USD", "ARS");

                System.out.println("Valor em Peso Argentino: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }
            case 4:{
                // Peso Argentino para Dólar

                String resultado = pegarFatorDeConversao("ARS", "USD");

                System.out.println("Valor em Dólar: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }
            case 5: {
                // Dólar para Peso Colombiano

                String resultado = pegarFatorDeConversao("USD", "COP");

                System.out.println("Valor em Peso Colombiano: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }
            case 6: {
                //Peso Colombiano para Dólar

                String resultado = pegarFatorDeConversao("COP", "USD");

                System.out.println("Valor em Dólar: " + Double.valueOf(resultado) * Double.valueOf(valorConverter));
                break;
            }

            default:
                System.out.println("Opção inválida!");
        }

        return continuar;
    }

    private static String pegarFatorDeConversao(String rate, String fator) {
        try {
            // Making Request
            URL url = new URL(url_str + rate);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing object
            String req_result = jsonobj.get("conversion_rates").getAsJsonObject().get(fator).getAsString();

            return req_result;
        } catch (Exception ex){
            return  "0";
        }
    }


}
