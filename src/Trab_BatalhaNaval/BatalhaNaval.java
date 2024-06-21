package Trab_BatalhaNaval;

import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

    private static void mostrarMapa(char[][] mapa, char[][] mascara) {
        // Imprime a régua superior
        System.out.print("  ");
        for (int i = 0; i < mapa[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Imprime a linha de separação entre a régua superior e a matriz principal
        System.out.print(" ");
        for (int i = 0; i < mapa[0].length * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();

        // Imprime as linhas do mapa
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i + "|"); // Imprime o número da linha
            for (int j = 0; j < mapa[i].length; j++) {
                if (mascara[i][j] == 'X' || mascara[i][j] == '*') {
                    System.out.print(mascara[i][j] + " ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }



    private static boolean verPosicao(char[][] mapa, int linha, int coluna, int tamanho, char orientacao) {
        if (orientacao == 'h') {
            for (int i = 0; i < tamanho; i++) {
                if (coluna + i >= mapa[linha].length || mapa[linha][coluna + i] != 'O') {
                    return false;
                }
            }
        } else if (orientacao == 'v') {
            for (int i = 0; i < tamanho; i++) {
                if (linha + i >= mapa.length || mapa[linha + i][coluna] != 'O') {
                    return false;
                }
            }
        } else {
            return false; // Retorna falso se a orientação não for 'v' ou 'h'
        }
        return true;
    }

    private static void alocarBarco(char[][] mapa, boolean modoManual) {
        int[][] barcos = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        for (int[] barco : barcos) {
            int tamanho = barco[0];
            int quantidade = barco[1];
            for (int i = 0; i < quantidade; i++) {
                if (modoManual) {
                    while (true) {
                        System.out.println("Digite a posição do barco de tamanho " + tamanho + ":");
                        System.out.print("Digite o número da linha: ");
                        int linha = ler.nextInt();
                        System.out.print("Digite o número da coluna: ");
                        int coluna = ler.nextInt();
                        System.out.print("Digite a orientação (v para vertical ou h para horizontal): ");
                        char orientacao = ler.next().charAt(0);

                        if (verPosicao(mapa, linha, coluna, tamanho, orientacao)) {
                            if (orientacao == 'h') {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha][coluna + j] = 'N';
                                }
                            } else {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha + j][coluna] = 'N';
                                }
                            }
                            break;
                        } else {
                            System.out.println("Posição inválida. Escolha uma nova posição!");
                        }
                    }
                } else {
                    while (true) {
                        int linha = aleatorio.nextInt(mapa.length);
                        int coluna = aleatorio.nextInt(mapa[0].length);
                        int orientacaoInt = aleatorio.nextInt(2); // 0 para horizontal, 1 para vertical
                        char orientacao = (orientacaoInt == 0) ? 'h' : 'v';

                        if (verPosicao(mapa, linha, coluna, tamanho, orientacao)) {
                            if (orientacao == 'h') {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha][coluna + j] = 'N';
                                }
                            } else {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha + j][coluna] = 'N';
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void atualizarMascara(char[][] mapa, char[][] mascara, int linha, int coluna) {
        if (mapa[linha][coluna] == 'O') {
            mascara[linha][coluna] = '*'; // Revelar posição se houver um barco
        } else {
            mascara[linha][coluna] = 'X'; // Revelar posição se for um tiro sem acerto
        }
    }

    private static void Movimentar(char[][] mapa, char[][] mascara, int linha, int coluna) {
        switch (mapa[linha][coluna]) {
            case 'X', '*':
                System.out.println("Você já atirou nesta posição!");
                break;
            case 'N':
                System.out.println("Você acertou uma embarcação!");
                mapa[linha][coluna] = 'X';
                atualizarMascara(mapa, mascara, linha, coluna);
                break;
            default:
                System.out.println("Você errou o tiro!");
                mascara[linha][coluna] = '*'; // Atualiza a máscara para mostrar a tentativa de tiro
                break;
        }
    }

    private static boolean verificarFimdeJogo(char[][] mapa) {
        for (char[] linha : mapa) {
            for (char posicao : linha) {
                if (posicao == 'N') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void PlayerVsPc(boolean modoManual) {
        char[][] mapaPlayer = new char[10][10];
        char[][] mapaPc = new char[10][10];
        char[][] mascaraPlayer = new char[10][10];
        char[][] mascaraPc = new char[10][10];

        for (char[] linha : mapaPlayer) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = 'O';
            }
        }

        for (char[] linha : mapaPc) {
            for (int J = 0; J < linha.length; J++) {
                linha[J] = 'O';
            }
        }

        inicializarMascara(mascaraPlayer);
        inicializarMascara(mascaraPc);

        alocarBarco(mapaPlayer, modoManual);
        alocarBarco(mapaPc, false);

        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        while (true) {
            System.out.println("Mapa do Jogador:");
            mostrarMapa(mapaPlayer, mascaraPlayer);
            System.out.println("\nMapa do Computador:");
            mostrarMapa(mapaPc, mascaraPc);

            System.out.print("Digite o número da linha para fazer o tiro:");
            int linha = ler.nextInt();
            System.out.print("Digite o número da coluna para fazer o tiro:");
            int coluna = ler.nextInt();

            Movimentar(mapaPc, mascaraPc, linha, coluna);

            if (verificarFimdeJogo(mapaPc)) {
                System.out.println("Parabéns!! Você afundou todas as embarcações do computador. ");
                break;
            }

            while (true) {
                linha = aleatorio.nextInt(10);
                coluna = aleatorio.nextInt(10);
                if (mapaPlayer[linha][coluna] == 'O') {
                    Movimentar(mapaPlayer, mascaraPlayer, linha, coluna);
                    break;
                }
            }

            if (verificarFimdeJogo(mapaPlayer)) {
                System.out.println("O computador afundou todas as suas embarcações.(>>>GAME OVER>>>)");
                break;
            }
        }
    }

    private static void inicializarMascara(char[][] mascara) {
        for (char[] linha : mascara) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = 'O';
            }
        }
    }

    private static void playerVSplayer(boolean modoManual) {
        char[][] mapaJogador1 = new char[10][10];
        char[][] mapaJogador2 = new char[10][10];
        char[][] mascaraJogador1 = new char[10][10]; // Adicionando a máscara para o jogador 1
        char[][] mascaraJogador2 = new char[10][10]; // Adicionando a máscara para o jogador 2

        for (char[] linha : mapaJogador1) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = 'O';
            }
        }
        for (char[] linha : mapaJogador2) {
            for (int j = 0; j < linha.length; j++) {
                linha[j] = 'O';
            }
        }
        inicializarMascara(mascaraJogador1); // Inicializando a máscara para o jogador 1
        inicializarMascara(mascaraJogador2); // Inicializando a máscara para o jogador 2

        alocarBarco(mapaJogador1, modoManual);
        alocarBarco(mapaJogador2, modoManual);
        Scanner ler = new Scanner(System.in);
        int jogadorAtual = 1;

        while (true) {
            System.out.println("Mapa do Jogador 1:");
            mostrarMapa(mapaJogador1, mascaraJogador1); // Passando a máscara para o jogador 1
            System.out.println("Mapa do Jogador 2");
            mostrarMapa(mapaJogador2, mascaraJogador2); // Passando a máscara para o jogador 2

            System.out.print("Jogador " + jogadorAtual + " Digite o número da linha para fazer o tiro: ");
            int linha = ler.nextInt();
            System.out.print("Jogador " + jogadorAtual + " Digite o número da coluna para fazer o tiro: ");
            int coluna = ler.nextInt();

            if (jogadorAtual == 1) {
                Movimentar(mapaJogador2, mascaraJogador2, linha, coluna); // Passando a máscara para o jogador 2
                if (verificarFimdeJogo(mapaJogador2)) {
                    System.out.println("Parabéns!! Jogador 1 afundou todas as embarcações do Jogador 2.");
                    break;
                }
                jogadorAtual = 2;
            } else {
                Movimentar(mapaJogador1, mascaraJogador1, linha, coluna); // Passando a máscara para o jogador 1
                if (verificarFimdeJogo(mapaJogador1)) {
                    System.out.println("Parabéns!! Jogador 2 afundou todas as embarcações do Jogador 1");
                    break;
                }
                jogadorAtual = 1;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo de Batalha Naval!!!");
        System.out.println("Escolha o modo de jogo:");
        System.out.println("1 - Jogador VS Computador.");
        System.out.println("2 - Jogador VS Jogador:");

        Scanner ler = new Scanner(System.in);
        int modoJogo = ler.nextInt();

        System.out.println("Deseja alocar os barcos manualmente (S/N)?");
        String alocacaoManual = ler.next();
        boolean modoManual = alocacaoManual.equalsIgnoreCase("S");

        if (modoJogo == 1) {
            PlayerVsPc(modoManual);
        } else if (modoJogo == 2) {
            playerVSplayer(modoManual);
        } else {
            System.out.println("Modo de jogo inválido. Tente novamente:");
        }
    }
}