package frames;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

  MyFrame() {
    this.setTitle("JFrame title goes here"); // set title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application on close
    this.setResizable(false); // prevent user from resizing window
    this.setSize(420, 420); // sets the x-dimension and y-dimension of the frame
    this.setVisible(true); // makes the frame visible

    ImageIcon image = new ImageIcon("code-school.png"); // create an ImageIcon
    this.setIconImage(image.getImage()); // change icon of frame

    // change background color of frame using static constants
    // this.getContentPane().setBackground(Color.green);
    // change background color of frame using RGB values
    // this.getContentPane().setBackground(new Color(0, 255, 0));
    // change background color of frame using hexadecimal values
    this.getContentPane().setBackground(new Color(0xFFFFFF));
  }
}
