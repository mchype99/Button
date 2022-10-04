package frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button {
    public static JButton createButton(final int i, final JLabel label, final ShapeIcon icon) {
        Color[] colors = new Color[]{Color.RED, Color.YELLOW, Color.BLUE};
        final String[] cName = new String[]{"RED", "YELLOW", "BLUE"};
        final Color c = colors[i];
        JButton button = new JButton(cName[i]);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                icon.fillPaint(colors[i]);
                label.repaint();
            }
        });
        return button;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        final int FIELD_WIDTH = 20;
        final JTextField textField = new JTextField(FIELD_WIDTH);
        JButton yellow = new JButton();
        JButton red = new JButton();
        JButton blue = new JButton();
        JPanel panel = new JPanel();
        JButton btn[] = {red, yellow, blue};
        ShapeIcon icon = new ShapeIcon(50, 25);
        JLabel label = new JLabel(icon);
        panel.add(label);
        for (int i = 0; i < 3; i++) {
            btn[i] = createButton(i, label, icon);
            panel.add(btn[i]);
        }
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    }
}
