import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField textField;

    public App() {
        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("Login");
        button.addActionListener(this);
        label = new JLabel();
        textField = new JTextField(20);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 175, 100, 175));
        frame.setSize(350, 200);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("gui");
        frame.pack();

        label.setBounds(10, 25, 80, 25);
        label.setText("Username:");
        textField.setBounds(100, 20, 165, 25);
        panel.add(label);
        panel.add(textField);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
        ;
    }
}
