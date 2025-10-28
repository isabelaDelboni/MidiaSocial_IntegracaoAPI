package core;

import interfaces.PlataformaMidiaSocial;
import models.Conteudo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorMidiaSocial {
    private List<PlataformaMidiaSocial> plataformas = new ArrayList<>();

    public void adicionarPlataforma(PlataformaMidiaSocial plataforma) {
        plataformas.add(plataforma);
    }

    public void publicarEmTodas(Conteudo conteudo) {
        for (PlataformaMidiaSocial p : plataformas) {
            p.autenticar();
            p.publicar(conteudo);
            System.out.println("Estatísticas: " + p.obterEstatisticas());
            System.out.println("------------------------------------");
        }
    }
}
