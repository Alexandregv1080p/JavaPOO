package junit;

import dio.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {
    @Test
    void validarLancamento(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,2,3,10};
        int[] terceiroLancamento = {10,20,30,40,50};

        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento); //true
        Assertions.assertArrayEquals(primeiroLancamento,terceiroLancamento);

    }
    @Test
    void validarSeObjEstaNull(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa); //verifica se esta nulo

        Pessoa pessoa2 = new Pessoa("Cleber", LocalDate.now());
        Assertions.assertNotNull(pessoa2);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outrovalor = 5.0;

        Assertions.assertEquals(valor,outrovalor);
    }
}
