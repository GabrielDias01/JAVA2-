import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

public class ExercicioCard3 extends JFrame {
public ExercicioCard3(){
    super("Exercicio 3");
    //PAINEL PRINCIPAL  
JPanel mainPanel = new JPanel(new BorderLayout());

//painel para adcionar os cards 
JPanel cardsPanel = new JPanel();

//SERLAYOUT DO cardsPanel
CardLayout cl = new CardLayout();
cardsPanel.setLayout(cl);

//CRIAR OS CARDS
JPanel home = new JPanel();
JPanel login = new JPanel();
JPanel cadastro = new JPanel();

//ADD AO cardsPanel
cardsPanel.add(home,"Home");//OBJETO E NOME
cardsPanel.add(login,"Login");
cardsPanel.add(cadastro,"Cadastro");

//DIFERENCIANDO OS PAINEIS

//HOME
JButton hButtonLogin = new JButton("Login");
JButton hButtonCard = new JButton("Cadastro");
home.add(new JLabel("PAGINA INICIAL"));
home.add(hButtonLogin);
home.add(hButtonCard);

//LOGIN
JButton hButtonHome = new JButton("Home");
JButton hButtonCar = new JButton("Cadastro");
login.add(new JLabel("PAGINA LOGIN"));
login.add(hButtonHome);
login.add(hButtonCar);

//CADASTRO
JButton cButtonHome = new JButton("Home");
JButton cButtonLogin = new JButton("Login");
cadastro.add(new JLabel("PAGINA CADASTRO"));
cadastro.add(cButtonHome);
cadastro.add(cButtonLogin);

//SET FINAIS
mainPanel.add(cardsPanel,BorderLayout.CENTER);
this.add(mainPanel);
this.setBounds(100, 100, 300, 300);
this.setDefaultCloseOperation(2);
this.setVisible(true);

//CRIAR AS AÇÕES DOS BOTÕES
hButtonLogin.addActionListener(e->{
    cl.show(cardsPanel, "Login");
});
hButtonCard.addActionListener(e->{
    cl.show(cardsPanel, "Cadastro");
});
hButtonHome.addActionListener(e->{
    cl.show(cardsPanel, "Home");
});
hButtonCar.addActionListener(e->{
    cl.show(cardsPanel, "Cadastro");
});
cButtonHome.addActionListener(e->{
    cl.show(cardsPanel, "Home");
});
cButtonLogin.addActionListener(e->{
    cl.show(cardsPanel, "Login");
});



}
}