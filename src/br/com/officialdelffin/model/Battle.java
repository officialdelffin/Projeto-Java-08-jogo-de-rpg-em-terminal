package br.com.officialdelffin.model;

import java.util.Scanner;

// Classe que é responsável pelos métodos de batalha :
public class Battle {


    // Instancias do objeto de input do usuário :
    Scanner inputUsuario = new Scanner( System.in );


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


    // Atributo da escolha do usuário :
    int escolhaUSuario = 0;


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


        // Exibir dados para ver se funcionou :
        System.out.println( "Nome do personagem : " + nomePersonagem );
        System.out.println( "Nome do rival : " + nomeRival );


        // Enquanto a vida do player ou a do inimigo for menor ou igual a zero ele vai rodar em loop:
        while ( vidaPersonagem > 0 && vidaRival > 0 ) {


            System.out.printf("""
                    
                    Vida do %s  : %d
                    Vida do %s  : %d
                    
                    
                    """ , nomePersonagem , vidaPersonagem , nomeRival , vidaRival );


            // Pedindo o usuário para escolher o que ele quer executar :
            System.out.printf("""
                    
                    Digite o número do que deseja fazer : 
                    
                    1 - Atacar
                    2 - Defender
                    3 - Curar
                    
                    """ );

            // Recebendo a escolha do usuário :


        }


    }


}
