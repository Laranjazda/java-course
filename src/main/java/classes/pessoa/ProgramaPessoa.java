package classes.pessoa;

import classes.user.SuperUsuario;

public class ProgramaPessoa {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica (33, 75.5f);
        System.out.println (pessoaFisica.relatorioPessoaFisica ());
        System.out.println ("*****************************");
        PessoaJuridica pessoaJuridica = new PessoaJuridica (34, 55.6f, 123212314451231L);
        System.out.println (pessoaJuridica.relatorioPessoaJuridica ());

        SuperUsuario superUsuario = new SuperUsuario ("root", "1234");
        System.out.println (superUsuario.getLogin ());
    }
}
