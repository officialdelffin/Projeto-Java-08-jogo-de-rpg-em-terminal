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
        System.out.println( "Seja bem-vindo ao meu jogo de RPG \n" );


        // Texto que pede para criadar o personagem :
        System.out.println( "Antes de começar o game vamos criar o seu personsagem. Me informe qual o nome do seu personagem \n" );


        // Armazenando nome do personagem :
        personagem.nome = inputUsuario.nextLine();
        System.out.println( " " );


        // Texto que pede para o usuário escolher a classe do personagem :
        System.out.println( "Me informe a classe do personagem entre Espadachim - Guerreiro \n" );
        System.out.println( "Digite 1 para escolher a classe de Espadachim" );
        System.out.println( "Digite 2 para escolher a classe de Guerreiro \n" );


        // Armazenando classe do personagem :
        personagem.classe = inputUsuario.nextInt();


        // Chamando metodo que distribui os pontos com base  na classe :
        personagem.distribuiClasse();


        // Verificando se a distribuição foi feita corretamente :
        System.out.printf("""
                
                Distribuição de pontos :
                
                Nome   : %s
                Vida   : %d
                Dano   : %d
                Defesa : %d
                
                """ , personagem.nome , personagem.vida , personagem.dano , personagem.defesa );


        // Texto com breve história :
        System.out.printf("""
                
                O silêncio da noite é quebrado apenas pelo som dos seus passos. Nas tabernas, todos já ouviram falar de %s, mas poucos acreditam que as lendas sejam reais.
                
                Enquanto você atravessa o vale, a temperatura cai bruscamente e uma névoa densa bloqueia o caminho. De repente, uma silhueta colossal de cinco metros de altura se materializa à sua frente. As sombras se retorcem formando garras e asas: é o Demônio das Sombras.
                
                O monstro solta um rugido que faz a terra tremer. %s, desembainhe sua arma! Não há mais volta, o combate por turnos começa agora!
                
                """ ,  personagem.nome , personagem.nome );


    }


}