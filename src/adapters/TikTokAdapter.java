package adapters;

import interfaces.AutenticacaoStrategy;
import interfaces.PlataformaMidiaSocial;
import models.Conteudo;
import models.Estatisticas;
import java.util.Map;

public class TikTokAdapter implements PlataformaMidiaSocial {
    private AutenticacaoStrategy auth;

    public TikTokAdapter(AutenticacaoStrategy auth) {
        this.auth = auth;
    }

    @Override
    public void autenticar() {
        auth.autenticar();
    }

    @Override
    public void publicar(Conteudo conteudo) {
        System.out.println("Vídeo postado no TikTok: " + conteudo);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(Map.of("views", 3500, "curtidas", 540, "compartilhamentos", 48));
    }
}
