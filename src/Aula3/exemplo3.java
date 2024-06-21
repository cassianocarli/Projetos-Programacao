package Aula3;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu perfil");
        String perfil = ler.next();
        if(perfil.equals("admin")){
            System.out.println("Perfil Administrador");
        }
        else if(perfil.equals("usuario")){
            System.out.println("Perfil usuário");
        }
        else{
            System.out.println("Perfil visitante");
        }
    }
}
