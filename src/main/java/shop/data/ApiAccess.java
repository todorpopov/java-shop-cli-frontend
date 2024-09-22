package shop.data;

import java.util.ArrayList;

import io.github.cdimascio.dotenv.Dotenv;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import shop.data.dtos.ShopDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ApiAccess {
    private static ApiAccess instance;
    String apiUri;

    private ApiAccess() {
        apiUri = Dotenv.load().get("API");
    }

    public static ApiAccess getInstance()
    {
        if(instance == null) {
            instance = new ApiAccess();
        }
        return instance;
    }

    public ArrayList<ShopDTO> getAllShops() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(this.apiUri + "/api/shops/get/all"))
            .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    
        Gson gson = new Gson();
        ArrayList<ShopDTO> shopDtos = gson.fromJson(response.body(), new TypeToken<ArrayList<ShopDTO>>(){}.getType());
        return shopDtos;
    }
}
