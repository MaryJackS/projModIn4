

public class Musica extends Midia {
    private double duracao;
    private int notas;
    private String artista;

    public Musica(
            double duracao,
            int notas,
            String artista,
            String titulo,
            String ano,
            String genero
           )
    {

        super(
                titulo,
                ano,
                genero);

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

    public int getNotas() {
        switch (notas){
            case 1:
                System.out.println("1 estrela");
                break;
            case 2:
                System.out.println("2 estrela");
                break;
            case 3:
                System.out.println("3 estrela");
                break;
            case 4:
                System.out.println("4 estrela");
                break;
            case 5:
                System.out.println("5 estrela");
                break;

        }
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

}
