package br.com.officialdelffin.model;

// Importações necessárias :
import java.util.Scanner;

// Classe que define os atributos e métodos do player :
public class Player {

    // Objetos usados na classe :

    // Criando objeto que permite que o usuário faça input pelo terminal :
    Scanner inputUsuario = new Scanner( System.in );


    // Atributos :

    // Dados do player :
    private String nome  = "";
    private int classe   = 0;
    private int vida     = 0;
    private int dano     = 0;
    private int defesa   = 0;



    // Métodos :

    // Classe que cria o personagem :
    public void criaPersonagem () {



        // Texto que pede para criadar o personagem :
        System.out.println( "Antes de começar o game vamos criar o seu personsagem. Me informe qual o nome do seu personagem \n" );


        // Armazenando nome do personagem :
        nome = inputUsuario.nextLine();
        System.out.println( " " );


        // Texto que pede para o usuário escolher a classe do personagem :
        System.out.println( "Me informe a classe do personagem entre Espadachim - Guerreiro \n" );
        System.out.println( "Digite 1 para escolher a classe de Espadachim" );
        System.out.println( "Digite 2 para escolher a classe de Guerreiro \n" );


        // Armazenando classe do personagem :
        classe = inputUsuario.nextInt();


        // Chamando metodo que distribui os pontos com base  na classe :
        distribuiClasse();

        exibeDados();


    }


    // Verifica e distribui pontos com base na classe :
    private void distribuiClasse () {


        // Se a classe for Espadachim :
        if ( classe == 1 ) {


            // Distribuindo pontos :
            vida    = 70;
            dano    = 50;
            defesa  = 30;

        }


        // Se a classe for Guerreiro :
        else if ( classe == 2 ) {


            // Distribuindo pontos :
            vida    = 100;
            dano    = 30;
            defesa  = 30;


        }


    }


    // Faz a exibição os dados do player :
    private void exibeDados () {


        // Exibe os dados
        System.out.printf( """
                
                Distribuição de pontos :
                
                Nome   : %s
                Vida   : %d
                Dano   : %d
                Defesa : %d
                
                """ , nome , vida , dano , defesa );


    }


    // Exibir nome do personagem :
    public String getNome () {


        return nome;

    }


}
