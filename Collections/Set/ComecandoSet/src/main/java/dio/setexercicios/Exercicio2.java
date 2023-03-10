package dio.setexercicios;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>(){{
            add(new LinguagemFavorita("JavaScript", "Visual Studio Code", 1995));
            add(new LinguagemFavorita("Java", "InteliJ", 1991));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 1999));
        }};

        System.out.println("---------------------------");
        System.out.println("Exiba na ordem de criação dos obj ");
        Set<LinguagemFavorita> minhasLinguagens1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("JavaScript", "Visual Studio Code", 1995));
            add(new LinguagemFavorita("Java", "InteliJ", 1991));
            add(new LinguagemFavorita("CSharp", "Visual Studio", 1999));
        }};
        for (LinguagemFavorita l : minhasLinguagens1) {
            System.out.println(l);
        }
        System.out.println("---------------------------");

        System.out.println("Ordem natural (nome)");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita l : minhasLinguagens2) {
            System.out.println(l);
        }
        System.out.println("---------------------------");

        System.out.println("Ordem de IDES");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new LinguagemIde());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita l: minhasLinguagens3) {
            System.out.println(l);
        }
        System.out.println("---------------------------");

        System.out.println("Ano de criacao : ");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new AnoCria());
        minhasLinguagens4.addAll(minhasLinguagens3);
        for (LinguagemFavorita l: minhasLinguagens4) {
            System.out.println(l);
        }
        System.out.println("---------------------------");

        System.out.println("Ordene por IDE e nome");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(new IdeNome());
        minhasLinguagens5.addAll(minhasLinguagens4);
        for (LinguagemFavorita l: minhasLinguagens4) {
            System.out.println(l);
        }
        System.out.println("---------------------------");

        System.out.println("Ordene por Nome Ide e AnoCriacao");
        Set<LinguagemFavorita> minhasLinguagens6 = new TreeSet<>(new NomeIdeAno());
        minhasLinguagens6.addAll(minhasLinguagens5);
        for (LinguagemFavorita l: minhasLinguagens6) {
            System.out.println(l);
        }
        System.out.println("---------------------------");
    }
}
class NomeIdeAno implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0 ) return nome;
        int ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if (ide != 0 ) return ide;
        int ano = Integer.compare(o1.getAnoCriacao(),o2.getAnoCriacao());
        return ano;
    }
}
class IdeNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if(ide != 0 ) return ide;
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        return nome;
    }
}

class AnoCria implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return Integer.compare(o1.getAnoCriacao(),o2.getAnoCriacao());
    }
}
class LinguagemIde implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private String ide;
    private Integer anoCriacao;

    public LinguagemFavorita(String nome, String ide, Integer anoCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoCriacao = anoCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide) && Objects.equals(anoCriacao, that.anoCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, anoCriacao);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                ", anoCriacao=" + anoCriacao +
                '}';
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        Integer.compare(this.getAnoCriacao(),o.getAnoCriacao());
        if(anoCriacao != 0) return anoCriacao;
        return  this.getIde().compareTo(o.getIde());
    }
}
