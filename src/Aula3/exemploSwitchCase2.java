import java.util.Scanner;

public class exemploSwitchCase2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        int dia = ler.nextInt();
        switch (dia) {
            case 1, 7 -> System.out.println("é fim de semana ");
            case 2, 3, 4, 5, 6 -> {
                System.out.println("é dia útil");
            }
        }
    }
}