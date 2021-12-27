package gamme;

import javax.swing.*;
import java.awt.*;

public class gamme extends JFrame {
    private Image backgroundImage = new ImageIcon("src/image/background.jpeg").getImage();
    public gamme(){
        setTitle ("gamme");
        setVisible(true);
        setSize(500 , 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
    }

    public static void main(String[] args) {
        new gamme();
    }
}
