package com.faleite.cursojava.aula43.labs.ex02;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto(){
        return this.getRendaBruta() * 0.1;
        //return ((this.getRendaBruta()/100) * 10);
    }

    @Override
    public String toString() {
        String s = "Pesso Juridica[";
        s += super.toString();
        s += "; cnpj: " + cnpj;
        s += " ; Imposto a ser pago: " + calcularImposto();
        s += "]";

        return s;
    }

}
