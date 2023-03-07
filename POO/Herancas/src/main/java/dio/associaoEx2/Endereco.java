package dio.associaoEx2;

public class Endereco {
    private String logaudoro;
    private String complemento;
    private int numero;
    private String cep;

    public String getLogaudoro() {
        return logaudoro;
    }

    public void setLogaudoro(String logaudoro) {
        this.logaudoro = logaudoro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logaudoro='" + logaudoro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                '}';
    }
}
