// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedTarget extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.RED);
        g.fillOval(xCenter-15, yCenter-15, 30, 30);
        g.setColor(Color.WHITE);
        g.fillOval(xCenter-10, yCenter-10, 20, 20);
        g.setColor(Color.RED);
        g.fillOval(xCenter-5, yCenter-5, 10, 10);
    }

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Red Cross");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RedTarget panel = new RedTarget();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}

