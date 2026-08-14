package dev.jaescanillas;

/*
    Objeto creado de acuerdo al caso 3 de cuenta bancaria, contando con el numero de cuenta, el saldo y el tipo
    de cuenta, los metodos de depositar si tiene dinero, mostrar el saldo y pagar en linea.
 */

public class CuentaBancaria {
    private String tipo;
    private String nombreTitular;
    private Double saldo;
    private  String numerocuenta;

    public CuentaBancaria(){
        this.tipo = "Corriente";
        this.nombreTitular = "Juan Perez";
        this.saldo = 3560.0;
        this.numerocuenta = "1158742354852";
    }

    public CuentaBancaria(String tipo, String nombreTitular, Double saldo, String numerocuenta){
        this.tipo = tipo;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numerocuenta = numerocuenta;
    }

    public Double deposit(Double saldo){
        if (saldo != 0){
            return true;
        }else {
            return false;
        }
    }

    public String MostrarSaldo(){

    }

    public void PagarLinea(){

    }
}