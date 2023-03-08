package dio.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //List notas = new ArrayList(); //forma como era utilizada

        //como iniciar uma list
        List<Double> notas = new ArrayList<>();

        //ArrayList<Double> notas2 = new ArrayList<>(); //não é recomendadoo
        List<Double> notas2 = new ArrayList<>(Arrays.asList(6d,7.4,2.32,0d,3.7));

        //não podemos implementar a list dessa forma, não é recomendado usar
        //List<Double> notas2 = Arrays.asList(6d,7.4,2.32,0d,3.7);

        notas2.add(1d);
        notas2.remove(0d);
        System.out.println(notas2);


    }


}
