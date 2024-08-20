package br.pucpr.poo.Notas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notas {

    private JPanel pnlNotas;
    private JTextField txtTrab01;
    private JTextField txtTrab02;
    private JTextField txtTrab03;
    private JTextField txtTrab04;
    private JTextField txtPjbl;
    private JButton btnCalc;
    private JTextField txtRa01;
    private JTextField txtRa02;
    private JTextField txtRa03;
    private JTextField txtRa04;
    private JLabel lblGrade;

    public Notas() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Homework trabalho1 = new Homework(txtTrab01.getName(), Float.parseFloat(txtTrab01.getText()));
                Homework trabalho2 = new Homework(txtTrab02.getName(),Float.parseFloat(txtTrab02.getText()));
                Homework trabalho3 = new Homework(txtTrab03.getName(),Float.parseFloat(txtTrab03.getText()));
                Homework trabalho4 = new Homework(txtTrab04.getName(),Float.parseFloat(txtTrab04.getText()));
                Homework pjbl = new Homework(txtPjbl.getName(), Float.parseFloat(txtPjbl.getText()));

                POO notas = new POO();
                notas.setRa01(notas.calc(trabalho1.getGrade(), 0.6f)+
                        notas.calc(pjbl.getGrade(), 0.4f));
                System.out.println(notas.getRa01());
                notas.setRa02(notas.calc(trabalho2.getGrade(), 0.6f)+
                        notas.calc(pjbl.getGrade(), 0.4f));
                notas.setRa03(notas.calc(trabalho3.getGrade(), 0.3f)+
                        notas.calc(trabalho4.getGrade(), 0.3f)+
                        notas.calc(pjbl.getGrade(), 0.4f));
                notas.setRa04(notas.calc(pjbl.getGrade(), 1f));

                txtRa01.setText(String.valueOf(notas.getRa01()));
                txtRa02.setText(String.valueOf(notas.getRa02()));
                txtRa03.setText(String.valueOf(notas.getRa03()));
                txtRa04.setText(String.valueOf(notas.getRa04()));
                lblGrade.setText(notas.calcNotaFinal());
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Notas");
        frame.setContentPane(new Notas().pnlNotas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
