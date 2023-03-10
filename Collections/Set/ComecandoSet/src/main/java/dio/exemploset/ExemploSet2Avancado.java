package dio.exemploset;

import java.util.*;

public class ExemploSet2Avancado {
    public static void main(String[] args) {
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("GoT","Fantasia", 60));
            add(new Series("Dark","Drama", 60));
            add(new Series("That 70's Show","Comedia", 20));
        }};
        System.out.println("--Ordem de aleatória--");
        for (Series serie : minhasSeries) {
            System.out.println(serie);
        }
        System.out.println("--------------------------");

        System.out.println("Ordem de insercão");
        Set<Series> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Series("GoT","Fantasia", 60));
            add(new Series("Dark","Drama", 60));
            add(new Series("That 70's Show","Comedia", 20));
        }};
        for (Series serie: minhasSeries1) {
            System.out.println(serie);
        }
        System.out.println("--------------------------");

        System.out.println("--Ordem natural (TempoEpisodio)--");
        Set<Series> minhaSeries2 = new TreeSet<>(minhasSeries1);
        System.out.println(minhaSeries2);
        System.out.println("--------------------------");

        System.out.println("--Ordem Nome/Genero/TempoEpisodio");
        Set<Series> minhaSeries3 = new TreeSet<>(new ComparatorNGT());
        minhaSeries3.addAll(minhasSeries);
        System.out.println(minhaSeries3);
        System.out.println("--------------------------");

        //fazendo sozinho
        System.out.println("--Ordene por genero--");
        Set<Series> minhaSeries4 = new TreeSet<>(new ComparatorGenero());
        minhaSeries4.addAll(minhasSeries);
        System.out.println(minhaSeries4);
        System.out.println("--------------------------");

        System.out.println("--Ordene por nome--");
        Set<Series> minhaSeries5 = new TreeSet<>(new ComparatorNome());
        minhaSeries5.addAll(minhasSeries);
        System.out.println(minhaSeries5);
        System.out.println("--------------------------");
    }
}
class ComparatorNome implements Comparator<Series>{

    @Override
    public int compare(Series o1, Series o2) {
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
class ComparatorGenero implements Comparator<Series>{

    @Override
    public int compare(Series o1, Series o2) {
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
    }
}
class ComparatorNGT implements Comparator<Series>{

    @Override
    public int compare(Series o1, Series o2) {
        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0) return genero; //se forem diferente, ira comparar por genero
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;
        return Integer.compare(o1.getTempoEpisodio(),o2.getTempoEpisodio());
    }
}
class Series implements Comparable<Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    //utilizamos o equals/hashcode quando se possui o nome hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEpisodio, series.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    //comparable que vai comparar o tempo de episodio
    @Override
    public int compareTo(Series o) {
        Integer.compare(this.getTempoEpisodio(),o.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return  this.getGenero().compareTo(o.getGenero());
    }
}
