package dio.exemploset;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto de notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        Set<Integer> numrand = new HashSet<>(Arrays.asList(1,2,3,4,1,2,3));
        System.out.println(notas); //gera numeros aleatorios, se o numero for repetido, ele aparecera um vez só
        System.out.println("----------------------------");

        //não possuimos metodo get
        System.out.println("Exiba a posição da nota 5.0 : ");
        System.out.println("Metodo indisponivel");
        System.out.println("----------------------------");

        //não possuimos métodos de composição
        System.out.println("Adiciona na lista a nota 8.0 na posi 4");
        System.out.println("Metodo indisponivel");
        System.out.println("----------------------------");

        System.out.println("Confira se a nota 5.0 esta no conjunto : ");
        System.out.println("Nota presente : " + notas.contains(5.0) );
        System.out.println("----------------------------");

        //novamente não esta disponível o get
        System.out.println("Exiba a terceira nota do set : ");
        System.out.println("Metodo indisponivel");
        System.out.println("----------------------------");

        System.out.println("Exiba a menor nota : " );
        System.out.println("Menor nota : " + Collections.min(notas));
        System.out.println("----------------------------");

        System.out.println("Exiba a mairo nota : ");
        System.out.println("Mairo nota : " + Collections.max(notas));
        System.out.println("----------------------------");

        System.out.println("Exiba a soma dos valores : ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("----------------------------");

        System.out.println("Exiba a média dos valores : ");
        System.out.println("Media : " + soma/notas.size());
        System.out.println("----------------------------");

        System.out.println("Remova a nota 0 : ");
        notas.remove(0d);
        System.out.println("Notas apos a remossao : " + notas);
        System.out.println("----------------------------");

        //nao possuimos o get
        System.out.println("Remova a nota na posicao 0 : ");
        System.out.println("Metodo indisponivel");
        System.out.println("----------------------------");

        System.out.println("Remova as notas menores que 7 : ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println("Notas apos a alteracao : " + notas);
        System.out.println("----------------------------");

        System.out.println("Exiba as notas na ordem que foram informados");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //o treeset estabelece a ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("----------------------------");

        System.out.println("Apague todo o confunto ");
        notas3.clear();
        System.out.println(notas3);
        System.out.println("----------------------------");

        System.out.println("Confira se o conjunto esta vazio : " + notas3.isEmpty());

        System.out.println("Mostre apenas os numeros que na foram repitidos : ");
        for (Integer not : numrand) {
            if(numrand.contains(not)){
                numrand.remove(not);
            }else{
                numrand.add(not);
            }
        }
        System.out.println(numrand);
    }


}
