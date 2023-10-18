import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class GridLayoutExemplo {
public static void main(String[] args) {
JFrame frame = new JFrame("Swing Application");
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
Panel c = new Panel();
frame.getContentPane().add(c);
c.setLayout(new GridLayout(2, 2));
c.add(new Button("um"));
c.add(new TextField(5));
c.add(new Button("dois"));
c.add(new Button("três"));
frame.pack();
frame.setVisible(true);
}
}