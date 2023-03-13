import com.sun.source.tree.UsesTree;

public class Artista {
//    atributos
    private String nome;
    private String dataDeNascimento;
    private String premiacao;
    private String genero;

//   construtor
    public Artista(
            String nome,
            String dataDeNascimento,
            String premiacao,
            String genero)
    {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.premiacao = premiacao;
        this.genero = genero;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
