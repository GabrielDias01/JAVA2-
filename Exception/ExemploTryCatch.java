package Exception;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
        public static void main(String[] args) {
                boolean rodando = true;

                while (rodando) {

                        try {
                                int acao = Integer.parseInt(JOptionPane.showInputDialog(
                                        "Escolha conta que desejada realizar:"
                                        + "\n 1-Adição"
                                        + "\n 2-Subtração"
                                        + "\n 3-Multiplicação"
                                        + "\n 4-Divisão"));
                                        
                                        if (acao == 1) {
                                        int numero1 = Integer
                                                        .parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                                        int numero2 = Integer.parseInt(
                                                        JOptionPane.showInputDialog("Digite um outro Nº Inteiro"));
                                        JOptionPane.showMessageDialog(null, "O resultado é "
                                                        + (numero1 + numero2));
                                        

                                } else if (acao == 2) {
                                        int numero1 = Integer
                                                        .parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                                        int numero2 = Integer.parseInt(
                                                        JOptionPane.showInputDialog("Digite um outro Nº Inteiro"));
                                        JOptionPane.showMessageDialog(null, "O resultado é "
                                                        + (numero1 - numero2));
                                        

                                } else if (acao == 3) {
                                        int numero1 = Integer
                                                        .parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                                        int numero2 = Integer.parseInt(
                                                        JOptionPane.showInputDialog("Digite um outro Nº Inteiro"));
                                        JOptionPane.showMessageDialog(null, "O resultado é "
                                                        + (numero1 * numero2));
                                        
                                                        

                                } else if (acao == 4) {
                                        int numero1 = Integer
                                                        .parseInt(JOptionPane.showInputDialog("Digite um Nº Inteiro"));
                                        int numero2 = Integer.parseInt(
                                                        JOptionPane.showInputDialog("Digite um outro Nº Inteiro"));
                                        JOptionPane.showMessageDialog(null, "O resultado é "
                                                        + (numero1 / numero2));
                                        rodando = false;

                                } else {
                                        JOptionPane.showMessageDialog(null, "Opção Invalida"
                                                        + "\nDigite novamente");
                                }

                        } catch (Exception erro1) {
                                JOptionPane.showMessageDialog(null, "Aconteceu um erro"
                                                + "\nDigite novamente");

                        }
                }
        }

}
