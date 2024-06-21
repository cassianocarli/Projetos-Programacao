package Aula3;

import java.util.Scanner;

public class exemploSwitchCase3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu perfil");
        String perfil = ler.next();
        switch (perfil) {
            case "admin" -> System.out.println("Perfil administrador");
            case "usuario" -> System.out.println("Perfil de usuario");
            default -> System.out.println("Perfil de visitante");
        }
    }
}
