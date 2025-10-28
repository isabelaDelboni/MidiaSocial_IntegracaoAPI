package adapters;

import interfaces.AutenticacaoStrategy;
import interfaces.PlataformaMidiaSocial;
import models.Conteudo;
import models.Estatisticas;
import java.util.Map;

public class LinkedInAdapter implements PlataformaMidiaSocial {
    private AutenticacaoStrategy auth;

    public LinkedInAdapter(AutenticacaoStrategy auth) {
        this.auth = auth;
    }

    @Override
    public void autenticar() {
        auth.autenticar();
    }

    @Override
    public void publicar(Conteudo conteudo) {
        System.out.println("Publicação no LinkedIn: " + conteudo);
    }

    @Override
    public Estatisticas obterEstatisticas() {
        return new Estatisticas(Map.of("visualizações", 1020, "engajamento", 80));
    }
}
