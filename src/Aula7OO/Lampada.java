package Aula7OO;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    String local;
    boolean estaLigada;

    void ligar() {
        estaLigada = true;
    }

    void desligar(){
    estaLigada = false;
    }

    String obterInformacoes(){
        return "Marca: "+marca+"Modelo: "+modelo+"Instalada em:"+local;
    }


    String estaLigada(){
        return estaLigada? "sim":"não";
    }
}



