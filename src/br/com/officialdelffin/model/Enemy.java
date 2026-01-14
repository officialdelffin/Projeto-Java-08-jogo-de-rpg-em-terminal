package br.com.officialdelffin.model;

// Classe que define os atributos e métodos do adversario :
public class Enemy {


    // Atributos :

    // Dados do rival :
    private String nome  = "";
    private int vida     = 0;
    private int dano     = 0;
    private int defesa   = 0;


    // Métodos :

    // Cria o rival com base nos dados informados :
    public void criaRival (


            // Parametros do rival
            String nomeP,
            int vidaP,
            int danoP,
            int defesaP


    ) {


        // Armazenando parametros dentro dos atributos do rival :
        nome = nomeP;
        vida = vidaP;
        dano = danoP;
        defesa = defesaP;



    }


    // Métodos que exibe dados do rival :

    // Exibir nome do personagem :
    public String getNome () {


        return nome;

    }


    // Exibir vida do personagem :
    public int getVida () {


        return vida;

    }


    // Exibir dano do personagem :
    public int getDano () {


        return dano;

    }


    // Exibir defesa do personagem :
    public int getDefesa () {


        return defesa;

    }



}
