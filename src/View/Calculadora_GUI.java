package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_GUI extends JFrame {
    private JTextField tfPrimeiroNumero;
    private JTextField tfSegundoNumero;
    private JButton btnSomar;
    private JButton btnSubtra;
    private JButton btnVezes;
    private JButton btnDivisao;
    private JButton btnLimpar;
    private JButton btnSair;
    private JPanel mainPanel;
    private JLabel lbResultado;
    private JLabel Label1;
    private JLabel Label2;


    public Calculadora_GUI(){
        setContentPane(mainPanel);
        setTitle("TOP 10 melhores Calculadoras");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Primeironumero = Integer.parseInt(tfPrimeiroNumero.getText());
                int Segundonumero = Integer.parseInt(tfSegundoNumero.getText());
                lbResultado.setText("Seu resultado é : "+ (Primeironumero+Segundonumero));
            }
        });
        btnSubtra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Primeironumero = Integer.parseInt(tfPrimeiroNumero.getText());
                int Segundonumero = Integer.parseInt(tfSegundoNumero.getText());
                lbResultado.setText("Seu resultado é : "+ (Primeironumero-Segundonumero));
            }
        });
        btnVezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Primeironumero = Integer.parseInt(tfPrimeiroNumero.getText());
                int Segundonumero = Integer.parseInt(tfSegundoNumero.getText());
                lbResultado.setText("Seu resultado é : "+ (Primeironumero*Segundonumero));
            }
        });
        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Primeironumero = Integer.parseInt(tfPrimeiroNumero.getText());
                int Segundonumero = Integer.parseInt(tfSegundoNumero.getText());
                lbResultado.setText("Seu resultado é : "+ (Primeironumero/Segundonumero));
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPrimeiroNumero.setText("");
                tfSegundoNumero.setText("");
                lbResultado.setText("Seu resultado é : ");
            }
        });
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
