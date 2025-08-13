import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequisicaoApi {

    public String buscarDadosDaAPI(String moedaBase) throws IOException, InterruptedException {
        String chave = "bd8cb553081e4a99bff78fb5";
        String url = "https://v6.exchangerate-api.com/v6/" + chave + "/latest/" + moedaBase;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}



