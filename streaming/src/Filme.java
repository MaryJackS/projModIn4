

public class Filme extends Midia {
    private double duracao;
    private String tipo;
    private String[] elenco;
    private String diretor;
    private String produtor;


    public Filme(
            double duracao,
            String tipo,
            String[] elenco,
            String diretor,
            String produtor,
            String titulo,
            String ano,
            String genero)
    {

        super(
                titulo,
                ano,
                genero);

        this.duracao = duracao;
        this.tipo = tipo;
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

    public String getTipo() {
        if (duracao < 60){
            System.out.println(" Curta metragem ");
        }else {
            System.out.println(" Longa duração ");
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
