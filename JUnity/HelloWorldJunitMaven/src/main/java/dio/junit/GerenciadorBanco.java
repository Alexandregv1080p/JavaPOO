package dio.junit;

import java.util.logging.Logger;

public class GerenciadorBanco {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorBanco.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou a conexão");
    }
    public static void finalizaConexao(){
        LOGGER.info("Finalizou a conexão");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Inseriu os dados");
    }
    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu os dados");
    }
}
