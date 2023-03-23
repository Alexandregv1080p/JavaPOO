package dio.streams;

import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStreamAPI2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        List<String> numerosAleatorios2 = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        List<String> numerosAleatorios3 = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        List<Integer> numerosAleatorios3Integer = numerosAleatorios3.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Imprima todos os elementos dessa lista de String : ");

        System.out.println("Pegue os numeros maiores que 2 e adicione na lista : ");

        List<Integer> numsFilter = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());
        System.out.println(numsFilter);

        System.out.println("Mostre a media dos numeros : ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println); //faz a conversão da media de todos os valores

        System.out.println("Remova todos os numeros impares : ");
        List<Integer> numerosAleatorios2Integer = numerosAleatorios2.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatorios2Integer.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatorios2Integer);

        //para mim
        System.out.println("Ignore os 3 primeiros da lista e mostre o restante : ");
        numerosAleatorios2.stream()
                .skip(3) //skipamos os 3 primeiros
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("- Pegue o maior elemento da lista - ");
        OptionalInt numMax = numerosAleatorios3Integer.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(numMax);

        System.out.println("- Pegue o menor elemento da lista - ");
        OptionalInt numMin = numerosAleatorios3Integer.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println(numMin);

        System.out.println("Mostre os numeros repetidos na lista e suas quantidades ");
        long countNumerosUnicos = numerosAleatorios.stream()
                .distinct()//o método distinc, retorna todos os numeros repetidos da stream
                .count(); //retorna o numero total de elementos do List
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatorios3Integer.stream()
                .sorted(Comparator.naturalOrder())//converte para a ordem natural do list
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatorios3Integer.stream()
                .collect(Collectors.groupingBy((i) -> {
            return i % 3 == 0 || i % 5 == 0;
        }));
        System.out.println(collectNumerosMultiplosDe3E5);


    }
}

