package Aula31;

public class Retangulo extends Figura{

    private double base;
    private double altura;
    public double calculaArea(){
        return base*altura;
    }

    public double calculaPerimetro(){
        return 2*(base+altura);
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
