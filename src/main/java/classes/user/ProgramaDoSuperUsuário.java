package classes.user;

public class ProgramaDoSuperUsuário {
    public static void main(String[] args) {
        //superUsuário é uma instância da classe SuperUsuario
        final var superUsuario = new SuperUsuario ("root", "1234");
        //logi e senha sao protected, so podem ser acessads pela mesma classe
        //e por herança. (get)
        superUsuario.getLogin ();
        superUsuario.getSenha ();
        //nome é defaut, por issonão precisa do metodo get para ser acessada
        String root = superUsuario.nome;
    }
}
