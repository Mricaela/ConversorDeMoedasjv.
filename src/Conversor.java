import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Arrays;
import java.util.List;

public class Conversor {

    public double converter(String json, String moedaDestino, double valor) throws Exception {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject taxas = jsonObject.getAsJsonObject("conversion_rates");

        if (!taxas.has(moedaDestino)) {
            throw new Exception("Moeda de destino não encontrada.");
        }

        List<String> moedasPermitidas = Arrays.asList("ARS", "BOB", "BRL", "CLP", "COP", "USD");

        if (!moedasPermitidas.contains(moedaDestino)) {
            throw new Exception("Moeda não permitida para conversão.");
        }

        double taxa = taxas.get(moedaDestino).getAsDouble();
        return calcularConversao(valor, taxa);
    }

    public double calcularConversao(double valor, double taxa) {
        return valor * taxa;
    }

    public double obterTaxa(String json, String moedaDestino) throws Exception {
        JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
        JsonObject rates = obj.getAsJsonObject("conversion_rates");

        if (!rates.has(moedaDestino)) {
            throw new Exception("Moeda destino não encontrada: " + moedaDestino);
        }

        return rates.get(moedaDestino).getAsDouble();
    }


}

