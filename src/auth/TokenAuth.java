package auth;

import interfaces.*;

public class TokenAuth implements AutenticacaoStrategy {
    private String token;

    public TokenAuth(String token) {
        this.token = token;
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticado com token: " + token.substring(0, 5) + "...");
    }
}
