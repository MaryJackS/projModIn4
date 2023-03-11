import java.time.LocalDate;

public class Musico extends Artista{
    private String atuacao;

    public Musico(
            String atuacao,
            String nome,
            LocalDate dataDeNascimento,
            String premiacao,
            String genero)
    {
        super(
                nome,
                dataDeNascimento,
                premiacao,
                genero);

        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
