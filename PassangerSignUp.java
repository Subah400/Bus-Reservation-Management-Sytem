/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse110project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PassangerSignUp implements ActionListener
{
    JFrame f = new JFrame("Sign Up");
    Color clr1 = new Color(252, 251, 251);
    Color clr2 = new Color(192, 192, 192);
    JTextField txt1 = new JTextField();
    JPasswordField pass = new JPasswordField();
    JLabel lbl = new JLabel();
    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JButton btn = new JButton();
    Cursor cr = new Cursor(Cursor.HAND_CURSOR);
    Font fh = new Font("Trebuchet MS", Font.BOLD, 30);
    Font fs = new Font("Trebuchet MS", Font.BOLD, 13);
    Container c = f.getContentPane();

    public PassangerSignUp ()
    {
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(430, 120, 425, 375);
        f.setTitle("Signup Panel");
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.setBackground(clr1);
        c.setLayout(null);

        txt1.setBounds(192, 127, 160, 30);
        txt1.setFont(fs);
        txt1.setForeground(Color.BLACK);

        pass.setBounds(192, 188, 160, 30);
        pass.setFont(fs);
        pass.setEchoChar('*');
        pass.setForeground(Color.BLACK);

        lbl.setBounds(30, 32, 350, 50);
        lbl.setText("Create New Account");
        lbl.setFont(fh);
        lbl.setForeground(Color.BLACK);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);

        lbl1.setBounds(43, 130, 110, 25);
        lbl1.setText("Username:");
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(fs);
        lbl1.setHorizontalAlignment(SwingConstants.RIGHT);

        lbl2.setBounds(43, 192, 110, 25);
        lbl2.setText("Password:");
        lbl2.setForeground(Color.BLACK);
        lbl2.setFont(fs);
        lbl2.setHorizontalAlignment(SwingConstants.RIGHT);

        btn.setBounds(155, 270, 140, 28);
        btn.setText("Create Account");
        btn.setBackground(clr2);
        btn.setForeground(Color.BLACK);
        btn.setCursor(cr);
        btn.addActionListener(this);
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new PassangerLogin ();
                f.setVisible(false);
            }
        });

        c.add(lbl);
        c.add(lbl1);
        c.add(lbl2);
        c.add(btn);
        c.add(txt1);
        c.add(pass);
    }

    public void actionPerformed(ActionEvent evt)
    {
        try
        {
            String user, password;
            user = txt1.getText();
            password = pass.getText();
            File FI = new File("\"D:\\cse110\\Text\\PassangerSignUp.txt\"");
            BufferedWriter BF= new BufferedWriter(new FileWriter(FI,true));
            BF.write(user+" "+password+"\n");
            JOptionPane.showMessageDialog(null,"    'Signup Sucessfull'\nWelcome to Ticket Panda");
            BF.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}