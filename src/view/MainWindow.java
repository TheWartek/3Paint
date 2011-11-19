package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainWindow() {
	ImageIcon icon = new ImageIcon(getClass().getResource("/resources/images/3Paint.png"));
	setIconImage(icon.getImage());
	setLayout(new FlowLayout());
	add(new JLabel("Hello World!"));
	
    }
}
