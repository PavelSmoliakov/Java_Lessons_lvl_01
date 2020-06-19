package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIN_HEIGHT = 600;
    private static final int WIN_WIDTH = 600;
    private static final int WIN_POS_X = 800;
    private static final int WIN_POS_Y = 300;

    private static Map field;
    private static StartNewGameWindow startNewGameWindow;

    public GameWindow() {

        setTitle("ИГРА КРЕСТИКИ - НОЛИКИ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocationRelativeTo ( null );
        setResizable(false);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));

        JButton btnNewGame = new JButton("Новая игра");
        btnNewGame.setBackground(Color.yellow);
        JButton btnExit = new JButton("Выход");
        btnExit.setBackground(Color.yellow);

        startNewGameWindow = new StartNewGameWindow(this);

        bottomPanel.add(btnNewGame);
        bottomPanel.add(btnExit);

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        field = new Map();
        add(field, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);
        setVisible(true);

    }

    void startNewGame(int mode, int filedSizeX, int filedSizeY, int winLen) {
        field.startNewGame(mode, filedSizeX, filedSizeY, winLen);

    }
}
