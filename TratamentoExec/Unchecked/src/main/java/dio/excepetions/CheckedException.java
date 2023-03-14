package dio.excepetions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = "romance-blake-crouch.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

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
