import java.time.LocalDate;

public class Artista {
    private String nome;
    private LocalDate dataDeNascimento;
    private String premiacao;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
