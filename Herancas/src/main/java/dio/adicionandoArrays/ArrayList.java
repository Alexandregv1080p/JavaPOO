package dio.adicionandoArrays;

public class ArrayList {
    private String[] elementos;
    public ArrayList(int capacidade){
        this.elementos = new String[capacidade];
    }
    public void add(String elemento){
        for(int i = 0 ; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

}
