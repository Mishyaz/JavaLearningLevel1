package ex8XOGameGraphic.View;

import javax.swing.*;
import java.awt.*;

public class GameWindowTest extends JFrame {
    public void init() {
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//setLayout(new BorderLayout());

        JButton jButton = new JButton("hello");
        JButton jButton2 = new JButton("bye");
        add(jButton, BorderLayout.NORTH);
        add(jButton2, BorderLayout.CENTER);
        add(new JButton("Swing"), BorderLayout.EAST);
        add(new JButton("Swing"), BorderLayout.SOUTH);
        add(new JButton("Swing"), BorderLayout.WEST);
        add(new JButton("Swing"), BorderLayout.NORTH);
    }
}
