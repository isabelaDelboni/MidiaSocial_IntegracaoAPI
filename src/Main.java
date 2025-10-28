import interfaces.*;
import factory.SocialMediaFactory;
import core.GerenciadorMidiaSocial;
import models.Conteudo;
import auth.*;

public class Main {
    public static void main(String[] args) {
        Conteudo conteudo = new Conteudo("Lançamos o novo curso sobre como não desistir da Facul!!!");

        PlataformaMidiaSocial twitter = (PlataformaMidiaSocial)
                SocialMediaFactory.criarAdapter("twitter", new TokenAuth("tok12345"));
        PlataformaMidiaSocial insta = (PlataformaMidiaSocial)
                SocialMediaFactory.criarAdapter("instagram", new ApiKeyAuth("api98765"));
        PlataformaMidiaSocial linkedin = (PlataformaMidiaSocial)
                SocialMediaFactory.criarAdapter("linkedin", new TokenAuth("abcde123"));
        PlataformaMidiaSocial tiktok = (PlataformaMidiaSocial)
                SocialMediaFactory.criarAdapter("tiktok", new OAuthAuth("isa.dev"));

        GerenciadorMidiaSocial gerenciador = new GerenciadorMidiaSocial();
        gerenciador.adicionarPlataforma(twitter);
        gerenciador.adicionarPlataforma(insta);
        gerenciador.adicionarPlataforma(linkedin);
        gerenciador.adicionarPlataforma(tiktok);

        gerenciador.publicarEmTodas(conteudo);
    }
}
