package buttons;

import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;
  JLabel label;

  MyFrame() {

    ImageIcon icon = new ImageIcon("buttons/point.png");
    ImageIcon icon2 = new ImageIcon("buttons/face.png");

    label = new JLabel();
    label.setIcon(icon2);
    label.setBounds(150, 250, 150, 150);
    label.setVisible(false);

    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    // In case the class implements ActionListener
    button.addActionListener(this);
    // Using lesser syntax by using lambda expression
    // button.addActionListener(e -> System.out.println("Button clicked"));
    button.setText("I'm a button!");
    button.setFocusable(false); // removes border around the text
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans", Font.BOLD, 25));
    button.setIconTextGap(-10);
    button.setForeground(Color.cyan);
    button.setBackground(Color.lightGray);
    button.setBorder(BorderFactory.createEtchedBorder());
    // button.setEnabled(false);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);
    this.add(button);
    this.add(label);
  }

  // The class needs to implement ActionListener for this method to be overridden
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      // System.out.println("Button clicked");
      // button.setEnabled(false);
      label.setVisible(true);
    }
  }
}
