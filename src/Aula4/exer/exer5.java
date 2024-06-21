package Aula4.exer;
/*Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e imprimir a média (simples) desse aluno.
 Só devem ser aceitos valores válidos durante a leitura de cada nota (notas válidas: 0.0 a 10.0).
 */
import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double notaUm=0;
        double notaDois=0;
        System.out.println("Digite a nota da primeira avaliação:");
        notaUm = ler.nextDouble();
        System.out.println("Digite a nota da segunda avaliação:");
        notaDois = ler.nextDouble();
        if (notaUm<0.0||notaUm>10.0 && notaDois<0.0 || notaDois>10.0) {
            do {
                System.out.println("Digite a nota da primeira avaliação novamente:");
                notaUm = ler.nextDouble();
                System.out.println("Digite a nota da segunda avaliação novamente:");
                notaDois = ler.nextDouble();
            }
            while (notaUm < 0.0 || notaUm > 10.0 && notaDois < 0.0 || notaDois > 10.0);
            double media = (notaUm + notaDois) / 2;
            System.out.println("A média das duas avaliações é: " + media);
        }
        else{
            double media = (notaUm + notaDois) / 2;
            System.out.println("A média das duas avaliações é: " + media);
        }



    }
}
