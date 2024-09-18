package br.com.alura.screenmatch.calculo;

public class Recomendacao {
    public void filtro(Classificavel classificavel) {

        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Esta entre os bem avaliados do momento");

        } else {
            System.out.println("Colocar na lista de favoritos");
        }
    }
}

