import java.awt.*;
import java.awt.event.*;

public class All_Event extends Frame implements MouseListener {
    All_Event() {

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        Button button = new Button("Come");
        button.addMouseListener(this);

        setLayout(new BorderLayout());
        add(button, BorderLayout.CENTER);

        setVisible(true);
        setSize(400, 400);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        System.out.println(e.getX() + "\t" + e.getY());
    }

    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new All_Event();
    }
}