import com.sun.source.tree.UsesTree;

import java.time.LocalDate;

public class Artista {
    private String nome;
    private LocalDate dataDeNascimento;
    private String premiacao;
    private String genero;

    public Artista(
            String nome,
            LocalDate dataDeNascimento,
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
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
