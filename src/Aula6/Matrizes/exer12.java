package Aula6.Matrizes;
import java.util.Random;
import java.util.Scanner;
        public class exer12 {

        private static char[][] criarMapa(int linhas, int colunas) {
                return new char[linhas][colunas];
        }

        private static char[][] criarMapaMascara(int linhas, int colunas) {
                char[][] mascara = new char[linhas][colunas];
                for (int i = 0; i < linhas; i++) {
                        for (int j = 0; j < colunas; j++) {
                                mascara[i][j] = 'X'; // Inicializa a máscara com 'X' para indicar posição oculta
                        }
                }
                return mascara;
        }

        private static void mostrarMapa(char[][] mapa, char[][] mascara) {
                for (int i = 0; i < mapa.length; i++) {
                        for (int j = 0; j < mapa[i].length; j++) {
                                if (mascara[i][j] == 'X') {
                                        System.out.print(mascara[i][j] + " ");
                                } else {
                                        System.out.print(mapa[i][j] + " ");
                                }
                        }
                        System.out.println();
                }
        }

        private static void Movimentar(char[][] mapa, char[][] mascara, int linha, int coluna) {
                // Sua lógica de movimentação de tiro aqui

                // Atualiza a máscara do mapa para mostrar a posição atingida
                if (mapa[linha][coluna] == 'N') {
                        mascara[linha][coluna] = 'N'; // Mostra a posição do barco
                } else {
                        mascara[linha][coluna] = '*'; // Mostra que o tiro foi errado
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
                char[][] mapaPlayer = criarMapa(10, 10);
                char[][] mapaPc = criarMapa(10, 10);
                char[][] mascaraPlayer = criarMapaMascara(10, 10);
                char[][] mascaraPc = criarMapaMascara(10, 10);

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

                        linha = aleatorio.nextInt(10);
                        coluna = aleatorio.nextInt(10);
                        while (mascaraPlayer[linha][coluna] != 'X') {
                                linha = aleatorio.nextInt(10);
                                coluna = aleatorio.nextInt(10);
                        }
                        Movimentar(mapaPlayer, mascaraPlayer, linha, coluna);

                        if (verificarFimdeJogo(mapaPlayer)) {
                                System.out.println("O computador afundou todas as suas embarcações.(>>>GAME OVER>>>)");
                                break;
                        }
                }
        }

        private static void playerVSplayer(boolean modoManual) {
                char[][] mapaJogador1 = criarMapa(10, 10);
                char[][] mapaJogador2 = criarMapa(10, 10);
                char[][] mascaraJogador1 = criarMapaMascara(10, 10);
                char[][] mascaraJogador2 = criarMapaMascara(10, 10);

                alocarBarco(mapaJogador1, modoManual);
                alocarBarco(mapaJogador2, modoManual);

                Scanner ler = new Scanner(System.in);
                int jogadorAtual = 1;

                while (true) {
                        System.out.println("Mapa do Jogador 1:");
                        mostrarMapa(mapaJogador1, mascaraJogador1);
                        System.out.println("Mapa do Jogador 2");
                        mostrarMapa(mapaJogador2, mascaraJogador2);

                        System.out.print("Jogador " + jogadorAtual + " Digite o número da linha para fazer o tiro: ");
                        int linha = ler.nextInt();
                        System.out.print("Jogador " + jogadorAtual + " Digite o número da coluna para fazer o tiro: ");
                        int coluna = ler.nextInt();

                        if (jogadorAtual == 1) {
                                Movimentar(mapaJogador2, mascaraJogador2, linha, coluna);
                                if (verificarFimdeJogo(mapaJogador2)) {
                                        System.out.println("Parabéns!! Jogador 1 afundou todas as embarcações do Jogador 2.");
                                        break;
                                }
                                jogadorAtual = 2;
                        } else {
                                Movimentar(mapaJogador1, mascaraJogador1, linha, coluna);
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
