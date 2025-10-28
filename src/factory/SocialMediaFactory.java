package factory;

import interfaces.AutenticacaoStrategy;
import adapters.*;

public class SocialMediaFactory {

    public static Object criarAdapter(String nome, AutenticacaoStrategy auth) {
        switch (nome.toLowerCase()) {
            case "twitter":
                return new TwitterAdapter(auth);
            case "instagram":
                return new InstagramAdapter(auth);
            case "linkedin":
                return new LinkedInAdapter(auth);
            case "tiktok":
                return new TikTokAdapter(auth);
            default:
                throw new IllegalArgumentException("Plataforma '" + nome + "' não suportada.");
        }
    }
}
