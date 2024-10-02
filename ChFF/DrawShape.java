import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class MyPanel extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    double Width  = getSize().width - 10;
    double Height = getSize().height/2 - 10;

    Graphics2D g2 = (Graphics2D) g;
    g2.setPaint(Color.red);
    g2.fill(new
       Rectangle2D.Double(5,10,Width,Height));

    g2.setPaint(new Color(64,128,64));
    g2.fill(new
       RoundRectangle2D.Double(5,15+Height,Width,Height,20,30));
  }
}

public class DrawShape extends JApplet {
  public void init() {
    getContentPane().add(new MyPanel());
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("幾何圖案");
    f.getContentPane().add(new MyPanel());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(320,240);
    f.setVisible(true);
  }
}

