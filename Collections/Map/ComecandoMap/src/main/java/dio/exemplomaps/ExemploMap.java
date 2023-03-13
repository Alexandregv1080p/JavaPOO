package dio.exemplomaps;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos : ");
        //no map, so e permitido valores unicos
        Map<String,Double> meusCarros = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.4);
            put("kwid",15.6);
        }};
        System.out.println(meusCarros);
        System.out.println("----------------------------");

        System.out.println("Substitua o consumo do gol por 15.2 km/l");
        meusCarros.put("gol",15.2); //repetimos o valor da primeira chave e substituimos o segundo
        System.out.println(meusCarros);
        System.out.println("----------------------------");

        System.out.println("Confira se o modelo tucson esta no dicionario : " + meusCarros.containsKey("tucson"));
        System.out.println("----------------------------");

        System.out.println("Exiba o consumo do uno : ");
        System.out.println("Consumo : " + meusCarros.get("uno"));

        //System.out.println("Exiba o terceiro modelo"); //como no set, aqui n podemos utilizar do get ou index

        System.out.println("Exiba os modelos : ");
        Set<String> modelos = meusCarros.keySet();
        System.out.println(modelos);
        System.out.println("----------------------------");

        System.out.println("Exiba o consumo dos carros : ");
        Collection<Double> consumos = meusCarros.values();
        System.out.println(consumos);
        System.out.println("----------------------------");

        System.out.println("Exiba o modelo mais eficiente e seu consumo : ");
        Double max = Collections.max(meusCarros.values());
        String modeloMaisEficiente = " ";
        Set<Map.Entry<String,Double>> entries = meusCarros.entrySet();

        for (Map.Entry<String,Double> entry: entries) {
            if(entry.getValue().equals(max)) modeloMaisEficiente = entry.getKey(); //recebe a chave do carro com o value maior
        }
        System.out.println("Modelo mais eficiente : " + modeloMaisEficiente + " - " + max );
        System.out.println("----------------------------");

        System.out.println("Exiba o modelo menos eficiente e seu consumo : ");
        String modeloMenosEficiente = " ";
        Double consumoMenosEficiente = Collections.min(meusCarros.values());
        for (Map.Entry<String,Double> entry: entries) {
            if(entry.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo menos eficiente : " + modeloMenosEficiente + " - " + consumoMenosEficiente );
        System.out.println("----------------------------");

        System.out.println("Exiba a soma dos consumo : ");
        Iterator<Double> iterator = meusCarros.values().iterator();
        double soma = 0;
        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Soma : " + soma);
        System.out.println("----------------------------");

        System.out.println("Exiba a media do consumo dos carros : ");
        System.out.println("Media : " + soma/meusCarros.size());
        System.out.println("----------------------------");

        System.out.println("Remova os elementos com o consumo da 15.6 km/l : ");
        Iterator<Double> iterator1 = meusCarros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Valores dps da remocao : " + meusCarros);
        System.out.println("----------------------------");

        System.out.println("Exiba os carros na ordem que foram informados : ");
        Map<String,Double> meusCarros1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.4);
            put("kwid",15.6);
        }};
        System.out.println(meusCarros1);

        System.out.println("Exbia o dicionario pela ordem alfabética : ");
        Map<String,Double> meusCarros2 = new TreeMap<>(meusCarros1);
        System.out.println(meusCarros2);
        System.out.println("----------------------------");

        System.out.println("Apague todos os elementos do Map : ");
        meusCarros1.clear();
        System.out.println(meusCarros1);
        System.out.println("----------------------------");

        System.out.println("Confira se os carros estão vazio : "+ meusCarros1.isEmpty());
    }
}
