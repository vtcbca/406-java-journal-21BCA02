/*Write an applet program which accepts number of ovals user wants to 
display using parameter tag and draws ovals in different positions.*/
import java.applet.Applet;
import java.awt.Graphics;

public class OvalApplet extends Applet {
	/*<applet code="OvalApplet.class" width="500" height="500">
            <param name="numOfOvals" value="5">
        </applet>*/
    private int numOfOvals;
    
    public void init() {
        String numOfOvalsStr = getParameter("numOfOvals");
        numOfOvals = Integer.parseInt(numOfOvalsStr);
    }
    
    public void paint(Graphics g) {
        for (int i = 0; i < numOfOvals; i++) {
            int x = (int)(Math.random() * getWidth());
            int y = (int)(Math.random() * getHeight());
            int width = (int)(Math.random() * 100);
            int height = (int)(Math.random() * 100);
            g.drawOval(x, y, width, height);
        }
    }
}
