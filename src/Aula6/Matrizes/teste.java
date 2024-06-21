package Aula6.Matrizes;

import java.util.Random;
import java.util.Scanner;

    public class teste {

        private static void mostrarMapa(char[][] mapa) {
            for (char[] linha : mapa) {
                for (char posicao : linha) {
                    System.out.print(posicao + " ");
                }
                System.out.println();
            }
        }

        private static boolean verPosicao(char[][] mapa, int linha, int coluna, int tamanho, String orientacao) {
            if (orientacao.equals("horizontal")) {
                for (int i = 0; i < tamanho; i++) {
                    if (coluna + i >= mapa[linha].length || mapa[linha][coluna + i] != 'O') {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < tamanho; i++) {
                    if (linha + i >= mapa.length || mapa[linha + i][coluna] != 'O') {
                        return false;
                    }
                }
            }
            return true;
        }

        /*private static void alocarBarco(char[][] mapa, boolean modoManual) {
            int[][] barcos = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
            Scanner ler = new Scanner(System.in);

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
                            System.out.print("Digite a orientação (horizontal/vertical): ");
                            String orientacao = ler.next();

                            if (verPosicao(mapa, linha, coluna, tamanho, orientacao)) {
                                if (orientacao.equals("horizontal")) {
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
                    }
                }
            }
        }*/
        private static void alocarBarco(char[][] mapa, boolean modoManual) {
            int[][] barcos = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
            Scanner ler = new Scanner(System.in);

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
                            System.out.print("Digite a orientação (horizontal/vertical): ");
                            String orientacao = ler.next();

                            if (verPosicao(mapa, linha, coluna, tamanho, orientacao)) {
                                if (orientacao.equals("horizontal")) {
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
                        Random aleatorio = new Random();
                        int linha = aleatorio.nextInt(mapa.length);
                        int coluna = aleatorio.nextInt(mapa[0].length);
                        String orientacao = aleatorio.nextBoolean() ? "horizontal" : "vertical";

                        if (verPosicao(mapa, linha, coluna, tamanho, orientacao)) {
                            if (orientacao.equals("horizontal")) {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha][coluna + j] = 'N';
                                }
                            } else {
                                for (int j = 0; j < tamanho; j++) {
                                    mapa[linha + j][coluna] = 'N';
                                }
                            }
                        }
                    }
                }
            }
        }


        /*private static void Movimentar(char[][] mapa, int linha, int coluna) {
            switch (mapa[linha][coluna]) {
                case 'X', '*':
                    System.out.println("Você já atirou nesta posição!");
                    break;
                case 'N':
                    System.out.println("Você acertou uma embarcação!");
                    mapa[linha][coluna] = 'X';
                    break;
                default:
                    System.out.println("Você errou o tiro!");
                    mapa[linha][coluna] = '*';
                    break;
            }
        }
        */private static void Movimentar(char[][] mapa, int linha, int coluna) {
            if (linha < 0 || linha >= mapa.length || coluna < 0 || coluna >= mapa[0].length) {
                System.out.println("Coordenadas fora do tabuleiro. Tente novamente.");
                return;
            }

            switch (mapa[linha][coluna]) {
                case 'X':
                case '*':
                    System.out.println("Você já atirou nesta posição!");
                    break;
                case 'N':
                    System.out.println("Você acertou uma embarcação!");
                    mapa[linha][coluna] = 'X';
                    break;
                default:
                    System.out.println("Você errou o tiro!");
                    mapa[linha][coluna] = '*';
                    break;
            }
        }


        /*private static boolean verificarFimdeJogo(char[][] mapa) {
            for (char[] linha : mapa) {
                for (char posicao : linha) {
                    if (posicao == 'N') {
                        return false;
                    }
                }
            }
            return true;
        }*/
        private static boolean verificarFimdeJogo(char[][] mapa) {
            for (char[] linha : mapa) {
                for (char posicao : linha) {
                    if (posicao == 'O' || posicao == 'N') {
                        return false;
                    }
                }
            }
            return true;
        }

        private static void PlayerVsPc(boolean modoManual) {
            char[][] mapaPlayer = new char[10][10];
            char[][] mapaPc = new char[10][10];

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
            alocarBarco(mapaPlayer, modoManual);
            alocarBarco(mapaPc, false);

            Scanner ler = new Scanner(System.in);
            Random aleatorio = new Random();

            /*while (true) {
                System.out.println("Mapa do Jogador:");
                mostrarMapa(mapaPlayer);
                System.out.println("\nMapa do Computador:");
                mostrarMapa(mapaPc);

                System.out.print("Digite o número da linha para fazer o tiro:");
                int linha = ler.nextInt();
                System.out.print("Digite o número da coluna para fazer o tiro:");
                int coluna = ler.nextInt();

                Movimentar(mapaPc, linha, coluna);

                if (verificarFimdeJogo(mapaPc)) {
                    System.out.println("Parabéns!! Você afundou todas as embarcações do computador. ");
                    break;
                }
                while (true) {
                    linha = aleatorio.nextInt(10);
                    coluna = aleatorio.nextInt(10);
                    if (mapaPlayer[linha][coluna] == 'O') {
                        Movimentar(mapaPlayer, linha, coluna);
                        break;
                    }
                }
                if (verificarFimdeJogo(mapaPlayer)) {
                    System.out.println("O computador afundou todas as suas embarcações.(>>>GAME OVER>>>)");
                    break;
                }
            }*/
            while (true) {
                // Movimento do jogador
                System.out.println("Mapa do Jogador:");
                mostrarMapa(mapaPlayer);
                System.out.println("\nMapa do Computador:");
                mostrarMapa(mapaPc);

                System.out.print("Digite o número da linha para fazer o tiro:");
                int linha = ler.nextInt();
                System.out.print("Digite o número da coluna para fazer o tiro:");
                int coluna = ler.nextInt();

                Movimentar(mapaPc, linha, coluna);

                if (verificarFimdeJogo(mapaPc)) {
                    System.out.println("Parabéns!! Você afundou todas as embarcações do computador. ");
                    break;
                }

                // Movimento do computador
                linha = aleatorio.nextInt(10);
                coluna = aleatorio.nextInt(10);
                while (mapaPlayer[linha][coluna] != 'O') {
                    linha = aleatorio.nextInt(10);
                    coluna = aleatorio.nextInt(10);
                }
                Movimentar(mapaPlayer, linha, coluna);

                if (verificarFimdeJogo(mapaPlayer)) {
                    System.out.println("O computador afundou todas as suas embarcações.(>>>GAME OVER>>>)");
                    break;
                }
            }
        }

        private static void playerVSplayer(boolean modoManual) {
            char[][] mapaJogador1 = new char[10][10];
            char[][] mapaJogador2 = new char[10][10];

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
            alocarBarco(mapaJogador1, modoManual);
            alocarBarco(mapaJogador2, modoManual);
            Scanner ler = new Scanner(System.in);
            int jogadorAtual = 1;

            while (true) {
                System.out.println("Mapa do Jogador 1:");
                mostrarMapa(mapaJogador1);
                System.out.println("Mapa do Jogador 2");
                mostrarMapa(mapaJogador2);

                System.out.print("Jogador " + jogadorAtual + " Digite o número da linha para fazer o tiro: ");
                int linha = ler.nextInt();
                System.out.print("Jogador " + jogadorAtual + " Digite o número da coluna para fazer o tiro: ");
                int coluna = ler.nextInt();

                if (jogadorAtual == 1) {
                    Movimentar(mapaJogador2, linha, coluna);
                    if (verificarFimdeJogo(mapaJogador2)) {
                        System.out.println("Parabéns!! Jogador 1 afundou todas as embarcações do Jogador 2.");
                        break;
                    }
                    jogadorAtual = 2;
                } else {
                    Movimentar(mapaJogador1, linha, coluna);
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
            System.out.println("1 - Jogador VS Computador");
            System.out.println("2 - Jogador VS Jogador");

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

