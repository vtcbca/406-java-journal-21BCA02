/*Create an applet which displays a solid square having red colour. Display name 
of your college within the square with font style =’Times New Roman’, 
font size=12 and font colour=’Yellow’. */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class CollegeSquare extends Applet {
	/*<applet code="CollegeSquare.class" width="700" height="400"></applet>*/


    public void paint(Graphics g) {
        // draw square
        g.setColor(Color.RED);
        g.fillRect(50, 50, 550, 200);
        
        // set font
        Font font = new Font("Times New Roman", Font.PLAIN, 12);
        g.setFont(font);
        
        // draw text
        g.setColor(Color.YELLOW);
        g.drawString("VIDHYABHARTI TRUST COLLEAGE OF BUSINESS,COMPUTER-SCIENCE AND RESEARCH", 70, 130);
    }
}
