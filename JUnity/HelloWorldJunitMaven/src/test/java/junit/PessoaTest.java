package junit;

import dio.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void retornaIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(1995,1,2));
        Assertions.assertEquals(28,jessica.getIdade());
    }
    @Test
    void retornaSeMaior(){
        Pessoa joao = new Pessoa("Joao",LocalDate.of(2000,1,1));
        Assertions.assertTrue(joao.ehDeMaior());//espera receber true

        Pessoa maria = new Pessoa("Maria",LocalDate.of(2009,1,1));
        Assertions.assertFalse(maria.ehDeMaior()); //espera receber false
    }
}
