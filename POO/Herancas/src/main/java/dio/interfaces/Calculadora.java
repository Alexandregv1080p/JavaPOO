package dio.interfaces;

//para todos as interfaces, é necessario a clase que esta herdando a interface
//tem os mesmos métodos que a interface
public class Calculadora implements OperacaoMatematica{
    @Override
    public void soma(double op1, double op2){
        System.out.println("Soma : " + op1 + op2 );
    }@Override
    public void multiplicao(double op1, double op2){
        System.out.println("Mutiplica : " + op1 * op2 );
    }@Override
    public void subtracao(double op1, double op2){
        System.out.println("Subtracao : " + (op1 - op2) );
    }@Override
    public void divisao(double op1, double op2){
        System.out.println("Divisão : " + op1 / op2 );
    }

}
