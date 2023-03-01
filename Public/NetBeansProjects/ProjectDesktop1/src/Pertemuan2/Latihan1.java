/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ranaufalmuha
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame j = new JFrame();
        
        // Object
        int yBoundLabel = 50;
        int xBoundLabel = 550;
        String NamaKota[] = {"Padang","Solok","Pariaman","Padang Panjang","Payakumbuh"};
        ButtonGroup groupTiket = new ButtonGroup();
        
        // Set Panel
        JPanel p = new JPanel();
        p.setBounds(0, 0, 500, 600);
        p.setBackground(Color.darkGray);
        p.setLayout(new GridBagLayout());
        j.add(p);
        
        JLabel logo = new JLabel();
        logo.setText("LOGO");
        logo.setFont(new Font("Arial", Font.BOLD, 30));
        logo.setForeground(Color.white);
        p.add(logo);
        
        // ------ title ------
        JLabel title = new JLabel();
        title.setText("Pesan Tiketmu Sekarang !");
        title.setBounds(630, yBoundLabel, 300, 30);
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        j.add(title);
              
        // ------ nama ------
        JLabel nama = new JLabel();
        nama.setText("Nama");
        yBoundLabel = yBoundLabel + 80;
        nama.setBounds(xBoundLabel, yBoundLabel, 100, 30);
        j.add(nama);
        
        JTextField namaInput = new JTextField();
        namaInput.setBounds(xBoundLabel+100, yBoundLabel, 250, 30);
        j.add(namaInput);
        
        // ------ Dari ------
        JLabel dari = new JLabel();
        dari.setText("Dari");
        yBoundLabel = yBoundLabel + 40;
        dari.setBounds(xBoundLabel, yBoundLabel, 100, 30);
        j.add(dari);
        
        JComboBox dariInput = new JComboBox(NamaKota);
        dariInput.setBounds(xBoundLabel+100, yBoundLabel, 250, 30);
        dariInput.setVisible(true);
        j.add(dariInput);
        
        // ------ Menuju ------
        JLabel menuju = new JLabel();
        menuju.setText("Menuju");
        yBoundLabel = yBoundLabel + 40;
        menuju.setBounds(xBoundLabel, yBoundLabel, 100, 30);
        j.add(menuju);
        
        
        JComboBox menujuInput = new JComboBox(NamaKota);
        menujuInput.setBounds(xBoundLabel+100, yBoundLabel, 250, 30);
        menujuInput.setVisible(true);
        j.add(menujuInput);
        
        // ------ Tiket ------
        JLabel tiket = new JLabel();
        tiket.setText("Tiket");
        yBoundLabel = yBoundLabel + 40;
        tiket.setBounds(xBoundLabel, yBoundLabel, 100, 30);
        j.add(tiket);
        
        JRadioButton tiketInput1 = new JRadioButton("Silver");
        tiketInput1.setBounds(xBoundLabel+100, yBoundLabel, 70, 30);
        j.add(tiketInput1);
        
        JRadioButton tiketInput2 = new JRadioButton("Gold");
        tiketInput2.setBounds(xBoundLabel+170, yBoundLabel, 70, 30);
        j.add(tiketInput2);
        
        JRadioButton tiketInput3 = new JRadioButton("Platinum");
        tiketInput3.setBounds(xBoundLabel+240, yBoundLabel, 90, 30);
        j.add(tiketInput3);
        
        groupTiket.add(tiketInput1);        
        groupTiket.add(tiketInput2);
        groupTiket.add(tiketInput3);
        
        // ------ Fasilitas ------
        JLabel Fasilitas = new JLabel();
        Fasilitas.setText("Fasilitas");
        yBoundLabel = yBoundLabel + 40;
        Fasilitas.setBounds(xBoundLabel, yBoundLabel, 100, 30);
        j.add(Fasilitas);
        
        JCheckBox fasilitasInput1 = new JCheckBox("AC");
        fasilitasInput1.setBounds(xBoundLabel+100, yBoundLabel, 70, 30);
        j.add(fasilitasInput1);
        
        JCheckBox fasilitasInput2 = new JCheckBox("WiFi");
        fasilitasInput2.setBounds(xBoundLabel+170, yBoundLabel, 70, 30);
        j.add(fasilitasInput2);
        
        JCheckBox fasilitasInput3 = new JCheckBox("Toilet");
        fasilitasInput3.setBounds(xBoundLabel+240, yBoundLabel, 70, 30);
        j.add(fasilitasInput3);
        
        
        // ------ Button ------
        JButton btn = new JButton();
        btn.setText("Pesan");
        yBoundLabel = yBoundLabel + 50;
        btn.setBounds(xBoundLabel+125, yBoundLabel, 100, 50);
        j.add(btn);
        
        // Set Layout (Decorate)
        j.setLocationRelativeTo(null);
        j.setSize(1000,600);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
