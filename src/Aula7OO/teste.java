package Aula7OO;

public class teste {
    public static void main(String[] args){
        Lampada l1 = new Lampada();
        l1.marca = "elgin";
        l1.modelo = "led";
        l1.local = "sala";
        l1.cor = "branca";

        System.out.println(l1.obterInformacoes());
        l1.ligar();
        System.out.println(l1.modelo+"está ligada?"+l1.estaLigada());
        l1.desligar();
        System.out.println(l1.modelo+"está ligada?"+l1.estaLigada());
    }
}
