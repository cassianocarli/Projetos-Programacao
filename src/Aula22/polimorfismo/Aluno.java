package Aula22.polimorfismo;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String obterDados(){
        return "Nome: "+getNome()+" Sobrenome: "+getSobrenome();
    }
}
