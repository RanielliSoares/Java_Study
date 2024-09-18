package br.com.alura.Desafio.modelos;

public class Musica extends Audio implements Classificacao{

    private String album;
    private String artista;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int classifica() {
        if (this.getCurtidas() >= 800){
            return 5;
        } else if (this.getCurtidas() < 800 && this.getCurtidas() >= 500) {
            return 4;
        }else {
            return 3;
        }
    }
}
