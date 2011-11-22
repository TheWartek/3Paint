package view.dialogs;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.NewAction;

public class NewProject extends JDialog {
    private static final long serialVersionUID = -524239917053925288L;
    private JTextField width = new JTextField(10);
    private JTextField height = new JTextField(10);
    private JTextField name = new JTextField(15);
    private JButton cancel = new JButton("Anuluj");
    private JButton ok = new JButton("OK");
    private JLabel l1 = new JLabel("Szerokoœæ:");
    private JLabel l2 = new JLabel("Wysokoœæ:");
    //private ActionListener parentActionListener;
    private boolean canceled = true;

    private ActionListener okAction = new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    //((NewAction) parentActionListener).setCanceled(false);
	    canceled = false;
	    String w = width.getText();
	    String h = height.getText();
	    String n = name.getText();

	    if (w.isEmpty() || h.isEmpty() || n.isEmpty()) {
		JOptionPane.showMessageDialog(NewProject.this, "Nie wprowadzono wszystkich danych.", "B³¹d", JOptionPane.ERROR_MESSAGE);
		//((NewAction) parentActionListener).setCanceled(true);
		canceled = true;
		return;
	    }

	    try {
		Integer.parseInt(w);
		Integer.parseInt(h);
	    } catch (NumberFormatException nfe) {
		JOptionPane.showMessageDialog(NewProject.this, "Szerokoœæ i wysokoœæ musi byæ liczb¹.", "B³¹d", JOptionPane.ERROR_MESSAGE);
		//((NewAction) parentActionListener).setCanceled(true);
		canceled = true;
		return;
	    }
	    dispose();
	}
    };

    private ActionListener cancelAction = new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    dispose();
	}
    };

    public NewProject(JFrame parent) {//, final ActionListener parentActionListener) {
	super(parent, "Nowy...");
	setLayout(new FlowLayout());
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	//this.parentActionListener = parentActionListener;

	JPanel p1 = new JPanel();
	p1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Ustawienia"));
	p1.setLayout(new FlowLayout());
	JPanel tmp = new JPanel();
	tmp.setLayout(new GridLayout(2, 1));
	tmp.add(l1);
	tmp.add(l2);
	p1.add(tmp);
	tmp = new JPanel();
	tmp.setLayout(new GridLayout(2, 1));
	tmp.add(width);
	tmp.add(height);
	p1.add(tmp);
	p1.setPreferredSize(new Dimension(220, 200));

	cancel.addActionListener(cancelAction);
	ok.addActionListener(okAction);

	add(new JLabel("Nazwa:"));
	add(name);
	add(p1);
	add(ok);
	add(cancel);

	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	setSize(240, 300);
	setLocation((int) d.getWidth() / 2 - 250, (int) d.getHeight() / 2 - 300);
	setResizable(false);
	setModalityType(Dialog.DEFAULT_MODALITY_TYPE);
	setVisible(true);
    }

    public String getWidthValue() {
	return width.getText();
    }

    public String getHeightValue() {
	return height.getText();
    }

    public String getName() {
	return name.getText();
    }
    
    public boolean isCanceled() {
	return canceled;
    }
}
