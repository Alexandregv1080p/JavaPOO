package dio.setexercicios;

import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
        Set<String> coresArco = new HashSet<>(Arrays.asList("Azul","Vermelho","Amarelo","Laranja","Roxo","Verde"));
        System.out.println("Exiba todas as cores embaixo da outra : ");
        for (String cor : coresArco) {
            System.out.println(cor);
        }
        System.out.println("------------------------");

        System.out.println("Quantidade de cores no arco iris : ");
        System.out.println("Qtd : " + coresArco.size());
        System.out.println("------------------------");

        System.out.println("Exiba as cores em ordem alfabética : ");

        Set<String> coresArco2 = new TreeSet<>();
        coresArco2.addAll(coresArco);
        for (String cor : coresArco2) {
            System.out.println(cor);
        }
        System.out.println("------------------------");

        System.out.println("Exiba todas as cores com a letra V : ");
        Iterator<String> iterator = coresArco.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.charAt(0) == 'V'){
                System.out.println(next);
            }
        }
        System.out.println("------------------------");

        System.out.println("Remova todas as cores que comecam com a leta V : ");
        Iterator<String> iterator2 = coresArco.iterator();
        while (iterator2.hasNext()){
            String next = iterator2.next();
            if(next.charAt(0) == 'V'){
                iterator2.remove();
            }
        }
        System.out.println("Cores apos remocao : " + coresArco);
        System.out.println("------------------------");

        System.out.println("Remova todas as cores que nao comecam com a leta V : ");
        Iterator<String> iterator3 = coresArco2.iterator();
        while (iterator3.hasNext()){
            String next = iterator3.next();
            if(next.charAt(0) != 'V'){
                iterator3.remove();
            }
        }
        System.out.println("Cores apos remocao : " + coresArco2);
        System.out.println("------------------------");

        System.out.println("Limpe o conjunto : ");
        coresArco2.clear();
        System.out.println("Apos a remocao : " + coresArco2);
        System.out.println("------------------------");

        System.out.println("Verifique se o conjunto esta vazio : " + coresArco2.isEmpty());
        System.out.println("------------------------");


        System.out.println("Exiba as cores na ordem inversa que foram informadas : ");
        Set<String> coresArco3 = new LinkedHashSet<>();
        coresArco3.add("Azul");
        coresArco3.add("Vermelho");
        coresArco3.add("Amarelo");
        coresArco3.add("Laranja");
        coresArco3.add("Roxo");
        coresArco3.add("Verde");

        String strArray[] = coresArco3.toArray(new String[coresArco3.size()]);
        for (int i = coresArco3.size() - 1; i > 0; i--){
            System.out.println(strArray[i]);
        }
        System.out.println("------------------------");


    }
}
