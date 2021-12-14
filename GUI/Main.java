package GUI;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        JOptionPane.showMessageDialog(null, "Your name is "+age);

        Double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height"));
        JOptionPane.showMessageDialog(null, "Your name is "+height);
    }
}
