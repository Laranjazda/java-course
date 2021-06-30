package classes.cliente;

public class ProgramaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente (55, 32.4f, 46456464646L);
        System.out.println (cliente.getIdade ());
        System.out.println (cliente.getPeso ());
//        System.out.println (cliente.getCnpj ());

    }
}
