/* Projeto : Jogo de RPG em terminal

Esse projeto foi desenvolvido para consolidar conceitos do curso de Java com Orientação a Objetos.
O projeto se trata de um jogo de RPG feito no terminal onde o usuário joga através do terminal. Nesse Jogo é possível o usuário criar o seu persongem e nele vai ter um sistema de RPG de turno, onde é possível
efetuar ataque, se curar e envenenar o adiversário. */


import java.sql.SQLOutput;
import java.util.Scanner;


// Class
public class Main {


    public static void main( String[] args ) {


        // Instanciando o objeto de input do usuário :
        Scanner inputUsuario = new Scanner( System.in );


        // Instanciando o objeto personagem :
        Player personagem = new Player();


        // Texto de apresentação :
        System.out.println( "Seja bem-vindo ao meu jogo de RPG" );


        // Texto que pede para criadar o personagem :
        System.out.println( "Antes de começar o game vamos criar o seu personsagem. Me informe qual o nome do seu personagem" );


        // Armazenando nome do personagem :
        personagem.nome = inputUsuario.nextLine();


        // Texto que pede para o usuário escolher a classe do personagem :
        System.out.println( "Me informe a classe do personagem entre Espadachim - Guerreiro" );
        System.out.println( "Digite 1 para escolher a classe de Espadachim" );
        System.out.println( "Digite 2 para escolher a classe de Guerreiro" );


        // Armazenando classe do personagem :
        personagem.classe = inputUsuario.nextInt();


        // Chamando metodo que distribui os pontos com base  na classe :
        personagem.distribuiClasse();


    }


}