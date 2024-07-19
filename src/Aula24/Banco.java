package Aula24;

import Aula24.ContaCorrente;
import Aula24.ContaPoupanca;

import java.io.*;
import java.util.Scanner;

public class Banco {
    private static final String CAMINHO_DIRETORIO = "C:\\Users\\cassi\\Documents\\aula23";
    private static final String CAMINHO_ARQUIVO = CAMINHO_DIRETORIO + "\\contas.db";

    static {
        File diretorio = new File(CAMINHO_DIRETORIO);
        if (diretorio.exists()) {
            System.out.println("A pasta existe");
        } else {
            diretorio.mkdirs();
            System.out.println("Caminho criado!");
        }
    }

    public static String leString(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextFloat();
    }

    public static void salvarContas(ContaCorrente[] listaCC, ContaPoupanca[] listaCP) {
        try (ObjectOutputStream arquivoObj = new ObjectOutputStream(new FileOutputStream(CAMINHO_ARQUIVO))) {
            arquivoObj.writeObject(listaCC);
            arquivoObj.writeObject(listaCP);
        } catch (IOException e) {
            System.out.println("Erro ao salvar contas: " + e.getMessage());
        }
    }

    public static ContaCorrente[] carregarContasCorrente() {
        try (ObjectInputStream arquivoObj = new ObjectInputStream(new FileInputStream(CAMINHO_ARQUIVO))) {
            return (ContaCorrente[]) arquivoObj.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar contas correntes: " + e.getMessage());
            return new ContaCorrente[20];
        }
    }

    public static ContaPoupanca[] carregarContasPoupanca() {
        try (ObjectInputStream arquivoObj = new ObjectInputStream(new FileInputStream(CAMINHO_ARQUIVO))) {
            return (ContaPoupanca[]) arquivoObj.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar contas poupança: " + e.getMessage());
            return new ContaPoupanca[20];
        }
    }

    public static ContaCorrente acessaCC(ContaCorrente c1) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem-vindo " + c1.getTitular());
        char opc;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("v - Verificar saldo");
            System.out.println("d - Depositar");
            System.out.println("s - Sacar");
            System.out.println("e - Sair");
            opc = ler.next().toLowerCase().charAt(0);
            switch (opc) {
                case 'v' -> System.out.println("Saldo: " + c1.getSaldo());
                case 'd' -> {
                    System.out.print("Qual valor deseja depositar: ");
                    float valor = ler.nextFloat();
                    c1.depositar(valor);
                    System.out.println("Depósito realizado!");
                }
                case 's' -> {
                    System.out.print("Qual valor deseja sacar: ");
                    float valor = ler.nextFloat();
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo insuficiente");
                }
            }
        } while (opc != 'e');
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem-vindo " + c1.getTitular());
        char opc;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("v - Verificar saldo");
            System.out.println("d - Depositar");
            System.out.println("s - Sacar");
            System.out.println("e - Sair");
            opc = ler.next().toLowerCase().charAt(0);
            switch (opc) {
                case 'v' -> System.out.println("Saldo: " + c1.getSaldo());
                case 'd' -> {
                    System.out.print("Qual valor deseja depositar: ");
                    float valor = ler.nextFloat();
                    c1.depositar(valor);
                    System.out.println("Depósito realizado!");
                }
                case 's' -> {
                    System.out.print("Qual valor deseja sacar: ");
                    float valor = ler.nextFloat();
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo insuficiente");
                }
            }
        } while (opc != 'e');
        return c1;
    }

    public static void main(String[] args) {
        ContaCorrente[] listaCC = carregarContasCorrente();
        ContaPoupanca[] listaCP = carregarContasPoupanca();
        int contCC = 0;
        int contCP = 0;

        for (ContaCorrente cc : listaCC) {
            if (cc != null) {
                contCC++;
            }
        }

        for (ContaPoupanca cp : listaCP) {
            if (cp != null) {
                contCP++;
            }
        }

        String opc;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("cc - Cadastrar conta corrente");
            System.out.println("cp - Cadastrar conta poupança");
            System.out.println("ac - Acessar conta corrente");
            System.out.println("ap - Acessar conta poupança");
            System.out.println("e - Sair");
            opc = leString("").toLowerCase();
            switch (opc) {
                case "cc" -> {
                    if (contCC < 20) {
                        Scanner ler = new Scanner(System.in);
                        ContaCorrente cc1 = new ContaCorrente();
                        System.out.println("Qual o nome do titular?");
                        String titular = ler.nextLine();
                        System.out.println("Qual o depósito inicial?");
                        float valor = ler.nextFloat();
                        System.out.println("Qual a senha?");
                        String senha = ler.next();
                        cc1.setTitular(titular);
                        cc1.setId("conta" + contCC);
                        cc1.depositar(valor);
                        cc1.setSenha(senha);
                        listaCC[contCC] = cc1;
                        System.out.println("Conta cadastrada obteve o id: " + cc1.getId());
                        contCC++;
                    } else {
                        System.out.println("Número máximo de contas correntes cadastradas.");
                    }
                }
                case "ac" -> {
                    if (contCC > 0) {
                        System.out.println("Digite o id da conta corrente:");
                        String id = leString("");
                        for (ContaCorrente cc : listaCC) {
                            if (cc != null && cc.getId().equals(id)) {
                                System.out.println("Digite a senha:");
                                String senha = leString("");
                                if (cc.getSenha().equals(senha)) {
                                    acessaCC(cc);
                                } else {
                                    System.out.println("Senha incorreta.");
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta corrente cadastrada.");
                    }
                }
                case "cp" -> {
                    if (contCP < 20) {
                        Scanner ler = new Scanner(System.in);
                        ContaPoupanca cp1 = new ContaPoupanca();
                        System.out.println("Qual o nome do titular?");
                        String titular = ler.nextLine();
                        System.out.println("Qual o depósito inicial?");
                        float valor = ler.nextFloat();
                        System.out.println("Qual a senha?");
                        String senha = ler.next();
                        cp1.setTitular(titular);
                        cp1.setId("conta" + contCP);
                        cp1.depositar(valor);
                        cp1.setSenha(senha);
                        listaCP[contCP] = cp1;
                        System.out.println("Conta cadastrada obteve o id: " + cp1.getId());
                        contCP++;
                    } else {
                        System.out.println("Número máximo de contas poupança cadastradas.");
                    }
                }
                case "ap" -> {
                    if (contCP > 0) {
                        System.out.println("Digite o id da conta poupança:");
                        String id = leString("");
                        for (ContaPoupanca cp : listaCP) {
                            if (cp != null && cp.getId().equals(id)) {
                                System.out.println("Digite a senha:");
                                String senha = leString("");
                                if (cp.getSenha().equals(senha)) {
                                    acessaCP(cp);
                                } else {
                                    System.out.println("Senha incorreta.");
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta poupança cadastrada.");
                    }
                }
            }
            salvarContas(listaCC, listaCP);
        } while (!opc.equals("e"));
    }
}
