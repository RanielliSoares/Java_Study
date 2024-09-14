public class Main {
    public static void main(String[] args) {

        int anoTopGun = 2022;
        double notaTopGun = 8.1;
        boolean incluidoPlano = true;
        String sinopse;
        sinopse = "A escola naval de pilotos é onde o melhor dos melhores treinam para refinar suas habilidades de voo de elite. Quando o piloto Maverick é enviado para a escola, sua atitude irresponsável e comportamento arrogante o colocam em desacordo com os outros pilotos, especialmente Iceman.";
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maveric");
        System.out.println("Ano de Lançamento: " + anoTopGun);
        System.out.println("Nota do filme: " + notaTopGun);
        System.out.println("Sinopse: "+sinopse);

        if (!incluidoPlano) {
            System.out.println("Este filme não está incluido no plano");
        } else {
            System.out.println("Este filme está incluido no plano");
        }

    }
}