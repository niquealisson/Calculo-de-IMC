package entitis;

import java.io.Serializable;



public class Product implements Serializable {
private static final long serialVersionUID =1L;


    private String PrimeiroNome;
    private String Sobrenomes;
    private float Peso;
    private float Altura;
    
    public Product(){
    }

    public Product(String PrimeiroNome, String Sobrenomes, float Peso, float Altura) {
        this.PrimeiroNome = PrimeiroNome;
        this.Sobrenomes = Sobrenomes;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public Product(String PrimeiroNome, String Sobrenomes, float d) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Product(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }

    public String getSobrenomes() {
        return Sobrenomes;
    }

    public void setSobrenomes(String Sobrenomes) {
        this.Sobrenomes = Sobrenomes;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
   
}
