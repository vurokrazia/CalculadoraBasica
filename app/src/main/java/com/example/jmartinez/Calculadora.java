package com.example.jmartinez;

public class Calculadora {
    int operacion;
    String numero_a, numero_b, resultado;

    public Calculadora() {
        this.resultado = "";
        this.operacion = -1;
        this.numero_a = "0";
        this.numero_b = "0";

    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        switch (getOperacion()) {
            case 0:
                this.setResultado(this.suma());
                break;
            case 1:
                this.setResultado(this.resta());
                break;
            case 2:
                this.setResultado(this.division());
                break;
            case 3:
                this.setResultado(this.multiplicacion());
                break;
            default:
                this.setResultado(0.0);
                break;
        }
        return this.resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = String.valueOf(resultado);
    }

    public Double suma() {
        return this.getNumero_a() + this.getNumero_b();
    }

    public Double resta() {
        return this.getNumero_a() - this.getNumero_b();
    }

    public Double division() {
        return this.getNumero_a() / this.getNumero_b();
    }

    public Double multiplicacion() {
        return this.getNumero_a() * this.getNumero_b();
    }

    public Double getNumero_a() {
        return Double.parseDouble(numero_a);
    }

    public void setNumero_a(String numero_a) {
        this.numero_a = numero_a;
    }

    public Double getNumero_b() {
        return Double.parseDouble((numero_b));
    }

    public void setNumero_b(String numero_b) {
        this.numero_b = numero_b;
    }

    public void resetAll() {
        this.numero_a = "0";
        this.numero_b = "0";
        this.operacion = -1;
    }
}
