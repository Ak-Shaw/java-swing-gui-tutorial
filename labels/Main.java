package labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

  public static void main(String[] args) {

    ImageIcon image = new ImageIcon("labels/dude.png");
    Border border = BorderFactory.createLineBorder(Color.green, 3);

    JLabel label = new JLabel(); // create a label
    label.setText("Bro, do you even code?"); // set text of label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of ImageIcon
    label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of ImageIcon
    label.setForeground(Color.green); // set font color of text
    label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text
    label.setIconTextGap(-10); // set gap between text and ImageIcon (can have -ve values)
    label.setBackground(Color.black); // set background color
    label.setOpaque(true); // display background color
    label.setBorder(border); // set border of label
    label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
    label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
    // set x-dimension, y-dimension, width, height of label
    // label.setBounds(100, 100, 250, 250);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(500, 500);
    // frame.setLayout(null); // in case of null layout, we'll have to set the
    // bounds for the label
    frame.setVisible(true);
    frame.add(label);
    frame.pack(); // resize the size of the frame to accommodate all the components
    // pack() should be added after adding all the labels to the frame
  }

}
