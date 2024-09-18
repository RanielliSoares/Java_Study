package br.com.alura.Desafio.modelos;

public class Audio {
    private String nome;
    private int duracaoMinutos;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getNome() {
        return nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

   public void reproduz(){
        this.totalReproducoes ++;
   }
   public void curtir(){
        this.curtidas++;
   }


}
