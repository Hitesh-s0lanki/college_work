import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Textarea_ui extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public Textarea_ui() {
        setTitle("File Viewer");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton openButton = new JButton("Open File");

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Textarea_ui().setVisible(true);
            }
        });
    }
}
