import java.awt.*;
import javax.swing.*;

public class LayoutCalculadorGUI {
    public LayoutCalculadorGUI() {
        JFrame janelaP = new JFrame("Layout Calculadora");
        BorderLayout border = new BorderLayout();
        janelaP.setLayout(border);
        JPanel painelV = new JPanel();
        JPanel painelB = new JPanel();
        janelaP.getContentPane().add(painelB, BorderLayout.CENTER);
        janelaP.getContentPane().add(painelV, BorderLayout.NORTH);
        JTextField caixa1 = new JTextField(25);
        painelV.add(caixa1);
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);
        String textBotoes[] = { "C", "9", "8", "7", "/", "6", "5", "4", "*", "3", "2", "1", "-", "+", "0", "=" };
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
