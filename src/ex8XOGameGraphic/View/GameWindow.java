package ex8XOGameGraphic.View;

import ex8XOGameGraphic.Controller.GameController;
import ex8XOGameGraphic.Model.Field;
import ex8XOGameGraphic.Model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        setSize(400, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("XO GAME");

//        jPanel.setLayout(new FlowLayout()); по умолчанию
        jPanel.setLayout(new GridLayout(3,3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton jButton = new JButton();
                jButton.setText(j % 2 == 0 ? "X" : "O");
                buttons[i][j] = jButton;
                jPanel.add(jButton);

                int finalI = i;
                int finalJ = j;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button %s, x - %d, y - %d \n", buttonText, finalJ, finalI);
                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X")? Field.Type.X : Field.Type.O);
                    }
                });
            }
        }

        add(jPanel);
        setVisible(true);
    }
}
