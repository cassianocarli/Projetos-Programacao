package Aula6;
import java.util.Random;
import java.util.Scanner;
public class matrizes {
    static char[][] mapa = new char[10][10];
    static char[][] tabuleiroJogador1 = new char[10][10];
    static char[][] tabuleiroJogador2 = new char[10][10];
    static boolean[][] naviosJogador1 = new boolean[10][10];
    static boolean[][] naviosJogador2 = new boolean[10][10];
    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    static void mostrarTabuleiro(char[][] tabuleiro) {
        System.out.print("  ");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(letras[i] + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void colocarNavios(char[][] tabuleiro, boolean[][] navios) {
        Random rand = new Random();
        int[] tamanhos = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1}; // Tamanhos dos navios
        for (int tamanho : tamanhos) {
            boolean navioColocado = false;
            while (!navioColocado) {
                int x = rand.nextInt(10);
                int y = rand.nextInt(10);
                boolean horizontal = rand.nextBoolean();

                if (horizontal && x + tamanho <= 10) {
                    boolean posicaoValida = true;
                    for (int i = x; i < x + tamanho; i++) {
                        if (navios[y][i]) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int i = x; i < x + tamanho; i++) {
                            tabuleiro[y][i] = 'O'; // 'O' representa um navio não atacado
                            navios[y][i] = true;
                        }
                        navioColocado = true;
                    }
                } else if (!horizontal && y + tamanho <= 10) {
                    boolean posicaoValida = true;
                    for (int i = y; i < y + tamanho; i++) {
                        if (navios[i][x]) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int i = y; i < y + tamanho; i++) {
                            tabuleiro[i][x] = 'O';
                            navios[i][x] = true;
                        }
                        navioColocado = true;
                    }
                }
            }
        }
    }

    static boolean atacar(char[][] tabuleiroAtaque, boolean[][] naviosDefesa, int x, int y) {
        if (naviosDefesa[y][x]) {
            System.out.println("Acertou um navio!");
            tabuleiroAtaque[y][x] = 'X'; // 'X' representa um tiro que acertou um navio
            naviosDefesa[y][x] = false;
            return true;
        } else {
            System.out.println("Água!");
            tabuleiroAtaque[y][x] = '.'; // '.' representa um tiro na água
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Bem-vindo ao Jogo de Batalha Naval!");
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1. Jogar contra o computador");
        System.out.println("2. Jogar contra outro jogador");

        int modo = ler.nextInt();
        while (modo != 1 && modo != 2) {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2:");
            modo = ler.nextInt();
        }

        if (modo == 1) {
            System.out.println("Você escolheu jogar contra o computador.");
            System.out.println("Deseja posicionar seus navios manualmente (M) ou aleatoriamente (A)?");
            String escolha = ler.next().toUpperCase();
            boolean aleatorio = escolha.equals("A");
            colocarNavios(tabuleiroJogador1, naviosJogador1);
            System.out.println("Tabuleiro do Jogador:");
            mostrarTabuleiro(tabuleiroJogador1);

            System.out.println("O computador está posicionando seus navios...");
            colocarNavios(tabuleiroJogador2, naviosJogador2);
            System.out.println("Tabuleiro do Computador:");
            // Não mostramos o tabuleiro do computador neste momento

            boolean jogadorAtivo = true; // True para jogador, false para computador

            while (true) {
                if (jogadorAtivo) {
                    System.out.println("Sua vez de atacar!");
                    System.out.println("Escolha uma linha (A-J):");
                    String linha = ler.next().toUpperCase();
                    int y = linha.charAt(0) - 'A';
                    System.out.println("Escolha uma coluna (0-9):");
                    int x = ler.nextInt();
                    if (atacar(tabuleiroJogador2, naviosJogador2, x, y)) {
                        System.out.println("Acertou um navio! Você joga novamente.");
                    } else {
                        jogadorAtivo = false;
                    }
                    mostrarTabuleiro(tabuleiroJogador1);
                } else {
                    System.out.println("Vez do computador atacar...");
                    int x = rand.nextInt(10);
                    int y = rand.nextInt(10);
                    if (atacar(tabuleiroJogador1, naviosJogador1, x, y)) {
                        System.out.println("O computador acertou um navio!");
                    } else {
                        System.out.println("O computador errou o tiro!");
                    }
                    jogadorAtivo = true;
                }
            }
        } else {
            // Implementação do jogo contra outro jogador
        }
    }
}
