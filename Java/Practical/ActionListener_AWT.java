import java.awt.*;
import java.awt.event.*;

public class ActionListener_AWT extends Frame implements ActionListener {

    Button northButton, southButton, eastButton, westButton;
    TextArea textArea;

    ActionListener_AWT() {
        super("Action Event");
        setSize(500, 500);
        setVisible(true);

        setLayout(new BorderLayout());

        northButton = new Button("North");
        southButton = new Button("Print Text");
        eastButton = new Button("East");
        westButton = new Button("West");
        textArea = new TextArea("Center");

        // textArea.setBounds(20, 100, 300, 300);

        northButton.addActionListener(this);
        southButton.addActionListener(this);
        eastButton.addActionListener(this);
        westButton.addActionListener(this);

        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == northButton) {
            System.out.println("North Button pressed");
        } else if (e.getSource() == southButton) {
            System.out.println(textArea.getText());
        }
    }

    public static void main(String[] args) {
        new ActionListener_AWT();
    }
}
