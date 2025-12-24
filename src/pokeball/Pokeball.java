
package pokeball;
import java.awt.*;  
import javax.swing.*;
public class Pokeball extends JComponent {
    static int w = 700; 
    static int h = 600; 
    public static void main(String[] args) {
       JFrame frame = new JFrame();     
  Pokeball canvas = new Pokeball(); 
  frame.getContentPane().setBackground( Color.white); 
  frame.setSize(w, h);    
  frame.setTitle("Drawing in Java");  
  frame.add(canvas);    
  frame.setLocationRelativeTo(null);  
  frame.setVisible(true);    
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override 
    protected void paintComponent(Graphics g) {
         Graphics2D g2d = (Graphics2D) g;
         g2d.setColor(Color.BLACK); 
         g2d.drawOval(150, 70, 400, 400); 
         g2d.setColor( Color.LIGHT_GRAY); 
         g2d.drawArc(150, 69, 400, 400, 190, 354); 
         g2d.fillArc(150, 69, 400, 400,190, 354);
         g2d.setColor(new Color(235,235,235)); 
         g2d.drawArc(218, 120, 330, 300, 0, 360); 
         g2d.fillArc(218, 120, 330, 300,0, 360);
         g2d.setColor( Color.red); 
         g2d.drawArc(150, 69, 400, 400, 355, 200); 
         g2d.fillArc(150, 69, 400, 400,355, 200); 
         g2d.setColor(Color.DARK_GRAY);
         g2d.drawOval(330, 210, 100, 100);
         g2d.fillOval(330, 210, 100, 100);
         int[] xPoints = {152, 340, 350, 158};
         int[] yPoints = {290, 245, 280, 335};
         g2d.drawPolygon(xPoints, yPoints, 4);
         g2d.fillPolygon(xPoints, yPoints, 4);
         int[] xPoints2 = {410, 550, 550, 410};
         int[] yPoints2 = {240, 245, 290, 275};
         g2d.drawPolygon(xPoints2, yPoints2, 4);
         g2d.fillPolygon(xPoints2, yPoints2, 4);
         g2d.setColor(new Color(235,235,235)); 
         g2d.drawArc(200, 100, 160, 110, 0, 360); 
         g2d.fillArc(200, 100, 160, 110, 0, 360);
         g2d.setColor(new Color(235,235,235));
         g2d.drawOval(343, 223, 75, 75);
         g2d.fillOval(343, 223, 75, 75);
         g2d.setColor(Color.DARK_GRAY);
         g2d.drawOval(350, 230, 60, 60);
    }
}
