import java.awt.*;
import javax.swing.*;

public class GridView_Swing {
    JFrame frame;

    GridView_Swing() {
        frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(3, 3));
        panel.setBackground(Color.BLUE);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("Button : " + i);
            panel.add(button);
        }

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridView_Swing();
    }
}
