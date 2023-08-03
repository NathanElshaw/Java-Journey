import java.awt.Dimension;

import javax.swing.*;

public class App {
    private JPanel panel;
    private JFrame frame;
    private JLabel label;

    public App() {
        panel = new JPanel();
        frame = new JFrame();
        label = new JLabel();

        frame.setTitle("New Gui");
        label.setBounds(10, 25, 80, 25);
        label.setText("New Text");
        panel.setBorder(BorderFactory.createEmptyBorder(100, 175, 100, 175));
        frame.setMinimumSize(new Dimension(100, 100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
