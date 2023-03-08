package dio.lists;

import java.util.*;

public class ExxLists2 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(Arrays.asList(1.7,9.2,6.4,4d,6.3,2.9,8.5));
        System.out.println(notas);

        System.out.println("Exiba a terceira nota adicionada : ");
        System.out.println("3a nota: " + notas.get(2));
        System.out.println("-----------------------------");

        System.out.println("Exiba a menor nota adicionada : ");
        System.out.println("Menor nota : " + Collections.min(notas));
        System.out.println("-----------------------------");

        System.out.println("Exiba a maior nota adicionada : ");
        System.out.println("Maior nota : " + Collections.max(notas));
        System.out.println("-----------------------------");

        System.out.println("Exiba a soma dos valores : ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        Double soma2 = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores : " + soma);
        System.out.println("-----------------------------");

        System.out.println("Exiba a media dos valores : ");
        System.out.println("Media : " + soma/notas.size());
        System.out.println("-----------------------------");

        System.out.println("Remova a nota 4 : ");
        notas.remove(4d); //passamos o objeto
        System.out.println(notas);
        System.out.println("-----------------------------");

        System.out.println("Remova a nota na posicao 0 : ");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("-----------------------------");

        System.out.println("Remova as notas menores que 7 e exiba a lista : ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7){
                iterator2.remove();
            }
        }
        System.out.println(notas);
        System.out.println("-----------------------------");

        System.out.println("Apague todos os elementos da lista : ");
        notas.clear();
        System.out.println(notas);
        System.out.println("-----------------------------");

        System.out.println("A lista esta vazia? (true/false)");
        System.out.println(notas.isEmpty());
    }
}
