package main;

import modelos.ConversorMonedas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var conversion = ConversorMonedas.iniciarConversion();

        if(conversion == null){
            System.out.println("Una o ambas divisas no existen");
        }else{
            System.out.println(conversion);
        }
    }
}