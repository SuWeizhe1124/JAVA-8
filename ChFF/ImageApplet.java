import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ShowImage extends JPanel {
  Image img; // 代表影像的物件

  public ShowImage(Image i) {
    img = i;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    AffineTransform at = new AffineTransform();
    Dimension d = getSize();
    double sc = Math.min(d.width/(double)img.getWidth(null),
                         d.height/(double)img.getHeight(null));
    at.scale(sc,sc);
    g2.drawImage(img, at, this);
  }
}

public class ImageApplet extends JApplet {
  public void init () {
    // 從網頁中取得影像檔名參數
    Image i= getImage(getDocumentBase(), getParameter("fname"));

    // 建立 Panel 物件, 並加入 Content Pane 中
    ShowImage p = new ShowImage(i);
    getContentPane().add(p);
  }
}
