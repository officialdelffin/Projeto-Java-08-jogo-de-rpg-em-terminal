/* Projeto : Jogo de RPG em terminal

Esse projeto foi desenvolvido para consolidar conceitos do curso de Java com Orientação a Objetos.
O projeto se trata de um jogo de RPG feito no terminal onde o usuário joga através do terminal. Nesse Jogo é possível o usuário criar o seu persongem e nele vai ter um sistema de RPG de turno, onde é possível
efetuar ataque, se curar e envenenar o adiversário. */


import br.com.officialdelffin.model.Player;
import java.util.Scanner;


// Class
public class Main {


    public static void main( String[] args ) {


        // Instanciando o objeto personagem :
        Player personagem = new Player();


        // Texto de apresentação :
        System.out.println( "Seja bem-vindo ao meu jogo de RPG \n" );


        // Chamando o metodo para cria o personagem e distribuir pontos com base na classe :
        personagem.criaPersonagem();


        // Texto com breve história e introdução ao combate :
        System.out.printf("""
                
                O silêncio da noite é quebrado apenas pelo som dos seus passos. Nas tabernas, todos já ouviram falar de %s, mas poucos acreditam que as lendas sejam reais.

                Enquanto você atravessa o vale, a temperatura cai bruscamente e uma névoa densa bloqueia o caminho. De repente, uma silhueta colossal de cinco metros de altura se materializa à sua
                frente. As sombras se retorcem formando garras e asas: é o Demônio das Sombras.
                
                O monstro solta um rugido que faz a terra tremer. %s, desembainhe sua arma! Não há mais volta, o combate por turnos começa agora!
                
                """ ,  personagem.getNome() , personagem.getNome() );


    }


}