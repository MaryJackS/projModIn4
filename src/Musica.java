public class Musica extends Midia{
    private double duracao;
    private double notas;
    private String artista;
    public Musica(double duracao, double notas, String artista){
        this.duracao = duracao;
        this.notas = notas;
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
