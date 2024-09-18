import br.com.alura.Desafio.modelos.Musica;

public class Principal {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setNome("O Sapo não lava o pé");
        musica1.setGenero("Infantil");
        musica1.setDuracaoMinutos(300);
        musica1.setArtista("Publica");
        musica1.setAlbum("Album público");
        for (int i = 0; i < 300; i++) {
            musica1.curtir();
        }
        for (int i = 0; i < 350; i++) {
            musica1.reproduz();
        }
        exibeInformacoes(musica1);

        Musica musica2 = new Musica();
        musica2.setNome("Caneta azul");
        musica2.setGenero("Sertanejo");
        musica2.setDuracaoMinutos(350);
        musica2.setArtista("Manuel Gomes");
        musica2.setAlbum("Album Sofrencia");

        for (int i = 0; i < 500; i++) {
            musica2.curtir();
        }
        for (int i = 0; i < 650; i++) {
            musica2.reproduz();
        }
        exibeInformacoes(musica2);

        Musica musica3 = new Musica();
        musica3.setNome("In the End");
        musica3.setGenero("Rock");
        musica3.setDuracaoMinutos(430);
        musica3.setArtista("Linkin Park");
        musica3.setAlbum("In the End");

        for (int i = 0; i < 1000; i++) {
            musica3.curtir();
        }
        for (int i = 0; i < 978; i++) {
            musica3.reproduz();
        }

        exibeInformacoes(musica3);
    }
    public static void exibeInformacoes(Musica musica){
        System.out.println("Música: "+musica.getNome());
        System.out.println("Duração(m): "+musica.getDuracaoMinutos());
        System.out.println("Álbum: "+musica.getAlbum());
        System.out.println("Gênero: "+musica.getGenero());
        System.out.println("Reproduzida "+musica.getTotalReproducoes()+" vezes");
        System.out.println("Total Curtidas: "+musica.getCurtidas());
        System.out.println(musica.classifica()+" Estrelas");
        System.out.println();

    }
}
