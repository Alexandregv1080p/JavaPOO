package dio.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExxLists {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as setes notas: ");
        List<Double> notas = new ArrayList<>(Arrays.asList(1.7,9.2,6.4,4d,6.3,2.9,8.5));
        System.out.println(notas);

        System.out.println("--------------------------");

        System.out.println("Exiba a posição da nota 9.2 na lista : ");
        System.out.println("Posição : " + notas.indexOf(9.2));

        System.out.println("--------------------------");

        System.out.println("Adicione na ista a nota 8.0 na posição 4 ");
        notas.add(4,8.0);
        System.out.println("Elemento adicionado! " + notas);

        System.out.println("--------------------------");

        System.out.println("Substitua a nota 1.7 pela 6.0");
        notas.set(notas.indexOf(1.7), 6d);
        System.out.println("Elemento substituido " + notas);

        System.out.println("--------------------------");
        System.out.println("Nota 6 esta dentro do array ? (true/false) " + notas.contains(6d));

        System.out.println("--------------------------");


    }

}
