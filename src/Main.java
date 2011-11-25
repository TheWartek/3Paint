import static view.SwingConsole.run;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

import javax.swing.JFrame;

import model.Environment;
import view.MainWindow;

public class Main extends JFrame {

    private static final long serialVersionUID = -507747117337729640L;
    private static int barWidth = 447;

    static void renderSplashScreen(Graphics2D g, int progress, String text) {
	g.setComposite(AlphaComposite.Clear);
	g.fillRect(0, 0, 500, 300);
	g.setPaintMode();
	g.setColor(Color.BLACK);
	g.drawString("Loading " + text + "...", 25, 270);
	g.setColor(Color.BLUE);
	g.fillRect(24, 224, (barWidth * progress) / 100, 15);
    }

    public Main() {
	setSize(500, 300);
	setLayout(new BorderLayout());
	SplashScreen splash = SplashScreen.getSplashScreen();
	if (splash == null) {
	    System.err.println("Cannot initialize splashscreen.");
	    return;
	}
	Graphics2D g = splash.createGraphics();
	if (g == null) {
	    System.err.println("Cannot create graphics context.");
	    return;
	}

	renderSplashScreen(g, 50, "Environtment: Initializing Workspace Manager...");
	splash.update();

	Environment.wrkmanInit();

	renderSplashScreen(g, 100, "GUI: Drawing Main Window...");
	splash.update();
	
	run(new MainWindow(), "3Paint", 800, 600);
    }

    public static void main(String[] args) {
	@SuppressWarnings("unused")
	Main m = new Main();
    }

}
