package Aula23.ArquivoObjeto;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EscreverObjeto {
    public static void main(String[] args) {
        //caminho para manipular o caminho para o arquivo
        File caminho = new File("C:\\Users\\cassi\\Documents\\aula23");

        //testando se o caminho existe
        if(caminho.exists()){
            System.out.println("A pasta existe");
        }
        //criando ele se não existir
        else{
            caminho.mkdirs();
            System.out.println("Caminho criado!");
        }

        //declarando o arquivo para salvar a pessoa
        File arquivo = new File(caminho,"pessoas.db");
        System.out.println(arquivo.getAbsolutePath());
        try{
            ObjectOutputStream arquivoObj = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));

            //criando uma lista de pessoas
            Pessoa[] lista = new Pessoa[10];
            Scanner ler = new Scanner(System.in);
            String opc;
            int cont = 0;
            do{
                System.out.println("Lendo informações da pessoa "+(cont+1));
                System.out.println("Qual o nome:");
                    String nome = ler.next();
                System.out.println("Qual o sobrenome:");
                    String sobrenome = ler.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.println("Tem mais pessoas?");
                    opc = ler.next().toLowerCase();
                    cont++;
            }
            while(opc.equals("s"));

            //Criar uma pessoa
            Pessoa p1 = new Pessoa();
            p1.setNome ("Jonas");
            p1.setSobrenome("Silva");
            //Gravar a pessoa no arquivo
            arquivoObj.writeObject(lista);
            //Fechar o arquivo
            arquivoObj.close();
        }
        catch(IOException e){
            System.out.println("Erro ao criar o arquivo!");
        }
    }
}
