import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel1 extends JPanel {
    public NorthPanel1() {
        setBackground(Color.LIGHT_GRAY);
        // setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Close"));
        add(new JButton("Exit"));
    }
}

class CenterPanel1 extends JPanel {
    public CenterPanel1() {
        setLayout(null);
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 250);
            int y = (int) (Math.random() * 250);
            JLabel label = new JLabel("*");
            label.setForeground(Color.GREEN);
            label.setLocation(x, y);
            label.setSize(20, 20);
            label.setOpaque(true);
            add(label);
        }
    }
}

class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        add(new JButton("Integer Input"));
        add(new TextField(15));
    }
}

public class Problem08 extends JFrame {
    Problem08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel nP = new NorthPanel();
        CenterPanel nC = new CenterPanel();
        SouthPanel nS = new SouthPanel();
        add(nP, BorderLayout.NORTH);
        add(nS, BorderLayout.SOUTH);
        add(nC);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Problem08();
    }
}