package classes.pessoa;

public class Pessoa {
    private Integer idade;
    private Float peso;
    private Long cnpj;

    public Pessoa(){} //construtor vazio
    public Pessoa (final Integer idade){
        this.idade = idade;
    }
    public Pessoa(final Integer idade, final Float peso){
        this.idade = idade;
        this.peso = peso;
    }
    public Pessoa(final Integer idade, final Float peso, final Long cnpj){
        this.idade = idade;
        this.peso = peso;
        this.cnpj = cnpj;
    }

    public Integer getIdade() {return this.idade;}

    public Float getPeso() {return this.peso;}

    private Long getCnpj(){return this.cnpj;}

    protected String relatorioPessoaFisica(){
        return "Idade do paciente: " + idade +
                "\n" + "peso do paciente: " + peso;
    }
    protected  String relatorioPessoaJuridica(){
        return "Idade do paciente: " + idade +
                "\n" + "peso do paciente: " + peso +
                "\n" + "CNPJ do paciente: " + cnpj;
    }

}
