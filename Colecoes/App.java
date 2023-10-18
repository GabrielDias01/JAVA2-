package Colecoes;

import java.util.*;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

    List<Carros> listaCarros = new ArrayList<>();

    boolean aberto = true;
     String consulta ="";

    while(aberto);
    int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha açao desejada:\n 1-Cadastrar Carro \n 2- Consultar Carro \n Excluir Carro da lista"));

    if(acao==1){
        Carros car = new Carros(JOptionPane.showInputDialog("Informe a Marca do Carro"),
        JOptionPane.showInputDialog("Informe o Modelo do Carro"),
        JOptionPane.showInputDialog("Informe o Ano do Carro"),
        JOptionPane.showInputDialog("Informe a Cor do Carro"));
        listaCarros.add(car);

    }else if(acao==2){
        for (Carros a : listaCarros){
            consulta+=a.getMarca()+" "+a.getModelo()+"\n";
        }
        JOptionPane.showMessageDialog(null, consulta);
    }
    }
}
