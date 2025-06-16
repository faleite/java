package com.faleite.cursojava.aula56;

public class TesteDocumento {

    public static void main(String[] args) {

        // Teste
        /*for (TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }*/

        Pessoa pessoaFisica = new Pessoa();
        //pessoa.setTipoDocumento(TipoDocumento.CPF);
        pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaFisica);

        Pessoa pessoaJuridica = new Pessoa();
        //pessoa.setTipoDocumento(TipoDocumento.CPF);
        pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaJuridica);

    }
}
