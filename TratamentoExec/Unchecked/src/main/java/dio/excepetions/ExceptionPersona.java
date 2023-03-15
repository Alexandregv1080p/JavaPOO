package dio.excepetions;

import javax.swing.*;
import java.io.*;

public class ExceptionPersona {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido : ");
            imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Com exception ou nao, o programa continua...");
    }
    public static void imprimirArquivoNoConsole(String nomeArquivo){
        //joga uma exception
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
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
        catch (ImpossivelAberturaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado, " +
                    "entre em contato com o suporte");
        }
    }
    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAberturaException{
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaException(file.getName(),file.getPath());
        }
    }
}
class ImpossivelAberturaException extends Exception{
    private String nomeArqu;
    private String diretorio;

    public ImpossivelAberturaException(String nomeArqu, String diretorio) {
        super("O arquivo : " + nomeArqu + " nao foi encontrado no diretorio : " + diretorio);
        this.nomeArqu = nomeArqu;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaException{" +
                "nomeArqu='" + nomeArqu + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}


