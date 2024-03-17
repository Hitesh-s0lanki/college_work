import javax.swing.*;
import java.awt.*;

public class BorderView extends JFrame {

    JButton northButton, southButton, eastButton, westButton, centerButton;

    BorderView() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        northButton = new JButton("North");
        southButton = new JButton("South");
        westButton = new JButton("West");
        eastButton = new JButton("East");
        centerButton = new JButton("Center");

        setLayout(new BorderLayout());

        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(westButton, BorderLayout.WEST);
        add(eastButton, BorderLayout.EAST);
        add(centerButton, BorderLayout.CENTER);

        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new BorderView();
    }
}
