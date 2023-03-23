package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(3,pessoa.getIdade());//esperamos que a idade seja 2 anos
    }
}
