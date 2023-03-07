package dio.upcast;

public class Main {
    public static void main(String[] args) {
        //Upcast
        Funcionario funcionario = new Funcionario();
        Funcionario gerente1 = new Gerente();
        Funcionario faxineiro1 = new Faxineiro();
        Funcionario vendedor1 = new Vendedor();

        //DownCast
        //Deve ser evitado
        Gerente gerente2 = (Gerente)new Funcionario();
        Faxineiro faxineiro2 = (Faxineiro)new Funcionario();
        Vendedor vendedor = (Vendedor)new Funcionario();
    }
}
