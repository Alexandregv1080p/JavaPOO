package dio.excepetions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romanc-blake-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){ //excepetion caso o nome nao esteja certo ou n exista o arquivo
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que vc deseja imprimir " +
                    "ERROR: " + e.getCause());
        }
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado, " +
                    "entre em contato com o suporte");

        }finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo); //inicia objeto do tipo file

                                            //joga uma exception
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //indica a saída do console

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        bw.close();
    }
}
