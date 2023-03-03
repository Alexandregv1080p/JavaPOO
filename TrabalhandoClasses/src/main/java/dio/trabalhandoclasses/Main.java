package dio.trabalhandoclasses;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("Fiat");
        carro1.setCapacidadeTanque(120);
        System.out.println("Cor do carro: " + carro1.getCor() + ", Modelo do carro: " + carro1.getModelo() + ", Capacidade do tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor total do tanque passado por referencia: " + carro1.totalValorTanque(100));

        Carro carro2 = new Carro("Vermelho","Chevrolet", 50);
        System.out.println(carro2);

    }
}
