public class Filme extends Midia{
    private double duracao;
    private String tipo_curto;
    private String tipo_longa;
    private String[] elenco;
    private String diretor;
    private String produtor;

    public Filme(double duracao, String tipo_curto, String tipo_longa, String[] elenco, String diretor, String produtor){
        this.duracao = duracao;
        this.tipo_curto = tipo_curto;
        this.tipo_longa = tipo_longa;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo_curto() {
        return tipo_curto;
    }

    public void setTipo_curto(String tipo_curto) {
        this.tipo_curto = tipo_curto;
    }

    public String getTipo_longa() {
        return tipo_longa;
    }

    public void setTipo_longa(String tipo_longa) {
        this.tipo_longa = tipo_longa;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}
