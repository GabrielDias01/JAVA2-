package Colecoes;

public class Carros {
    
    String Marca;
    String Modelo;
    String Ano;
    String Cor;

    public Carros(String marca, String modelo, String ano, String cor) {
        Marca = marca;
        Modelo = modelo;
        Ano = ano;
        Cor = cor;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getAro() {
        return Ano;
    }
    public void setAro(String ano) {
        Ano = ano;
    }
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
}
