package auth;

import interfaces.*;

public class ApiKeyAuth implements AutenticacaoStrategy {
    private String apiKey;

    public ApiKeyAuth(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticado com API Key: " + apiKey.substring(0, 5) + "...");
    }
}

