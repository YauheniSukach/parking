import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Parking extends JFrame {
    public JButton butt;
    public JButton butt1;
    public JButton butt2;
    public JButton butt3;
    public JTextField text;
    public ArrayList<Integer> parking;
    public Parking() {
        super("Parking");
        setBounds(0, 0, 800, 600);
        setResizable(false);
        repaint();
        butt3 = new JButton ("OK");
        butt3.setBackground(Color.RED);
        butt3.setForeground(Color.BLACK);
        butt = new JButton ("OK");
        butt.setBackground(Color.RED);
        butt.setForeground(Color.BLACK);
        butt1 = new JButton ("OK");
        butt1.setBackground(Color.RED);
        butt1.setForeground(Color.BLACK);
        butt2 = new JButton ("EXIT");
        butt2.setBackground(Color.RED);
        butt2.setForeground(Color.BLACK);
        text =new JTextField();
        butt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(butt1, "Введите кол-во мест!","Information",JOptionPane.INFORMATION_MESSAGE);
                for (int i = 0; i < text.getText().length(); i++) {
                    parking.add(1);
                }
                JOptionPane.showMessageDialog(butt1, ,"Information",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        butt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(butt1, "PLANE KEYS:\nMOVEUP-↑!\nMOVEDOWN-↓\nATTACK-ENTER\n----------------------\nTANK KEYS:\nMOVEUP-W\nMOVEDOWN-S\nATTACK-H\n----------------------\nPAUSE-P\nTURN PAUSE-SPACE","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        butt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        butt3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                remove(parking, text.getText().length());
                dispose();
            }
        });
        Container cont = getContentPane();
        cont.setLayout(new GridBagLayout());
        cont.add(text,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(50, 0, 200, 0), 250, 20));
        cont.add(butt,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(100, 0, 200, 0), 250, 20));
        cont.add(butt1,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(400, 0, 200, 0), 250, 20));
        cont.add(butt2,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(550, 0, 200, 0), 250, 20));
        cont.add(butt3,new GridBagConstraints(0, 0, 0, 0, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(250, 0, 200, 0), 250, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        private static void chek (ArrayList < Integer > parking) {
            for (int i = 0; i < parking.size(); i++) {
                if (parking.get(i) == 0) {
                    System.out.println("Место " + (i + 1) + " свободно!");
                } else System.out.println("Место " + (i + 1) + " занято!");
            }
        }

    private static void remove(ArrayList<Integer> parking, int number) {

        try {
            if ((parking.get(number - 1) != 0)) {
                parking.set(number - 1, 0);
                System.out.println("Место освободилось!");
            } else
                System.out.println("Место свободно!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого номера парковки нет!");
        }
    }

    private static void add(ArrayList<Integer> parking) {
        for (int i = 0; i < parking.size(); i++) {
            if (parking.get(i) == 0) {
                System.out.println("Место " + (i + 1) + " свободно!");
                parking.set(i, 1);
                System.out.println("Парковка завершена!!!");
                break;
            } else System.out.println("Место " + (i + 1) + " занято!");
        }
    }

    public static void main(String[] args) {
        Parking park = new Parking();
        park.setVisible(true);
    }
}
