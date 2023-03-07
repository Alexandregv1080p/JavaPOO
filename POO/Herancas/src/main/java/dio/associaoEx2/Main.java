package dio.associaoEx2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        Endereco end = new Endereco();



        //dados da pessoa
        System.out.println("Entre com o nome da pessoa ");
        pessoa.setNome(entradaString.nextLine());
        System.out.println("Digite a idade da pessoa");
        pessoa.setIdade(entrada.nextInt());
        System.out.println("Digite o sexo da pessoa (f/m)");
        pessoa.setSexo(entrada.next().charAt(0));

        //dados do endereço
        System.out.println("Digite seu endereço ");
        end.setLogaudoro(entradaString.nextLine());
        System.out.println("Digite o número ");
        end.setNumero(entrada.nextInt());
        System.out.println("Digite o Cep");
        end.setCep(entradaString.nextLine());
        System.out.println("Possui complemento ? (s/n) ");

        char resp = entrada.next().charAt(0);
        if(resp == 's'){
            System.out.println("Digite o complemento ");
            end.setComplemento(entradaString.nextLine());
        }else{
            end.setComplemento(" ");
        }
        //aqui associamos o endereco a pessoa
        pessoa.setEnd(end);

        System.out.println("Dados da pessoa : " + pessoa);
    }

}
