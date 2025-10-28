package auth;

import interfaces.*;

public class OAuthAuth implements AutenticacaoStrategy {
    private String usuario;

    public OAuthAuth(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário " + usuario + " autenticado via OAuth.");
    }
}
