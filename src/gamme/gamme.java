package gamme;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class gamme extends JFrame {
    private Image backgroundImage = new ImageIcon("src/image/background.jpeg").getImage();
    private boolean up, right , down , left;
    public gamme(){
        setTitle ("gamme");
        setVisible(true);
        setSize(500 , 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        up = true;
                        break;
                    case KeyEvent.VK_DOWN:
                        down = true;
                        break;
                    case KeyEvent.VK_LEFT:
                        left = true;
                        break;
                    case KeyEvent.VK_RIGHT:
                        right = true;
                        break;
                }
            }
        });
    }
    public void paint(Graphics g) {
        g.drawImage(backgroundImage, 0, 0, null);
    }

    public static void main(String[] args) {
        new gamme();
    }
}
