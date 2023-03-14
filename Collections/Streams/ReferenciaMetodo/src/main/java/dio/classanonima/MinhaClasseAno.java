package dio.classanonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinhaClasseAno {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"listrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};
        //comparando por idade
        System.out.println("- Comparando por idade -");
        meusGatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato o1, Gato o2) {
                return Integer.compare(o1.getIdade(),o2.getIdade());
            }
        });
        System.out.println(meusGatos);

        System.out.println("- Comparando por nome - ");
        meusGatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato o1, Gato o2) {
                return o1.getNome().compareToIgnoreCase(o2.getNome());
            }
        });
        System.out.println(meusGatos);

        System.out.println("- Comparando por cor - ");
        meusGatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato o1, Gato o2) {
                return o1.getCor().compareToIgnoreCase(o2.getCor());
            }
        });
        System.out.println(meusGatos);
    }
}
class Gato {
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
}