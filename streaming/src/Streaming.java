import java.util.Scanner;

public class Streaming {
    public static void main(String[] args) {
//        Este objeto qualifica a nota em etrelas de acordo com sua preferência de "1 á 5 estrelas'
        Musica estrelas = new Musica(2.8,3,"capital","matriz","1990","pop");
        System.out.println(estrelas.getNotas());

        Musica musica1 = new Musica(2.1,4,"Nirvana","Nervermind","1991","rock");

        BibliotecaDeMidias minhaBiblioteca = new BibliotecaDeMidias("Lurdes");

        Playlist rock = new Playlist("rock");
        rock.adicionar_midia(musica1);

//       Este ojeto qualifica que tipo de metragem é o filme "se curta" ou "se longa" e um vetor de atores.
        Filme tipo = new Filme(90,"",new String[]{"Pedro","tiago","joao"},"Joaquim","juuh","capital","1990","masculino");
        System.out.println(tipo.getTipo());
        System.out.printf(tipo.getElenco()[2]);

//       Este objeto te dar a opção de escolha de atuação no terminal
        Musico atuacao = new Musico("" ,"pedro","10-10-2023","ouro","masc" );
        System.out.println(atuacao.getAtuacao() +" "+ atuacao.getNome());





    }


}