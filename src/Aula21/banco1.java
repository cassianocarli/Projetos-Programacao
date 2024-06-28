package Aula21;

import java.util.Random;
import java.util.Scanner;
public class banco1 {
    String titular;
    String id;
    String senha;
    float saldo;

    public static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextLine();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        Scanner ler = new Scanner(System.in);
        char opc;
        do{
            System.out.println("\nSelecione uma Opção:");
            System.out.println("v - Verificar Saldo");
            System.out.println("d - Depositar");
            System.out.println("s - Sacar");
            System.out.println("e - Sair");
            opc = ler.next().toLowerCase().charAt(0);
            switch (opc){
                case 'v' -> System.out.println("Saldo: "+c1.getSaldo());
                case 'd' -> {
                    System.out.println("Qual valor deseja depositar: ");
                    float valor = ler.nextFloat();
                    c1.depositar(valor);
                }
            }
        }
    }
}
