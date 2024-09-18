package br.com.alura.Desafio.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
