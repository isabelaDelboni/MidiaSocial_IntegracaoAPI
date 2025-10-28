package interfaces;

import models.Conteudo;
import models.Estatisticas;

public interface PlataformaMidiaSocial {
    void autenticar();
    void publicar(Conteudo conteudo);
    Estatisticas obterEstatisticas();
}
