package Aula7OO.exer;

public class testealuno {
    public static void main(String[] args){
        aluno a1 = new aluno();
        a1.nome = "joão";
        a1.sobrenome = "pedro";
        a1.email = "jp123@gmail.com";
        a1.codigo = 123;
        a1.notaUm = 4;
        a1.notaDois = 4;
        System.out.println("A média do aluno "+a1.nome+" é: "+a1.media());
        a1.media();
        System.out.println("A situação do aluno "+a1.nome+" é de:"+a1.situacao());
        a1.situacao();


    }
}
