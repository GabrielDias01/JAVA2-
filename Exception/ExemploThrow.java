package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // digitação de senhas
        boolean testesenha = true;
        while (testesenha) {
            String loginDigitada = JOptionPane.showInputDialog("Informe seu Login");
            String senhaDigitada = JOptionPane.showInputDialog("Informe uma Senha de 6 Digitos");
            String dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento [dd/mm/aa]");
            dataNascimento = dataNascimento.replace("/", "");
            try {
                if (senhaDigitada.length() != 6) {

                    throw new Exception("Senha Inválida");

                } else if (loginDigitada.equals(senhaDigitada)) {

                    throw new Exception("Login Inválido");

                } else if (senhaDigitada.equals(dataNascimento)) {

                    throw new Exception("Senha Inválida");
                    

                } else

                    testesenha = false;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
