package dio.exerciciospropostos;

import java.util.*;

public class ExercicioUm {
    public static void main(String[] args) {
        Map<String,Double> estados = new HashMap<>(){{
            put("PE",9.616621);
            put("AL",3.351543);
            put("CE",9.187103);
            put("RN",3.534265);
        }};
        System.out.println(estados);
        System.out.println("----------------------");

        System.out.println("Substitua a populacao de RN por 3.534165");
        estados.put("RN",3.534165);
        System.out.println(estados);
        System.out.println("----------------------");

        System.out.println("Confira se o estado de PB esta no map, caso nao esteja," +
                "adicione PB - 4.039277");
        if(!estados.containsKey("PB")){
            estados.put("PB", 4.039277);
            System.out.println(estados);
        }else{
            System.out.println("Esta contido : " + estados.containsKey("PB"));
        }
        System.out.println("----------------------");

        System.out.println("Exiba a populacao de PE : ");
        System.out.println("Populacao de PE : " + estados.get("PE"));
        System.out.println("----------------------");

        System.out.println("Exiba todos os estados e suas populacoes na ordem que foram informados ");
        Map<String,Double> estados2 = new LinkedHashMap<>(){{
            put("PE",9.616621);
            put("AL",3.351543);
            put("CE",9.187103);
            put("RN",3.534265);
        }};
        System.out.println(estados2);
        System.out.println("----------------------");

        System.out.println("Exiba todos os estados e suas populacoes na ordem alfabetica ");
        Map<String,Double> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);
        System.out.println("----------------------");

        System.out.println("Exiba o estado com a menor populacao : ");
        String estadoMenorPop = " ";
        Double menorPop = Collections.min(estados.values());
        Set<Map.Entry<String,Double>> entries = estados.entrySet();
        for (Map.Entry<String,Double> entry: estados.entrySet()) {
            if (entry.getValue().equals(menorPop)) estadoMenorPop = entry.getKey();
        }
        System.out.println("Estado : "  + estadoMenorPop + " Populacao " + menorPop);
        System.out.println("----------------------");

        System.out.println("Exiba o estado com a maior populacao : ");
        String estadoMaiorPop = " ";
        Double maiorPop = Collections.max(estados.values());
        Set<Map.Entry<String,Double>> entries2 = estados.entrySet();
        for (Map.Entry<String,Double> entry: entries2) {
            if (entry.getValue().equals(menorPop)) estadoMaiorPop = entry.getKey();
        }
        System.out.println("Estado : "  + estadoMaiorPop + " Populacao " + maiorPop);
        System.out.println("----------------------");

        System.out.println("Exiba a soma da populacao desses estados : ");
        Iterator<Double> iterator = estados.values().iterator();
        double soma = 0;
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("Soma da populacao de todos : " + soma);
        System.out.println("----------------------");

        System.out.println("Exiba a media de populacao de todos os estados : ");
        System.out.println("Media : " + soma/estados.size());
        System.out.println("----------------------");

        System.out.println("Remova todos os estados que possuem populacao menor que 4.000000");
        System.out.println("");
        Iterator<Double> iterator2 = estados.values().iterator();
        while (iterator2.hasNext()){
           if(iterator2.next() < 4.000000){
               iterator2.remove();
           }
        }
        System.out.println(estados);
        System.out.println("----------------------");

        System.out.println("Apague todo o map ");
        estados.clear();
        System.out.println(estados);
        System.out.println("----------------------");

        System.out.println("Confira se o map esta vazio : " + estados.isEmpty());

    }
}
