package gamme;

import javax.swing.*;

public class gamme extends JFrame {
    public gamme(){
        setTitle ("gamme");
        setVisible(true);
        setSize(500 , 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new gamme();
    }
}
