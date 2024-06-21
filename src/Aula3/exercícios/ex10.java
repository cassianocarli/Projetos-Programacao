package Aula3.exercícios;
import java.util.Scanner;
public class ex10 {// A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de recuperação ou foi reprovado.
    // A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        int nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = ler.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        int nota3 = ler.nextInt();
        int notaTotal = (nota1+nota2+nota3)/3;
        if(notaTotal>=7.0){
            System.out.println("Este aluno foi APROVADO!");
        }
        else if(notaTotal<7 && notaTotal>=5){
            System.out.println("Este aluno pesta em RECUPERAÇÂO!");
        }
        else{
            System.out.println("Este aluno foi reprovado");
        }

    }

}
