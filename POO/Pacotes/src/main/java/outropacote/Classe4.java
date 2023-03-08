package outropacote;
import visibilidades.Classe1;

public class Classe4 {
    Classe1 classe1 = new Classe1();
    void metodo1(){
        classe1.metodo3();
        //só sera permitido importa atributos do tipo public
        //private e protected são descartados
    }
}
