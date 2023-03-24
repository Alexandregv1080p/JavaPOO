package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

//assumptions tem a ver com hipoteses, suposição
//assumir uma determinada condição
public class AssumptionsTeste {
    //vamos presumir que algo sera determinado
    @Test
    void validarAlgoSomentoUsuario(){
        Assumptions.assumeFalse("DESKTOP-NTTF2M3".equals(System.getenv()));
        Assertions.assertEquals(10,5+5);
        Assumptions.assumeTrue("DESKTOP-NTTF2M3".equals(System.getenv("USERDOMAIN_ROAMINGPROFILE")));
    }
}
