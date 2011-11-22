package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import model.Environment;
import view.MainWindow;
import view.dialogs.NewProject;

public class NewAction implements ActionListener {
    private JFrame parent;
    private boolean canceled = true;
    
    public NewAction(JFrame parent) {
	this.parent = parent;
    }
    
    public void actionPerformed(ActionEvent e) {
	NewProject p = new NewProject(parent, this);
	
	if (!canceled) {
	    int width = Integer.parseInt(p.getWidthValue());
	    int height = Integer.parseInt(p.getHeightValue());
	    Environment.wrkman.newWorkspace(width, height, "Nazwa");
	    canceled = true;
	}
	
	((MainWindow)parent).refreshProjectTabs();
    }
    
    public void setCanceled(boolean val) {
	canceled = val;
    }
}
