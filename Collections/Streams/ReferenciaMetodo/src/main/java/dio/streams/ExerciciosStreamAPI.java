package dio.streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String : ");

        System.out.println("===Reference Method===");
        numerosAleatorios.stream()
                .forEach(System.out::println); //reference method
        System.out.println("-----------------------------------");
        System.out.println("===Metodo Lambda===");
        numerosAleatorios.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set : ");
        numerosAleatorios.stream()
                .limit(5) //do 0 ate o 5
                .collect(Collectors.toSet())//aqui pegamos os numeros do limit
                .forEach(System.out::println);//printamos os elementos coletados //lembrando que numeros repetidos sao descartados dentro do List
        System.out.println("-----------------------------------");

        System.out.println("Transfere esta lista de String em uma lista de inteiros : ");
        List<Integer> collectList = numerosAleatorios.stream()
                //.map(s -> Integer.parseInt(s));
                .map(Integer::parseInt)//aqui tranformamos o String para Integer
                .collect(Collectors.toList());
        System.out.println(collectList);


    }
}
