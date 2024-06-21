package Aula2.Exercícios;
import java.util.Scanner;
public class Exer14 {//Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe ");
        System.out.println("Km no inicio do dia: ");
        int Kminicial = ler.nextInt();
        System.out.println("Km no final do dia:");
        int Kmfinal = ler.nextInt();
        System.out.println("Litros de combustível utilizados:");
        float litros = ler.nextFloat();
        System.out.println("Valor recebido R$:");
        float valorTotal = ler.nextFloat();
        float autonomia = (Kmfinal - Kminicial)/litros;
        float lucro = valorTotal - litros * (float)4.15;
        System.out.println("Seu lucro foi de"+String.format("R$ %2.f",lucro));
        System.out.println(String.format("Seu lucro foi de R$ %2.f", lucro));
        System.out.println("A autonomia do carro foi de "+String.format("%.3f km/l",autonomia));


    }

}
