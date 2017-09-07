import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;
public class Hello extends JApplet{
    public void paint(Graphics canvas){
        Font font = new Font("Blackadder ITC", Font.BOLD,50);
        canvas.setFont(font);
        canvas.drawString("Hello World!",750,400);
        canvas.drawLine(700,450,800,450);
    }
}