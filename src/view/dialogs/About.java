package view.dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.DisposeAction;

public class About extends JDialog {
    private static final long serialVersionUID = -5201660923822684104L;
    
    private JButton ok = new JButton("OK");

    public About(JFrame parent) {
	super(parent, "3Paint - informacje");
	setLayout(new BorderLayout());
	setSize(500, 350);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	setLocation(d.width/4, d.height/4);
	setResizable(false);
	setAlwaysOnTop(true);
	//setUndecorated(true);
	
	ok.addActionListener(new DisposeAction(this));
	JPanel p = new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.RIGHT));
	p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	p.add(ok);
	add(BorderLayout.SOUTH, p);
	
	p = new JPanel();
	p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	p.setPreferredSize(new Dimension(100, getHeight()));
	add(BorderLayout.WEST, p);
	
	p = new JPanel();
	p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	p.add(new JLabel("<html><font size='7'><b>3Paint</b></font><br /><hr /></html>"));
	add(p);
	
	setVisible(true);
    }
}
