import java.awt.*;
import java.awt.event.*;

public class Key_Event extends Frame implements KeyListener {
    Key_Event() {

        TextArea textArea = new TextArea();
        setLayout(new BorderLayout());

        textArea.addKeyListener(this);

        add(textArea, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(ABORT);
            }
        });

        setVisible(true);
        setSize(100, 100);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        new Key_Event();
    }
}
