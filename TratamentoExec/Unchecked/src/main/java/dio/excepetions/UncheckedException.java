package dio.excepetions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {


        boolean loopingParada = true;
        do {
            //apesar de estourarmos uma exception, o código continua rodando
            String a = JOptionPane.showInputDialog("Numerado: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                loopingParada = false; //chegamos no final
            }catch (NumberFormatException e){ //exception de formato de numero, caso não seja numero passado no input, esse catch estourara
                JOptionPane.showMessageDialog(null,"Entrada inválida, informe um inteiro   " +
                        e.getMessage());
                e.printStackTrace(); //aqui jogamos no console o erro
            }catch (ArithmeticException e){//caso ocorra algum erro aritimético. Ex: 10 / 0
                JOptionPane.showMessageDialog(null,"Entra inválida, os dois numeros devem ser inteiros e maiores que 0 " +
                        " MSG error: " + e.getMessage());
            }
            finally {
                System.out.println("Chegou no finally");
            }
            System.out.println("O codigo continua ");
        }while (loopingParada);

    }
    public static int dividir(int a, int b) {return a/b;}
}
