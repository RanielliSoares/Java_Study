import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(3500);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Pessoas que avaliaram o filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Avaliação: " + meuFilme.pegaMedia());


        Serie Lost = new Serie();
        Lost.setNome("Lost");
        Lost.setTemporadas(11);
        Lost.setEpisodiosPorTemporada(20);
        Lost.setMinutosPorEpisodio(300);
        Lost.setAtiva(true);
        Lost.setAnoDeLancamento(2006);

        Lost.exibeFichaTecnica();
        System.out.println(Lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Harry Potter");
        meuFilme2.setAnoDeLancamento(2017);
        meuFilme2.setIncluidoNoPlano(true);
        meuFilme2.setDuracaoEmMinutos(1000);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(Lost);

        System.out.println(calculadora.getTempoTotal());
    }
}