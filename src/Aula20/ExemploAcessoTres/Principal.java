package Aula20.ExemploAcessoTres;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ana","123",10);
        System.out.println("Conta cadastrada com ID: "+c1.identificador);
        Conta c2 = new Conta("Jose","345",100);
        System.out.println("Conta cadastrada com ID: "+c2.identificador);

    }
}
