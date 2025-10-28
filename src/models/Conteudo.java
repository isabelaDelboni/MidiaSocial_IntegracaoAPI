package models;

public class Conteudo {
    private String texto;
    private String midia;

    public Conteudo(String texto, String midia) {
        this.texto = texto;
        this.midia = midia;
    }

    public Conteudo(String texto) {
        this(texto, null);
    }

    @Override
    public String toString() {
        return texto + (midia != null ? " " : "");
    }
}
