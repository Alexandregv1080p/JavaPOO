package dio.exercicios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> meusMeses = new ArrayList<>(Arrays.asList("1 - Fevereiro ", "2 - Janeiro ", "3 - Marco ", "4 - Abril ", "5 - Junho", "6 - Julho"));
        List<Integer> temp = new ArrayList<>(Arrays.asList(22,18,21,27,32,19));
        System.out.println(meusMeses);
        int sum = 0;
        for (int t: temp) {
            sum += t;
        }
        int media = sum/temp.size();
        System.out.println("Media das temp : " + media);
        for (int i = 0; i < temp.size(); i++){
            if(media < temp.get(i)){
                System.out.println(meusMeses.get(i)+ " " + temp.get(i));
            }
        }
    }
}

