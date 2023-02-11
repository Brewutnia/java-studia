import javax.swing.*;
import java.awt.event.*;

public class Okienko extends JFrame implements ActionListener {
    JButton b7, b8, b9, b4, b5, b6, b1, b2, b3, b0, bkropka, bplus, bminus, bmnoz, bdziel, browna, bclean;
    JTextField twyswietl;

    double x;
    double buf;


    String operator = "";
    String wynik = "";

    public Okienko() {
        setSize(230, 400);
        setTitle("Kalkulator");
        setLayout(null);
        b7 = new JButton("7");
        b7.setBounds(20, 100, 40, 40);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(65,100,40,40);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(110,100,40,40);
        add(b9);
        b9.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(20,145,40,40);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(65,145,40,40);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(110,145,40,40);
        add(b6);
        b6.addActionListener(this);

        b1 = new JButton("1");
        b1.setBounds(20,190,40,40);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(65,190,40,40);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(110,190,40,40);
        add(b3);
        b3.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(20,235,40,40);
        add(b0);
        b0.addActionListener(this);

        bkropka = new JButton(".");
        bkropka.setBounds(65,235,40,40);
        add(bkropka);
        bkropka.addActionListener(this);

        bplus = new JButton("+");
        bplus.setBounds(110,235,85,40);
        add(bplus);
        bplus.addActionListener(this);

        bminus = new JButton("-");
        bminus.setBounds(155,190,40,40);
        add(bminus);
        bminus.addActionListener(this);

        bmnoz = new JButton("*");
        bmnoz.setBounds(155,145,40,40);
        add(bmnoz);
        bmnoz.addActionListener(this);

        bdziel = new JButton("÷");
        bdziel.setBounds(155,100,40,40);
        add(bdziel);
        bdziel.addActionListener(this);

        browna = new JButton("=");
        browna.setBounds(110,280,85,40);
        add(browna);
        browna.addActionListener(this);

        bclean = new JButton("C");
        bclean.setBounds(20,280,85,40);
        add(bclean);
        bclean.addActionListener(this);

        twyswietl = new JTextField();
        twyswietl.setBounds(20,50,175,40);
        add(twyswietl);


        }
        @Override
        public void actionPerformed (ActionEvent ev){
            Object target = ev.getSource();
            if (target == b7) {
                twyswietl.setText(twyswietl.getText()+((JButton)b7).getText());
                twyswietl.requestFocus();
            }
            else if (target == b8){
                twyswietl.setText(twyswietl.getText()+((JButton)b8).getText());
                twyswietl.requestFocus();
            }else if (target == b9){
                twyswietl.setText(twyswietl.getText()+((JButton)b9).getText());
                twyswietl.requestFocus();
            }
            else if (target == b4){
                twyswietl.setText(twyswietl.getText()+((JButton)b4).getText());
                twyswietl.requestFocus();
            }
            else if (target == b5){
                twyswietl.setText(twyswietl.getText()+((JButton)b5).getText());
                twyswietl.requestFocus();
            }
            else if (target == b6){
                twyswietl.setText(twyswietl.getText()+((JButton)b6).getText());
                twyswietl.requestFocus();
            }
            else if (target == b1){
                twyswietl.setText(twyswietl.getText()+((JButton)b1).getText());
                twyswietl.requestFocus();
            }
            else if (target == b2){
                twyswietl.setText(twyswietl.getText()+((JButton)b2).getText());
                twyswietl.requestFocus();
            }
            else if (target == b3){
                twyswietl.setText(twyswietl.getText()+((JButton)b3).getText());
                twyswietl.requestFocus();
            }
            else if (target == b0){
                twyswietl.setText(twyswietl.getText()+((JButton)b0).getText());
                twyswietl.requestFocus();
            }
            else if (target == bkropka){
                if(twyswietl.getText().indexOf(".")==-1) {
                    twyswietl.setText(twyswietl.getText() + ((JButton) bkropka).getText());
                }
                twyswietl.requestFocus();
            }
            else if (target == bclean){
                buf=0;
                twyswietl.setText("0");
                twyswietl.requestFocus();
            }

            else if (target == bplus) {
                buf = Double.parseDouble(twyswietl.getText());
                operator = "+";
                twyswietl.setText("");
                twyswietl.requestFocus();
            }
            else if (target == bminus){
                buf=Double.parseDouble(twyswietl.getText());
                operator = "-";
                twyswietl.setText("");
                twyswietl.requestFocus();
            }
            else if (target == bdziel) {
                buf = Double.parseDouble(twyswietl.getText());
                operator = "/";
                twyswietl.setText("");
                twyswietl.requestFocus();
            }
            else if (target == bmnoz) {
                buf = Double.parseDouble(twyswietl.getText());
                operator = "*";
                twyswietl.setText("");
                twyswietl.requestFocus();
            }
            else if (target == browna) {
                x=Double.parseDouble(twyswietl.getText());
                switch(operator) {
                    case "+": wynik=Double.toString(buf+x);
                    break;
                    case "-": wynik=Double.toString(buf-x);
                    break;
                    case "*": wynik=Double.toString(buf*x);
                    break;
                    case "/":
                        if (x == 0) {
                            wynik ="Err";
                        }else
                        wynik=Double.toString(buf/x);
                }
                twyswietl.setText(wynik);
                twyswietl.requestFocus();

                }
            }
        }

