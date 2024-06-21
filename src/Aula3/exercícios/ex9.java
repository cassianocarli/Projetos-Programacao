package Aula3.exercícios;
import java.util.Scanner;
public class ex9 {/*9) Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
    Classifique esse triângulo como:
    a) Equilátero: três lados iguais.
            b) Isósceles: dois lados iguais.
            c) Escaleno: três lados diferentes. Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser igual a zero, um lado não pode ser maior do que a soma dos outros dois.*/
 public static void main(String[] args){
     Scanner ler = new Scanner(System.in);
     System.out.println("Digite o primeiro lado do triângulo:");
     int ladoUm = ler.nextInt();
     System.out.println("Digite o segundo lado do triângulo:");
     int ladoDois = ler.nextInt();
     System.out.println("Digite o terceiro lado do triângulo:");
     int ladoTres = ler.nextInt();
     if(ladoUm == 0 || ladoDois == 0 || ladoTres == 0) {
         System.out.println("Nenhum dos tres lados de um triangulo pode ser 0!");
     }
         else {
         if (ladoUm == ladoDois || ladoUm == ladoTres || ladoTres == ladoDois) {
             System.out.println("Este triangulo é isosceles!");
         }
             else if(ladoUm == ladoDois && ladoUm == ladoTres && ladoTres == ladoDois) {
                 System.out.println("Este triangulo é equilátero!");
             }
             else{
                 System.out.println("Este triangulo é escaleno!");
             }
         }

     }
 }
