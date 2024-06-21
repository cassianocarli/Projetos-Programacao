package Aula3;

import java.text.DecimalFormat;
public class ExemplosDecimal {
    public static void main(String[] args){
        double numeroUm = 21324452.2425;
        double numeroDois = 234.55;
        double numeroTres = (float) 1/2;
        //#  -> número opcional;
        //,  -> separador de milhar;
        //0  -> número obrigátorio;
        //.  -> separador decimal;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        System.out.println(df.format(numeroUm));
        System.out.println(df.format(numeroDois));
        System.out.println(df.format(numeroTres));
    }
}