package Aula20;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ana","123",10);
        System.out.println("Conta cadastrada com ID: "+c1.identificador);
        Conta c2 = new Conta("Jos","345",100);
        System.out.println("Conta cadastrada com ID: "+c2.identificador);
        //testando o atributi estático
        c1.nomeBanco = "Banco CIMOL";
        System.out.println("Nome do banco c1 "+c1.nomeBanco);
        System.out.println("Nome do banco c2 "+c2.nomeBanco);

    }
}
