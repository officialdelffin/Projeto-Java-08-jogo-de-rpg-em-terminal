package br.com.officialdelffin.model;

// Classe que é responsável pelos métodos de batalha :
public class Battle {


    // Atributos :

    // Atributos do personagem :
    String nomePersonagem  = "";
    int vidaPersonagem     = 0;
    int danoPersonagem     = 0;
    int defesaPersonagem   = 0;


    // Atributos do rival :
    String nomeRival  = "";
    int vidaRival     = 0;
    int danoRival     = 0;
    int defesaRival   = 0;


    // Métodos :

    // Metodo responsável por fazer a execução da batalha :
    public void executaBatalha(


            // Parametros do personagem :
            String nomePersonagemP,
            int vidaPersonagemP,
            int danoPersonagemP,
            int defesaPersonagemP,


            // Parametros do rival :
            String nomeRivalP,
            int vidaRivalP,
            int danoRivalP,
            int defesaRivalP


    ) {


        // Atribuindo parametros com as variáveis :
        nomePersonagem    = nomePersonagemP;
        vidaPersonagem    = vidaPersonagemP;
        danoPersonagem    = danoPersonagemP;
        defesaPersonagem  = defesaPersonagemP;
        nomeRival         = nomeRivalP;
        vidaRival         = vidaRivalP;
        danoRival         =danoRivalP;
        defesaRival       = defesaRivalP;


    }


}
