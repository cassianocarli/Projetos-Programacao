package Aula20.ExemploAcessoDois;

import Aula20.ExemploAcesso.Pessoa;
public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        //o acesso ao atributo nome não é permitido nível mundo
        //p1.nome = "ana";
        p1.sobrenome = "Silva";
    }
}
