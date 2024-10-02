import javax.swing.*;
import java.awt.event.*;

public class ButtonApplet extends JApplet
                          implements ActionListener {
  int act = 0;     // 用來記錄按鈕被次數的變數
  JButton mybutton = new JButton("換個文字");

  // 用建構方法來建立元件、將元件加入視窗、顯示視窗
  public ButtonApplet() {
    mybutton.addActionListener(this);
    getContentPane().add(mybutton);
  }

  public void actionPerformed(ActionEvent e) {
    act++;    // 將按鈕次數加 1
    mybutton.setText("發生 " + act + " 次按鈕事件");
  }
}
