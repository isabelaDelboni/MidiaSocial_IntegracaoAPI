package adapters;

import interfaces.AutenticacaoStrategy;
import interfaces.PlataformaMidiaSocial;
import models.Conteudo;
import models.Estatisticas;
import java.util.Map;

public class TwitterAdapter implements PlataformaMidiaSocial {
    private AutenticacaoStrategy auth;

    public TwitterAdapter(AutenticacaoStrategy auth) {
        this.auth = auth;
    }

    @Override
    public void autenticar() {
        auth.autenticar();
    }

    @Override
    public void publicar(Conteudo conteudo) {
        System.out.println("Tweet publicado: " + conteudo);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(Map.of("likes", 120, "retweets", 15));
    }
}
