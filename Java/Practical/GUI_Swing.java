import java.awt.*;
import javax.swing.*;

//Grid layout

public class GUI_Swing {
    JFrame frame;

    GUI_Swing() {
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3)); // 3 rows, 3 columns

        // Add buttons to the panel
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button, BorderLayout.SOUTH);
        }

        // Add the panel to the frame
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Swing();
    }
}
