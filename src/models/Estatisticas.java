package models;

import java.util.Map;

public class Estatisticas {
    private Map<String, Integer> dados;

    public Estatisticas(Map<String, Integer> dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        dados.forEach((k, v) -> builder.append(k).append(": ").append(v).append(" | "));
        return builder.toString();
    }
}
