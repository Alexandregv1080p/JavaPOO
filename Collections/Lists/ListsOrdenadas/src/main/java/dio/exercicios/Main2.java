package dio.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char pgta;
        Integer pts = 0;
        List<String> perguntas = new ArrayList<>(Arrays.asList(
                "Telefonou para vitima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vitma?",
                "Ja trabalhou com a vitma?"
        ));
        List<String> resposta = new ArrayList<>(Arrays.asList(
                "Suspeita",
                "Cumplice",
                "Assassina",
                "Inocente"
                ));
        System.out.println("Questionário de perguntas (s/n)");

        for (int i = 0; i < perguntas.size(); i++){
            System.out.println(perguntas.get(i));
            pgta = scan.nextLine().charAt(0);
            if(pgta == 's'){
                pts = pts + 1;
            }
        }
        if(pts == 2){
            System.out.println(resposta.get(0));
        } else if (pts == 3 || pts == 4) {
            System.out.println(resposta.get(1));
        } else if (pts == 5) {
            System.out.println(resposta.get(2));
        }else {
            System.out.println(resposta.get(3));
        }

    }
}
