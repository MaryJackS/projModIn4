

public class Ator extends Artista{
//    atributos
    private String formacao;
//    construtor
    public Ator(String formacao,
                String nome,
                String dataDeNascimento,
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
//     Setters e Getters
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
