package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.dialogs.AboutDialog;

public class AboutAction implements ActionListener {
    private JFrame parent;
    
    public AboutAction(JFrame p) {
	parent = p;
    }
    
    public void actionPerformed(ActionEvent e) {
	new AboutDialog(parent);
    }
}
