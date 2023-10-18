package ArrayList;

import java.util.*;

import javax.swing.JOptionPane;

/**
 * ExemploArrayList
 */
public class ExemploArrayList {
    public static void main(String[] args) {
        // criando a Arraylista de String com obj de nome carros
        ArrayList<String> carros = new ArrayList<String>();// ArrayList
        List carros1 = new ArrayList<>();// coleção
        //Adicionando elementos na coleção(ArrayList)
        carros.add("Uno");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        //Iterando com o laço For
        Collections.sort(carros);
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        //ordenar uma lista(sort - Collections)
        Collections.reverse(carros);        
        //Iterando com For-each
        for (String i : carros) {
            System.out.println(i);
        }
        carros.clear();//apaga o ArrayList
        //Imprimindo a coleção
        System.out.println(carros);
    }

    public class ExercicioArrayListInteger {
        public static void main(String[] args) {
            ArrayList<Integer> num = new ArrayList<Integer>(5);
            for (int i = 0; i < 5; i++) {
                num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº")));
            }
            Collections.sort(num);
            for (Integer integer : num) {
                System.out.println(integer);
            }
            Collections.reverse(num);
            for (Integer integer : num) {
                System.out.println(integer);
            }
        }
    }
}