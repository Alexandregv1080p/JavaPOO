package dio.lists;

import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"listrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};
        System.out.println("-Ordem de inserção-");
        System.out.println(meusGatos);
        System.out.println("--------------------------");

        System.out.println("-Ordem de inserção-");
        Collections.shuffle(meusGatos); //randomiza a sequencia da lista
        System.out.println(meusGatos);
        System.out.println("--------------------------");

        System.out.println("-Ordem natural-");
        Collections.sort(meusGatos); //ordem alfabética
        System.out.println(meusGatos);
        System.out.println("--------------------------");

        System.out.println("-Ordem idade-");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos); //pega do menor ao maior
        System.out.println("--------------------------");

        System.out.println("-Ordem cor-");
        //Collections.sort(meusGatos, new CompartorCor());
        meusGatos.sort(new CompartorCor());
        System.out.println(meusGatos); //imprime as cores baseadas em ordem alfabética
        System.out.println("---------------------------");

        System.out.println("--Ordem Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println("---------------------------");
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
    //0 -> Nomes iguais
    //1 -> Maior
    //-1 -> Efeito de comparação é menor
}
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class CompartorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

