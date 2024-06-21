package Aula19.OO.ExerOO;
import java.util.Scanner;
import java.util.Random;
//Crie a classe conta e seus métodos e a classe banco. Nessa classe crie opç~es para o usuário realizar operações bancárias possíveis usando a classe Conta.
//String titular, String identificador, String senha, Float saldo, depositar(float valor), boolean sacar(float valor), string verificarSaldo().
public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta c1 = new Conta();
        System.out.println("Qual o nome do titular?");
        String titular = ler.next();
        System.out.println("Qual o depósito inicial?");
        float valor = ler.nextFloat();
        System.out.println("QUal a senha?");
        String senha = ler.next();
        c1.titular = titular;
        c1.id = "conta" + new Random().nextInt(1000, 10000);
        c1.depositar(valor);
        c1.senha = senha;
        System.out.println("Conta cadastrada obteve o id: " + c1.id);
        //acessando a conta
        System.out.println("Digite a senha:");
        senha = ler.next();
        System.out.println("Digite o identificador: ");
        String id = ler.next();


       //--------------------------------------------
        if(c1.validarAcesso(id, senha)) {
            char opc;
            do {
                System.out.println("\nselecione uma opção:");
                System.out.println("v - verificar saldo");
                System.out.println("d - depositar");
                System.out.println("s - sacar");
                System.out.println(" e - sair");
                opc = ler.next().toLowerCase().charAt(0);
                switch (opc) {
                    case 'v' -> System.out.print(c1.saldo());
                    case 'd' -> {
                        System.out.print("Qual valor deseja depositar:");
                        valor = ler.nextFloat();
                        c1.depositar(valor);
                        System.out.println("deposito realizado!");
                    }
                    case 's' -> {
                        System.out.print("Qual valor deseja sacar: ");
                        valor = ler.nextFloat();
                        if (c1.sacar(valor))
                            System.out.println("Saque realizado");
                        else {
                            System.out.println("Saldo insuficiente");

                        }
                    }
                }
            } while (opc != 'e');

        } else {
            System.out.println("Os dados de acesso estão incorretos!");
        }
    }
}
