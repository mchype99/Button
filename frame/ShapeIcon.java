package q4;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ShapeIcon implements Icon {
    ShapeIcon(int width, int height) {
        this.width = width;
        this.height = height;
        color = Color.yellow;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Shape rectangle = new Rectangle2D.Double(x, y, width, height);
        g2.setColor(color);
        g2.fill(rectangle);
    }

    public void fillPaint(Color c) {
        if (c == Color.RED) {
            color = Color.RED;
        } else if (c == Color.YELLOW) {
            color = Color.YELLOW;
        } else if (c == Color.BLUE) {
            color = Color.BLUE;
        }
    }
    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
    private int width, height;
    private Color color;
}