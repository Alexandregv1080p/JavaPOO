package dio.excepetions;

import javax.swing.*;

public class ExceptionPersona2 {
    public static void main(String[] args) {
        int[] numerado = {4,8,8,10};
        int[] denominador = {2,4,0,2,8};

        try{
            for (int i = 0; i < denominador.length;i++){
                try{
                    if(numerado[i]/denominador[i] % 2 != 0){
                        throw  new DivisaoNaoExata("Divisão nao exata!",numerado[i],denominador[i] );
                    }
                        int resultado = numerado[i] / denominador[i];
                        System.out.println(resultado);

                }catch (DivisaoNaoExata e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }

            }
        }
        catch (NumberFormatException e){
            e.getMessage();
        }

        System.out.println("O programa continua...");
    }
}
class DivisaoNaoExata extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExata(String message, int numerador,int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
