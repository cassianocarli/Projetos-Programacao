package Aula31.ExemloHerançaMultipla;

public class VeiculoUtilitario implements VeiculoCarga, VeiculoPasseio{

    @Override
    void andar() {
        super.andar();
    }

    @Override
    void parar() {
        super.parar();
    }

    @Override
    public void carregar() {

    }

    @Override
    public void descarregar() {

    }
}
