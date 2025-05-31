package com.faleite.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Bento");
//        contato.setEndereco("Rua 7 de Maio");
//        contato.setTelefone("13 9999-9999");

        // Relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Amandio Luis");
        end.setNomeRua("n/a");
        end.setComplemento("-");
        end.setCidade("Almada");
        end.setEstado("Setubal");
        end.setCep("38400-000");

        contato.setEndereco(end);

        // Relacionamento tem telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("telemovel");
        telefone.setDdd("13");
        telefone.setNumero("9999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("residencial");
        telefone2.setDdd("13");
        telefone2.setNumero("7777-7777");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

//        contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        // Saida no console
        System.out.println(contato.getNome());
//        System.out.println(contato.getTelefone());

        //        System.out.println(contato.getEndereco().getCidade()); // bad
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone tel : contato.getTelefones()) {
                System.out.println(tel.getDdd() + " " + tel.getNumero());
            }
        }
    }
}
