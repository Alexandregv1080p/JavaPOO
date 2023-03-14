package dio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStreamAPI2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1","2","3","9","9","6","5");
        List<String> numerosAleatorios2 = Arrays.asList("1", "0", "4", "1","2","3","9","9","6","5");
        System.out.println("Imprima todos os elementos dessa lista de String : ");

        System.out.println("Pegue os numeros maiores que 2 e adicione na lista : ");

        List<Integer>numsFilter = numerosAleatorios.stream()
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
                .skip(3)
                .limit(10)
                .collect(Collectors.toList())
                        .forEach(System.out::println);
        }


    }

