package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public MainWindow() {
	setLayout(new FlowLayout());
	add(new JLabel("Hello World!"));
	
    }
}
