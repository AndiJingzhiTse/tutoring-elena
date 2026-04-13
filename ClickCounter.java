
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickCounter {

    private int count = 0;

    public ClickCounter() {
        JFrame frame = new JFrame("Click Counter");
        JButton button = new JButton("Click me!"); // source
        JLabel label = new JLabel("Count: 0");

        // contructor
        ActionListener actionListener = new ActionListener() { // listener
            public void actionPerformed(ActionEvent e) {
                // take an event, perform some action
                count++;
                label.setText("Count: " + count);
            }
        };

       

        button.addActionListener(actionListener);

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}
