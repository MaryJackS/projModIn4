import java.time.LocalDate;

public class Midia {
    private String titulo;
    private LocalDate ano;
    private String genero_fem;
    private String genero_masc;
    private String genero_nao_binario;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getGenero_fem() {
        return genero_fem;
    }

    public void setGenero_fem(String genero_fem) {
        this.genero_fem = genero_fem;
    }

    public String getGenero_masc() {
        return genero_masc;
    }

    public void setGenero_masc(String genero_masc) {
        this.genero_masc = genero_masc;
    }

    public String getGenero_nao_binario() {
        return genero_nao_binario;
    }

    public void setGenero_nao_binario(String genero_nao_binario) {
        this.genero_nao_binario = genero_nao_binario;
    }
}
