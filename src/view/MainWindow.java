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
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private JMenuBar menu = new JMenuBar();

    public MainWindow() {
	ImageIcon icon = new ImageIcon(getClass().getResource("/resources/images/3Paint.png"));
	setIconImage(icon.getImage());
	setLayout(new BorderLayout());
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
	a.add(new JMenuItem("Nowy"));
	a.add(new JMenuItem("Otwórz"));
	a.add(new JMenuItem("Zapisz"));
	a.addSeparator();
	a.add(new JMenuItem("Zamknij"));
	a.add(new JMenuItem("Zamknij wszystkie"));
	a.addSeparator();
	a.add(new JMenuItem("Wyjœcie"));
	menu.add(a);
    }
}
