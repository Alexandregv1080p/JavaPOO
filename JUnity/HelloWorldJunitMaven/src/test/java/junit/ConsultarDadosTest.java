package junit;

import dio.junit.GerenciadorBanco;
import dio.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosTest {
    //teste que sera executado antes de todos
    @BeforeAll
    static void configuraConexao(){
        GerenciadorBanco.iniciarConexao();
    }
    //para cada teste executado, o insere dados sera executado antes
    @BeforeEach
    void insereDadosTeste(){
        GerenciadorBanco.insereDados(new Pessoa("Joao", LocalDate.of(2000,11,2)));
    }
    //para cada teste executado, o remove dados sera executado depois
    @AfterEach
    void removeDadosTeste(){
        GerenciadorBanco.removeDados(new Pessoa("Joao", LocalDate.of(2000,11,2)));
    }

    @Test
    void validarDados(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDados2(){
        Assertions.assertNull(null);
    }
    //teste que será executado depois de tudo
    @AfterAll
    static void finalizaConexao(){
        GerenciadorBanco.finalizaConexao();
    }

}
