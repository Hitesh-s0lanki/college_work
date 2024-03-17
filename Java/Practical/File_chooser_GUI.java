import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class File_chooser_GUI extends JFrame {

    JButton button;
    JTextArea textArea;
    JScrollPane scrollPane;
    JFileChooser fileChooser;

    File_chooser_GUI() {
        setTitle("File Chooser");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Open File");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        setLayout(new BorderLayout());
        add(button, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
        setSize(300, 300);
    }

    public void openFile() {
        fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                BufferedReader reader = new BufferedReader(new FileReader(file));

                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                textArea.setText(content.toString());
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new File_chooser_GUI();
    }
}
