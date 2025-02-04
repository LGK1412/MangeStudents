package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {

    // random player starts in the first fight
    Random random = new Random();
    // Graphics
    JFrame frame = new JFrame();
    // Create a table to keep title
    JPanel title_panel = new JPanel();
    // bottom (small table) để đánh vào
    JPanel button_panel = new JPanel();
    // array
    JButton[] buttons = new JButton[400];
    // thoong baos next turn
    JLabel textfield = new JLabel();
    // if true=>turn of player1
    boolean player1_turn;

    public TicTacToe() {

//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        // table instruction
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        textfield.setText("Tic-Tac-Toe");
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setForeground(Color.GREEN);
        textfield.setFont(new Font("Ink Free", 0, 75));

        title_panel.setBackground(Color.BLACK);
        title_panel.setLayout(new BorderLayout(3, 3));
        title_panel.setBounds(0, 0, 800, 800);
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);

        button_panel.setLayout(new GridLayout(20, 20));
        button_panel.setBackground(Color.WHITE);
        button_panel.setOpaque(true);

        for (int i = 0; i < 400; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        frame.add(button_panel);
        firstTurn();
    }

    // thực hiện hành động
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 400; i++) {
            // input
            if (e.getSource() == buttons[i]) {

                if (player1_turn) {

                    if ("".equals(buttons[i].getText())) {
                        buttons[i].setText("X");
                        buttons[i].setForeground(Color.RED);
                        buttons[i].setFont(new Font("Tahoma", Font.PLAIN, 26));
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if ("".equals(buttons[i].getText())) {
                        buttons[i].setText("o");
                        buttons[i].setForeground(Color.BLUE);
                        buttons[i].setFont(new Font("Tahoma", Font.PLAIN, 28));
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }

        }
    }

    // xác định lượt của ai đầu tiên (thong bao)
    private void firstTurn() {
        // 0 va 1
        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X turn");
        } else {
            player1_turn = false;
            textfield.setText("O turn");
        }
    }

    // kiểm tra điều kiện chiến thắng
    public void check() {
        // check X win
        // ngang
        // 1
        for (int i = 0; i < 20 - 4; i++) {
            if ("X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 2
        for (int i = 20; i < 40 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 3
        for (int i = 40; i < 60 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 4
        for (int i = 60; i < 80 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 5
        for (int i = 80; i < 100 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 6
        for (int i = 100; i < 120 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 7
        for (int i = 120; i < 140 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 8
        for (int i = 140; i < 160 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 9
        for (int i = 160; i < 180 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 10
        for (int i = 180; i < 200 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 11
        for (int i = 200; i < 220 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 12
        for (int i = 220; i < 240 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 13
        for (int i = 240; i < 260 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 14
        for (int i = 260; i < 280 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 15
        for (int i = 280; i < 300 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 16
        for (int i = 300; i < 320 - 4; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 1].getText() == "X"
                    && buttons[i + 2].getText() == "X"
                    && buttons[i + 3].getText() == "X"
                    && buttons[i + 4].getText() == "X") {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 17
        for (int i = 320; i < 340 - 4; i++) {
            if ("X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 18
        for (int i = 340; i < 360 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 19
        for (int i = 360; i < 380 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 20
        for (int i = 380; i < 400 - 4; i++) {
            if ("X".equals(buttons[i].getText())
                    && "X".equals(buttons[i + 1].getText())
                    && "X".equals(buttons[i + 2].getText())
                    && "X".equals(buttons[i + 3].getText())
                    && "X".equals(buttons[i + 4].getText())) {
                xWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // chéo left--> right
        boolean conditions = true;
        for (int j = 0; j <= 260; j += 20) {
            if (buttons[19 + j].getText().equals("X")
                    && buttons[19 + j + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21 + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21 + 21 + 21].getText().equals("X")) {
                conditions = false;
            }
            if (buttons[18 + j].getText().equals("X")
                    && buttons[18 + j + 21].getText().equals("X")
                    && buttons[18 + j + 21 + 21].getText().equals("X")
                    && buttons[18 + j + 21 + 21 + 21].getText().equals("X")
                    && buttons[18 + j + 21 + 21 + 21 + 21].getText().equals("X")) {
                conditions = false;
            }
            if (buttons[17 + j].getText().equals("X")
                    && buttons[17 + j + 21].getText().equals("X")
                    && buttons[17 + j + 21 + 21].getText().equals("X")
                    && buttons[17 + j + 21 + 21 + 21].getText().equals("X")
                    && buttons[17 + j + 21 + 21 + 21 + 21].getText().equals("X")) {
                conditions = false;
            }
            if (buttons[16 + j].getText().equals("X")
                    && buttons[16 + j + 21].getText().equals("X")
                    && buttons[16 + j + 21 + 21].getText().equals("X")
                    && buttons[16 + j + 21 + 21 + 21].getText().equals("X")
                    && buttons[16 + j + 21 + 21 + 21 + 21].getText().equals("X")) {
                conditions = false;
            }
            if (buttons[19 + j].getText().equals("X")
                    && buttons[19 + j + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21 + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21 + 21 + 21].getText().equals("X")
                    && buttons[19 + j + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                conditions = true;
            }
        }
        if (conditions == true) {
            for (int i = 0; i < 316; i++) {
                if (buttons[19].getText().equals("X")
                        && buttons[19 + 21].getText().equals("X")
                        && buttons[19 + 21 + 21].getText().equals("X")
                        && buttons[19 + 21 + 21 + 21].getText().equals("X")
                        && buttons[19 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[19 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(19 + 21, 19 + 21 + 21, 19 + 21 + 21 + 21, 19 + 21 + 21 + 21 + 21,
                            19 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[39].getText().equals("X")
                        && buttons[39 + 21].getText().equals("X")
                        && buttons[39 + 21 + 21].getText().equals("X")
                        && buttons[39 + 21 + 21 + 21].getText().equals("X")
                        && buttons[39 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[39 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(39 + 21, 39 + 21 + 21, 39 + 21 + 21 + 21, 39 + 21 + 21 + 21 + 21,
                            39 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[59].getText().equals("X")
                        && buttons[59 + 21].getText().equals("X")
                        && buttons[59 + 21 + 21].getText().equals("X")
                        && buttons[59 + 21 + 21 + 21].getText().equals("X")
                        && buttons[59 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[59 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(59 + 21, 59 + 21 + 21, 59 + 21 + 21 + 21, 59 + 21 + 21 + 21 + 21,
                            59 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[79].getText().equals("X")
                        && buttons[79 + 21].getText().equals("X")
                        && buttons[79 + 21 + 21].getText().equals("X")
                        && buttons[79 + 21 + 21 + 21].getText().equals("X")
                        && buttons[79 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[79 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(79 + 21, 79 + 21 + 21, 79 + 21 + 21 + 21, 79 + 21 + 21 + 21 + 21,
                            79 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[99].getText().equals("X")
                        && buttons[99 + 21].getText().equals("X")
                        && buttons[99 + 21 + 21].getText().equals("X")
                        && buttons[99 + 21 + 21 + 21].getText().equals("X")
                        && buttons[99 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[99 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(99 + 21, 99 + 21 + 21, 99 + 21 + 21 + 21, 99 + 21 + 21 + 21 + 21,
                            99 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[119].getText().equals("X")
                        && buttons[119 + 21].getText().equals("X")
                        && buttons[119 + 20 + 21 + 21].getText().equals("X")
                        && buttons[119 + 21 + 21 + 21].getText().equals("X")
                        && buttons[119 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[119 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(119 + 21, 119 + 21 + 21, 119 + 21 + 21 + 21, 119 + 21 + 21 + 21 + 21,
                            119 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[139].getText().equals("X")
                        && buttons[139 + 21].getText().equals("X")
                        && buttons[139 + 21 + 21].getText().equals("X")
                        && buttons[139 + 21 + 21 + 21].getText().equals("X")
                        && buttons[139 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[139 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(139 + 21, 139 + 21 + 21, 139 + 21 + 21 + 21, 139 + 21 + 21 + 21 + 21,
                            139 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[159].getText().equals("X")
                        && buttons[159 + 21].getText().equals("X")
                        && buttons[159 + 21 + 21].getText().equals("X")
                        && buttons[159 + 21 + 21 + 21].getText().equals("X")
                        && buttons[159 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[159 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(159 + 21, 159 + 21 + 21, 159 + 21 + 21 + 21, 159 + 21 + 21 + 21 + 21,
                            159 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[179].getText().equals("X")
                        && buttons[179 + 21].getText().equals("X")
                        && buttons[179 + 21 + 21].getText().equals("X")
                        && buttons[179 + 21 + 21 + 21].getText().equals("X")
                        && buttons[179 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[179 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(179 + 21, 179 + 21 + 21, 179 + 21 + 21 + 21, 179 + 21 + 21 + 21 + 21,
                            179 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[199].getText().equals("X")
                        && buttons[199 + 21].getText().equals("X")
                        && buttons[199 + 21 + 21].getText().equals("X")
                        && buttons[199 + 21 + 21 + 21].getText().equals("X")
                        && buttons[199 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[199 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(199 + 21, 199 + 21 + 21, 199 + 21 + 21 + 21, 199 + 21 + 21 + 21 + 21,
                            199 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[219].getText().equals("X")
                        && buttons[219 + 21].getText().equals("X")
                        && buttons[219 + 21 + 21].getText().equals("X")
                        && buttons[219 + 21 + 21 + 21].getText().equals("X")
                        && buttons[219 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[219 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(219 + 21, 219 + 21 + 21, 219 + 21 + 21 + 21, 219 + 21 + 21 + 21 + 21,
                            219 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[239].getText().equals("X")
                        && buttons[239 + 21].getText().equals("X")
                        && buttons[239 + 21 + 21].getText().equals("X")
                        && buttons[239 + 21 + 21 + 21].getText().equals("X")
                        && buttons[239 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[239 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(239 + 21, 239 + 21 + 21, 239 + 21 + 21 + 21, 239 + 21 + 21 + 21 + 21,
                            239 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[259].getText().equals("X")
                        && buttons[259 + 21].getText().equals("X")
                        && buttons[259 + 21 + 21].getText().equals("X")
                        && buttons[259 + 21 + 21 + 21].getText().equals("X")
                        && buttons[259 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[259 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(259 + 21, 259 + 21 + 21, 259 + 21 + 21 + 21, 259 + 21 + 21 + 21 + 21,
                            259 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[279].getText().equals("X")
                        && buttons[279 + 21].getText().equals("X")
                        && buttons[279 + 21 + 21].getText().equals("X")
                        && buttons[279 + 21 + 21 + 21].getText().equals("X")
                        && buttons[279 + 21 + 21 + 21 + 21].getText().equals("X")
                        && buttons[279 + 21 + 21 + 21 + 21 + 21].getText().equals("X")) {
                    xWin(279 + 21, 279 + 21 + 21, 279 + 21 + 21 + 21, 279 + 21 + 21 + 21 + 21,
                            279 + 21 + 21 + 21 + 21 + 21);
                } else {
                    if (buttons[i].getText().equals("X")
                            && buttons[i + 21].getText().equals("X")
                            && buttons[i + 21 + 21].getText().equals("X")
                            && buttons[i + 21 + 21 + 21].getText().equals("X")
                            && buttons[i + 21 + 21 + 21 + 21].getText().equals("X")) {
                        xWin(i, i + 21, i + 21 + 21, i + 21 + 21 + 21, i + 21 + 21 + 21 + 21);
                    }
                }
            }
        }

        // cheo right-->left
        for (int i = 0; i < 324; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 19].getText() == "X"
                    && buttons[i + 19 + 19].getText() == "X"
                    && buttons[i + 19 + 19 + 19].getText() == "X"
                    && buttons[i + 19 + 19 + 19 + 19].getText() == "X") {
                xWin(i, i + 19, i + 19 + 19, i + 19 + 19 + 19, i + 19 + 19 + 19 + 19);
            }
        }
        // dọc
        for (int i = 0; i < 320; i++) {
            if (buttons[i].getText() == "X"
                    && buttons[i + 20].getText() == "X"
                    && buttons[i + 20 + 20].getText() == "X"
                    && buttons[i + 20 + 20 + 20].getText() == "X"
                    && buttons[i + 20 + 20 + 20 + 20].getText() == "X") {
                xWin(i, i + 20, i + 20 + 20, i + 20 + 20 + 20, i + 20 + 20 + 20 + 20);
            }

        }
        ///////////////////////////////////
        // check o win
        // ngang
        // 1
        for (int i = 0; i < 20 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 2
        for (int i = 20; i < 40 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 3
        for (int i = 40; i < 60 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 4
        for (int i = 60; i < 80 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 5
        for (int i = 80; i < 100 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 6
        for (int i = 100; i < 120 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 7
        for (int i = 120; i < 140 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 8
        for (int i = 140; i < 160 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 9
        for (int i = 160; i < 180 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 10
        for (int i = 180; i < 200 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 11
        for (int i = 200; i < 220 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 12
        for (int i = 220; i < 240 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 13
        for (int i = 240; i < 260 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 14
        for (int i = 260; i < 280 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 15
        for (int i = 280; i < 300 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 16
        for (int i = 300; i < 320 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 17
        for (int i = 320; i < 340 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 18
        for (int i = 340; i < 360 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 19
        for (int i = 360; i < 380 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // 20
        for (int i = 380; i < 400 - 4; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 1].getText() == "o"
                    && buttons[i + 2].getText() == "o"
                    && buttons[i + 3].getText() == "o"
                    && buttons[i + 4].getText() == "o") {
                oWin(i, i + 1, i + 2, i + 3, i + 4);
            }
        }
        // chéo left-->right
        boolean Conditions = true;
        for (int j = 0; j <= 260; j += 20) {
            if (buttons[19 + j].getText().equals("o")
                    && buttons[19 + j + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21 + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21 + 21 + 21].getText().equals("o")) {
                Conditions = false;
            }
            if (buttons[18 + j].getText().equals("o")
                    && buttons[18 + j + 21].getText().equals("o")
                    && buttons[18 + j + 21 + 21].getText().equals("o")
                    && buttons[18 + j + 21 + 21 + 21].getText().equals("o")
                    && buttons[18 + j + 21 + 21 + 21 + 21].getText().equals("o")) {
                Conditions = false;
            }
            if (buttons[17 + j].getText().equals("o")
                    && buttons[17 + j + 21].getText().equals("o")
                    && buttons[17 + j + 21 + 21].getText().equals("o")
                    && buttons[17 + j + 21 + 21 + 21].getText().equals("o")
                    && buttons[17 + j + 21 + 21 + 21 + 21].getText().equals("o")) {
                Conditions = false;
            }
            if (buttons[16 + j].getText().equals("o")
                    && buttons[16 + j + 21].getText().equals("o")
                    && buttons[16 + j + 21 + 21].getText().equals("o")
                    && buttons[16 + j + 21 + 21 + 21].getText().equals("o")
                    && buttons[16 + j + 21 + 21 + 21 + 21].getText().equals("o")) {
                Conditions = false;
            }
            if (buttons[19 + j].getText().equals("o")
                    && buttons[19 + j + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21 + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21 + 21 + 21].getText().equals("o")
                    && buttons[19 + j + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                Conditions = true;
            }
        }
        if (Conditions == true) {
            for (int i = 0; i < 316; i++) {
                if (buttons[19].getText().equals("o")
                        && buttons[19 + 21].getText().equals("o")
                        && buttons[19 + 21 + 21].getText().equals("o")
                        && buttons[19 + 21 + 21 + 21].getText().equals("o")
                        && buttons[19 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[19 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(19 + 21, 19 + 21 + 21, 19 + 21 + 21 + 21, 19 + 21 + 21 + 21 + 21,
                            19 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[39].getText().equals("o")
                        && buttons[39 + 21].getText().equals("o")
                        && buttons[39 + 21 + 21].getText().equals("o")
                        && buttons[39 + 21 + 21 + 21].getText().equals("o")
                        && buttons[39 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[39 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(39 + 21, 39 + 21 + 21, 39 + 21 + 21 + 21, 39 + 21 + 21 + 21 + 21,
                            39 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[59].getText().equals("o")
                        && buttons[59 + 21].getText().equals("o")
                        && buttons[59 + 21 + 21].getText().equals("o")
                        && buttons[59 + 21 + 21 + 21].getText().equals("o")
                        && buttons[59 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[59 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(59 + 21, 59 + 21 + 21, 59 + 21 + 21 + 21, 59 + 21 + 21 + 21 + 21,
                            59 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[79].getText().equals("o")
                        && buttons[79 + 21].getText().equals("o")
                        && buttons[79 + 21 + 21].getText().equals("o")
                        && buttons[79 + 21 + 21 + 21].getText().equals("o")
                        && buttons[79 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[79 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(79 + 21, 79 + 21 + 21, 79 + 21 + 21 + 21, 79 + 21 + 21 + 21 + 21,
                            79 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[99].getText().equals("o")
                        && buttons[99 + 21].getText().equals("o")
                        && buttons[99 + 21 + 21].getText().equals("o")
                        && buttons[99 + 21 + 21 + 21].getText().equals("o")
                        && buttons[99 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[99 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(99 + 21, 99 + 21 + 21, 99 + 21 + 21 + 21, 99 + 21 + 21 + 21 + 21,
                            99 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[119].getText().equals("o")
                        && buttons[119 + 21].getText().equals("o")
                        && buttons[119 + 20 + 21 + 21].getText().equals("o")
                        && buttons[119 + 21 + 21 + 21].getText().equals("o")
                        && buttons[119 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[119 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(119 + 21, 119 + 21 + 21, 119 + 21 + 21 + 21, 119 + 21 + 21 + 21 + 21,
                            119 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[139].getText().equals("o")
                        && buttons[139 + 21].getText().equals("o")
                        && buttons[139 + 21 + 21].getText().equals("o")
                        && buttons[139 + 21 + 21 + 21].getText().equals("o")
                        && buttons[139 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[139 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(139 + 21, 139 + 21 + 21, 139 + 21 + 21 + 21, 139 + 21 + 21 + 21 + 21,
                            139 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[159].getText().equals("o")
                        && buttons[159 + 21].getText().equals("o")
                        && buttons[159 + 21 + 21].getText().equals("o")
                        && buttons[159 + 21 + 21 + 21].getText().equals("o")
                        && buttons[159 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[159 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(159 + 21, 19 + 21 + 21, 159 + 21 + 21 + 21, 19 + 21 + 21 + 21 + 21,
                            159 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[179].getText().equals("o")
                        && buttons[179 + 21].getText().equals("o")
                        && buttons[179 + 21 + 21].getText().equals("o")
                        && buttons[179 + 21 + 21 + 21].getText().equals("o")
                        && buttons[179 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[179 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(179 + 21, 179 + 21 + 21, 179 + 21 + 21 + 21, 179 + 21 + 21 + 21 + 21,
                            179 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[199].getText().equals("o")
                        && buttons[199 + 21].getText().equals("o")
                        && buttons[199 + 21 + 21].getText().equals("o")
                        && buttons[199 + 21 + 21 + 21].getText().equals("o")
                        && buttons[199 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[199 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(199 + 21, 199 + 21 + 21, 199 + 21 + 21 + 21, 199 + 21 + 21 + 21 + 21,
                            199 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[219].getText().equals("o")
                        && buttons[219 + 21].getText().equals("o")
                        && buttons[219 + 21 + 21].getText().equals("o")
                        && buttons[219 + 21 + 21 + 21].getText().equals("o")
                        && buttons[219 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[219 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(219 + 21, 219 + 21 + 21, 219 + 21 + 21 + 21, 219 + 21 + 21 + 21 + 21,
                            219 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[239].getText().equals("o")
                        && buttons[239 + 21].getText().equals("o")
                        && buttons[239 + 21 + 21].getText().equals("o")
                        && buttons[239 + 21 + 21 + 21].getText().equals("o")
                        && buttons[239 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[239 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(239 + 21, 239 + 21 + 21, 239 + 21 + 21 + 21, 239 + 21 + 21 + 21 + 21,
                            239 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[259].getText().equals("o")
                        && buttons[259 + 21].getText().equals("o")
                        && buttons[259 + 21 + 21].getText().equals("o")
                        && buttons[259 + 21 + 21 + 21].getText().equals("o")
                        && buttons[259 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[259 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(259 + 21, 259 + 21 + 21, 259 + 21 + 21 + 21, 259 + 21 + 21 + 21 + 21,
                            259 + 21 + 21 + 21 + 21 + 21);
                } else if (buttons[279].getText().equals("o")
                        && buttons[279 + 21].getText().equals("o")
                        && buttons[279 + 21 + 21].getText().equals("o")
                        && buttons[279 + 21 + 21 + 21].getText().equals("o")
                        && buttons[279 + 21 + 21 + 21 + 21].getText().equals("o")
                        && buttons[279 + 21 + 21 + 21 + 21 + 21].getText().equals("o")) {
                    oWin(279 + 21, 279 + 21 + 21, 279 + 21 + 21 + 21, 279 + 21 + 21 + 21 + 21,
                            279 + 21 + 21 + 21 + 21 + 21);
                } else {
                    if (buttons[i].getText().equals("o")
                            && buttons[i + 21].getText().equals("o")
                            && buttons[i + 21 + 21].getText().equals("o")
                            && buttons[i + 21 + 21 + 21].getText().equals("o")
                            && buttons[i + 21 + 21 + 21 + 21].getText().equals("o")) {
                        oWin(i, i + 21, i + 21 + 21, i + 21 + 21 + 21, i + 21 + 21 + 21 + 21);
                    }
                }
            }
        }

        // cheo right-->left
        for (int i = 0; i < 324; i++) {
            if (buttons[i].getText() == "o"
                    && buttons[i + 19].getText() == "o"
                    && buttons[i + 19 + 19].getText() == "o"
                    && buttons[i + 19 + 19 + 19].getText() == "o"
                    && buttons[i + 19 + 19 + 19 + 19].getText() == "o") {
                oWin(i, i + 19, i + 19 + 19, i + 19 + 19 + 19, i + 19 + 19 + 19 + 19);
            }
        }
        // dọc
        for (int i = 0; i < 320; i++) {
            if ("o".equals(buttons[i].getText())
                    && buttons[i + 20].getText() == "o"
                    && "o".equals(buttons[i + 20 + 20].getText())
                    && "o".equals(buttons[i + 20 + 20 + 20].getText())
                    && "o".equals(buttons[i + 20 + 20 + 20 + 20].getText())) {
                oWin(i, i + 20, i + 20 + 20, i + 20 + 20 + 20, i + 20 + 20 + 20 + 20);
            }

        }

    }

    // công khai người chiến thắng
    public void xWin(int a, int b, int c, int d, int e) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);
        buttons[e].setBackground(Color.GREEN);

        for (int i = 0; i < 400; i++) {
            // vô hiệu hóa giao diện
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins");
    }

    public void oWin(int a, int b, int c, int d, int e) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);
        buttons[e].setBackground(Color.GREEN);

        for (int i = 0; i < 400; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("O wins");
    }
    
}
