package classes.cliente;

import classes.pessoa.Pessoa;

public class Cliente extends Pessoa {
    public Cliente(final Integer idade,final Float peso, final Long cnpj){
        super(idade, peso, cnpj);
    }
}
