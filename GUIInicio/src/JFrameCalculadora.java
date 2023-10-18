import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class JFrameCalculadora extends JFrame {
    public JFrameCalculadora(){
        super("Calculadora");
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        for (int i = 1; i <=16; i++) {
            JButton but = new JButton (""+i);
            but.setSize(90, 90);
            this.add(but); 
        }
        
        this.setVisible(true);
    }

}
