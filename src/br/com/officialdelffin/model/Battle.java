package br.com.officialdelffin.model;

import java.util.Scanner;

// Classe que é responsável pelos métodos de batalha :
public class Battle {


    // Instancias do objeto de input do usuário :
    Scanner inputUsuario = new Scanner( System.in );


    // Atributos :

    // Atributos do personagem :
    private String nomePersonagem  = "";
    private int vidaPersonagem     = 0;
    private int danoPersonagem     = 0;
    private int defesaPersonagem   = 0;


    // Atributos do rival :
    private String nomeRival  = "";
    private int vidaRival     = 0;
    private int danoRival     = 0;
    private int defesaRival   = 0;


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



        // Enquanto a vida do player ou a do inimigo for menor ou igual a zero ele vai rodar em loop:
        while ( vidaPersonagem > 0 && vidaRival > 0 ) {



            // Mostrando status do personagem :
            System.out.printf("""
                    
                    Status da batalha :
                    
                    
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
            escolhaUSuario = inputUsuario.nextInt();


            // Se a escolha do usuário for 1 faça :
            if ( escolhaUSuario == 1 ) {


                // Colocando o efeito de defesa no dano do personagem :
                int restoDanoPersonagem = danoPersonagem - defesaRival;


                // Colocando o efeito de defesa no dano do personagem :
                int restoDanoRival = danoRival - defesaPersonagem;


                // Texto que avisa que o ataque foi para executado :
                System.out.printf("""
                        
                        %s atacou e causou %d de dano em %s 
                        
                        """ , nomePersonagem , restoDanoPersonagem , nomeRival );


                // Definindo a vida do rival após o ataque :
                vidaRival = vidaRival - restoDanoPersonagem;


                if ( vidaRival != 0 ) {


                    // Texto que avisa que o contra ataque do rival foi para executado :
                    System.out.printf("""
                        
                        %s contraatacou e causou %d de dano em %s 
                        
                        """ , nomeRival , restoDanoRival , nomePersonagem );


                    // Definindo a vida do rival após o ataque :
                    vidaPersonagem = vidaPersonagem - restoDanoRival;


                }


                // Se a vida do rival chegar a 0 ele não contraataca :
                else if ( vidaRival == 0 ) {


                    // Encerra o loop :
                    break;


                }


            }


            // Se a escolha do usuário for 2 faça :
            else if ( escolhaUSuario == 2 ) {}


            // Se a escolha do usuário for 3 faça :
            else if ( escolhaUSuario == 3 ) {}


        }


        // Se o personagem ganhar :
        if ( vidaRival <= 0 ) {


            // Exibe texto falando que o personagem :
            System.out.println( nomePersonagem + " derrotou " + nomeRival +  ". Vitória!" );



        }


        // Se o personagem perder :
        else if ( vidaPersonagemP <= 0 ) {


            // Exibe texto falando que o personagem :
            System.out.println( nomeRival + " derrotou " + nomePersonagem  + ". Derrota!" );


        }


    }


}
