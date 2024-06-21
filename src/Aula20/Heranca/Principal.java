package Aula20.Heranca;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Joao","Silva",123);
        Engenheiro e1 = new Engenheiro("Tom","Jobim",321);
//
//        m1.setNome("Joao");
//        m1.setSobrenome("Silva");
//        m1.setMatricula("123");
//        m1.setSalario(1200);
//        m1.setCnh("325473274");
        System.out.println("Nome do motorista " + m1.getNome() + " " + m1.getSobrenome());
        System.out.println("Matricula: " +m1.getMatricula());
        System.out.println("Salario do motorista: " + m1.getSalario());
        System.out.println("Numero cnh do motorista: "+m1.getCnh());
//        e1.setNome("Tom");
//        e1.setSobrenome("Jobim");
//        e1.setMatricula(1321);
//        e1.setSalario(2500);
//        e1.setCrea("32592835");
        System.out.println("\nNome do engenheiro "+e1.getNome() + " "+e1.getSobrenome());
        System.out.println("Matricula do engenheiro: "+e1.getMatricula());
        System.out.println("Salario do engenheiro: "+e1.getSalario());
        System.out.println("Número da crea do engenheiro: "+e1.getCrea());

    }
}
