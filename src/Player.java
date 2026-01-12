

// Classe que define os atributos e métodos do player :
public class Player {


    // Atributos :
    String nome  = "";
    int classe   = 0;
    int vida     = 0;
    int dano     = 0;
    int defesa   = 0;


    // Verifica e distribui pontos com base na classe :
    public void distribuiClasse () {


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


}
