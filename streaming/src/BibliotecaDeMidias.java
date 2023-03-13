import java.util.ArrayList;

public class BibliotecaDeMidias{
    //    Atributos
        private String usuario;
        private ArrayList<Playlist> playlist;

        private ArrayList<Midia> midiaItens;

//    Construtor

        public BibliotecaDeMidias(String usuario) {
            this.usuario = usuario;
            playlist = new ArrayList<Playlist>();
            midiaItens = new ArrayList<Midia>();
        }

        //    Setters e Getters
        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public ArrayList<Playlist> getPlaylist() {
            return playlist;
        }

        public void setPlaylist(ArrayList<Playlist> playlist) {
            this.playlist = playlist;
        }

        public ArrayList<Midia> getMidiaItens() {
            return midiaItens;
        }

        public void setMidiaItens(ArrayList<Midia> midiaItens) {
            this.midiaItens = midiaItens;
        }


        //    Métodos
        public void tocar_playlist(ArrayList<Playlist> playlist){
            System.out.println("Tocando playlist: " + playlist);
        }

        public void adicione_item_midia(Midia midia) {
            midiaItens.add(midia);
        }

        public void remova_item_midia(Midia midia) {
            midiaItens.remove(midia);
        }

}
