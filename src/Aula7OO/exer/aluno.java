package Aula7OO.exer;

public class aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float notaUm;
    float notaDois;


    float media(){
        float media = (notaUm+notaDois)/2;
        return media;
    }

    String situacao(){
        float media = media();
        if(media>=8){
            return "aprovado";
        }
        else if(media>=6){
            return "recuperação";
        }
        else{
            return "reprovado";
        }
    }

}
