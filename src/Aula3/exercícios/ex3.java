package Aula3.exercícios;

import java.util.Scanner;

public class ex3 {
//3) Usando o comando de seleção condicional simples “IF”, faça um programa que leia uma senha de 8 caracteres inteiros e verifique se a senha informada equivale a senha predefinida no programa.
// Se for válida informe na tela "Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado".
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String senha = "Cassiano";

        System.out.println("Digite a senha para entrar no programa:");
        String tentativaSenha = ler.next();
        if(!tentativaSenha.equals(senha))
            System.out.println("Senha inválida!");
        else
            System.out.println("Bem vindo ao programa EX3!");

    }
}
