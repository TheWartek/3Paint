package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import model.Environment;

import controller.NewAction;
import controller.QuitAction;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private JMenuBar menu = new JMenuBar();

    public MainWindow() {
	//application icon
	ImageIcon icon = new ImageIcon(getClass().getResource("/resources/images/3Paint.png"));
	setIconImage(icon.getImage());
	
	setLayout(new BorderLayout());
	//creating menu bar
	buildMenu();
	setJMenuBar(menu);
	
	JPanel p = new JPanel();
	p.setLayout(new FlowLayout());
	p.add(new JLabel("Pasek narzêdzi"));
	p.setBorder(BorderFactory.createRaisedBevelBorder());
	JToolBar t = new JToolBar("sadsada", JToolBar.HORIZONTAL);
	t.setBorder(BorderFactory.createEtchedBorder());
	t.add(new JButton("ghjgjg"));
	add(BorderLayout.NORTH, t);
	add(BorderLayout.WEST, p);
	p = new JPanel();
	p.setLayout(new FlowLayout());
	p.add(new JLabel("Warstwy i inne"));
	p.setBorder(BorderFactory.createRaisedBevelBorder());
	add(BorderLayout.EAST, p);
	p = new JPanel();
	p.setLayout(new FlowLayout());
	p.add(new JLabel("Pasek stanu"));
	add(BorderLayout.SOUTH, p);
    }
    
    private void buildMenu() {
	JMenu a = new JMenu("Plik");
	JMenuItem item = null;
	
	item = new JMenuItem("Nowy");
	item.addActionListener(new NewAction(this));
	a.add(item);
	
	a.addSeparator();
	
	item = new JMenuItem("Wyjœcie");
	item.addActionListener(new QuitAction(this));
	a.add(item);
	
	menu.add(a);
    }
    
    public void refreshProjectTabs() {
	System.out.println("Refreshing tabs with projects...");
	System.out.println(Environment.wrkman.numOfWorkspaces());
    }
}
