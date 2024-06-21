package Aula4.exer;
/*Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta que é 12345, o algoritmo deve ler novamente, até que seja a senha correta.
 O algoritmo deve também contar quantas vezes o usuário tentou digitar a senha incorreta, ou seja, quantas tentativas de acerto aconteceram.
Escrever essa informação na tela.*/
import java.util.Scanner;
public class exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contErro = 0;
        float senha=12345;
        int tentSenha;
        do{
        System.out.println("Digite a senha:");
        tentSenha = ler.nextInt();
        contErro++;
        }
        while(senha != tentSenha);
        System.out.println("Senha correta!");
        System.out.println("voce errou a senha: "+contErro+" vezes");
    }
}
