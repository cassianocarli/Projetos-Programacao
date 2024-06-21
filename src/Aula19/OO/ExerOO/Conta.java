package Aula19.OO.ExerOO;
//Crie a classe conta e seus métodos e a classe banco. Nessa classe crie opç~es para o usuário realizar operações bancárias possíveis usando a classe Conta.
//String titular, String identificador, String senha, Float saldo, depositar(float valor), boolean sacar(float valor), string verificarSaldo().
public class Conta {

    String titular;
    String id;
    String senha;
    float saldo;

    void depositar(float valor){
        saldo+=valor;
    }
    boolean sacar(float valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    String saldo(){
        return String.format("Seu saldo é de R$ %.2f",saldo);
    }

    boolean validarAcesso(String id, String senha){
        return this.id.equals(id) && this.senha.equals(senha);
    }
}
