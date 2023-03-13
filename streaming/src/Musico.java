import java.util.Scanner;

public class Musico extends Artista{

    //Atributos
    private String atuacao;

    //Contrutor
    public Musico(
            String atuacao,
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

        this.atuacao = atuacao;
    }

    // Setters e Getters
    public String getAtuacao() {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("## Escolha uma das opções: ## ");
            System.out.println("Opção 1: instrumento");
            System.out.println("Opção 2: vocal");
            System.out.println("Opção 0: Sair do programa");

            System.out.print("Digite aqui sua apção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1){
                System.out.println("instrumento");
                sc.close();

            } else if (opcao == 2) {
                System.out.println("vocal");
                sc.close();

            }else {
                System.out.println("Escolha uma opcao");
                sc.close();
            }
        }
        while (opcao == 0);

        sc.close();

        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
