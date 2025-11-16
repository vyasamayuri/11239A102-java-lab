import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class SimpleApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello! This is my first Swing Program!", 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing Window");
        SimpleApplet panel = new SimpleApplet();

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
