package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class QuitAction implements ActionListener {
    private JFrame frame;
    
    public QuitAction(JFrame f) {
	frame = f;
    }
    
    public void actionPerformed(ActionEvent e) {
	frame.dispose();
    }
}
