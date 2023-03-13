import java.util.ArrayList;
import java.util.Collections;

public class Playlist{

    //Atributos
    private String nome;
    private ArrayList<Midia> lista_midia;
    private int indice_midia_atual;

    //Contrutor
    public Playlist(String nome){
        this.nome = nome;
        lista_midia = new ArrayList<Midia>();
        indice_midia_atual = 0;
    }
    //    Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Midia> getListaMidia() {
        return lista_midia;
    }

    public void setListaMidia(ArrayList<Midia> listaMidia) {
        this.lista_midia = listaMidia;
    }

    public int getIndice_midia_atual() {
        return indice_midia_atual;
    }

    public void setIndice_midia_atual(int indice_midia_atual) {
        this.indice_midia_atual = indice_midia_atual;
    }

    //    Métodos
    public void adicionar_midia(Midia midia){
        lista_midia.add(midia);
    }

    public void remover_midia(Midia midia){
        lista_midia.remove(midia);
    }

    public void prox_midia(){
        if(indice_midia_atual < lista_midia.size() - 1){
            indice_midia_atual++;
        } else {
            indice_midia_atual = 0;
        }
    }

    public void voltar_midia(){

        if (indice_midia_atual > 0){
            indice_midia_atual--;
        } else {
            indice_midia_atual = lista_midia.size() - 1;
        }
    }

    public void misturar_midias(){
        Collections.shuffle(lista_midia);
        indice_midia_atual = 0;
    }



}
