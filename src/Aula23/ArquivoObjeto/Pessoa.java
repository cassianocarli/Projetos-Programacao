package Aula23.ArquivoObjeto;
import java.io.Serializable;
public class Pessoa implements Serializable {
    private String nome;
    private String sobrenome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String toString(){
    return "Nome: "+nome+"\nSobrenome: "+sobrenome;
    }
}
