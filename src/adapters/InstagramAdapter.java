package adapters;

import interfaces.AutenticacaoStrategy;
import interfaces.PlataformaMidiaSocial;
import models.Conteudo;
import models.Estatisticas;
import java.util.Map;

public class InstagramAdapter implements PlataformaMidiaSocial {
    private AutenticacaoStrategy auth;

    public InstagramAdapter(AutenticacaoStrategy auth) {
        this.auth = auth;
    }

    @Override
    public void autenticar() {
        auth.autenticar();
    }

    @Override
    public void publicar(Conteudo conteudo) {
        System.out.println("Post no Instagram: " + conteudo);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(Map.of("curtidas", 340, "comentarios", 22));
    }
}
