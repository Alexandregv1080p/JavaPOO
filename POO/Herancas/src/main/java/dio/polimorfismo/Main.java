package dio.polimorfismo;

public class Main {
    public static void main(String[] args) {
        //criamos um vetor a partir da classe mãe
        ClasseMae[] classesOjb = new ClasseMae[]{new ClasseFila1(), new ClasseFila2(),new ClasseMae()};

        for (ClasseMae classe: classesOjb) {
            classe.metodo1();
        }
        System.out.println("-----------------------------");

        for (ClasseMae classe: classesOjb) {
            classe.metodo2(); //apenas a classefilha 1 não aparecera
        }
        System.out.println("-----------------------------");

        ClasseFila2 classeFila2 = new ClasseFila2();
        classeFila2.metodo2();
    }
}
