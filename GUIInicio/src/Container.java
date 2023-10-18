import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Container  extends JFrame{
public Container(){
    this.setBounds(50, 100, 400, 150);//Seta , Posiçao, Tamanho
    this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    FlowLayout flow = new FlowLayout(); // Define o Layout do Container
    this.setLayout(flow);// Seta de Layout do Container
    for (int i = 1; i <= 12; i++) {
        this.add(new JButton(""+ i));// Adiciona um botaão
        this.setVisible(true);//Exibe a janela
    }
}
    
}
