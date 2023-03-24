package junit;

import dio.junit.Conta;
import dio.junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExcecao(){
        Conta contaOrigem = new Conta("123456",0);
        Conta contaDestino = new Conta("456548",100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,() ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino,-1));
    }
}
