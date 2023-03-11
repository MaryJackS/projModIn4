import java.time.LocalDate;

public class Ator extends Artista{
    private String formacao;

    public Ator(String formacao,
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
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
