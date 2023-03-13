package dio.exemplomaps;

import java.util.*;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria : ");
        System.out.println("");
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen ", new Livro("Uma breve historia no tempo ",248));
            put("Duhigg, Charles ",new Livro("O poder do habito", 488));
            put("Harari, Yuval Noah ",new Livro("21 lições para o seculo 21", 432));
        }};
        for (Map.Entry<String,Livro> entry: meusLivros.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().getNome());
        }
        System.out.println("------------------------------");

        System.out.println("Ordem de inserção : ");
        System.out.println("");
        Map<String,Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen ", new Livro("Uma breve historia no tempo ",248));
            put("Duhigg, Charles ",new Livro("O poder do habito", 488));
            put("Harari, Yuval Noah ",new Livro("21 lições para o seculo 21", 432));
        }};
        for (Map.Entry<String,Livro> entry: meusLivros1.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().getNome());
        }
        System.out.println("------------------------------");

        System.out.println("Ordem alfabética pelo nome dos autores : ");
        System.out.println("");
        Map<String,Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String,Livro> entry: meusLivros2.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().getNome());
        }
        System.out.println("------------------------------");

        System.out.println("Ordem alfabetica nomes dos livros : ");
        System.out.println("");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new CompareNome());
        meusLivros3.addAll(meusLivros1.entrySet());
        for (Map.Entry<String, Livro> entry: meusLivros3) {
            System.out.println(entry);
        }
        System.out.println("------------------------------");

        System.out.println("Odene pelo numero de paginas : ");
        System.out.println("");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparePags());
        meusLivros4.addAll(meusLivros2.entrySet());
        for (Map.Entry<String, Livro> entry: meusLivros4) {
            System.out.println(entry);
        }
    }
}
class ComparePags implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        int res = o1.getValue().getNumPag().compareTo(o2.getValue().getNumPag());
        return res;
    }
}
class CompareNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
        //pegamos o nome atraves do valor
    }
}
class Livro {
    private String nome;
    private Integer numPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPag, livro.numPag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}
