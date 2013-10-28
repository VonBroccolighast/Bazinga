/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bazinga;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author liambrockley
 */
public class Dilbert {
    private Point position = new Point (100, 100);
    private Dimension size = new Dimension (500,500);
    
    public void draw(Graphics graphics){
    
        
       
        graphics.setColor(new Color(255,222,190));
       // graphics.fillOval(position.x, position.y, 10,10);
        graphics.fillRect(position.x + (size.width/4), position.y + (size.height/9), size.width/5, size.height/100*32);
        graphics.fillOval(position.x + (size.width/5),position.y + (size.height/12), size.width/15, size.height/18);
        graphics.fillOval(position.x + (size.width/4),position.y + (size.height/12), size.width/15, size.height/18 );
        graphics.fillOval(position.x + (size.width*9/30),position.y + (size.height/12), size.width/15, size.height/18 );
        graphics.fillOval(position.x + (size.width*100/275),position.y + (size.height/12), size.width/15, size.height/18 );
        graphics.fillOval(position.x + (size.width*100/240),position.y + (size.height/12), size.width/15, size.height/18 );
        
        graphics.fillOval(position.x + (size.width/100*22), position.y + (size.height/5), size.width/25, size.height/22);
        graphics.fillOval(position.x + (size.width/100*43), position.y + (size.height/5), size.width/25, size.height/22);
        
        graphics.setColor(Color.BLACK);
        graphics.drawArc(position.x + (size.width/100*32), position.y + (size.height/4), size.width/16, size.height/15, 130, 280);
        graphics.drawLine(position.x + (size.width/4), position.y + (size.height/6),position.x + (size.width/3), position.y + (size.height/5));
        graphics.drawLine(position.x + (size.width-size.width/100*55), position.y + (size.height/6),position.x + (size.width-size.width/100*65), position.y + (size.height/5));
        
        graphics.drawArc(position.x + (size.width/100*23), position.y + (size.height/100*21), size.width/30, size.height/35, 90, 180);
        graphics.drawArc(position.x + (size.width/100*43), position.y + (size.height/100*21), size.width/30, size.height/35, 270, 180);
        
        graphics.drawRect(position.x + (size.width/4), position.y + (size.height/100*43), size.width/12, size.height/20);
        graphics.drawRect(position.x + (size.width/100*36), position.y + (size.height/100*43), size.width/12, size.height/20);
        
        
       /// int[] xPoints = {position.x + (size.width/4), position.x + (size.width/5), position.x + (size.width/4)};
///int[] yPoints = {position.y + (size.height/6), position.y + (size.height/7), position.y + (size.height/2)};
///graphics.fillPolygon(xPoints, yPoints, 3);
      //   graphics.drawArc(x, y, width, height, startAngle, arcAngle);
        
        graphics.setColor(Color.WHITE);
        graphics.fillOval(position.x + (size.width/100*31), position.y + (size.height/6), size.width/20, size.height/15);
        graphics.fillOval(position.x + (size.width/100*35), position.y + (size.height/6), size.width/20, size.height/15);
        
        graphics.setColor(Color.red);
        graphics.fillRect(position.x + (size.width/3), position.y + (size.height/100*45),size.width/30, size.height/9);
        graphics.fillOval(position.x + (size.width/200*82), position.y + (size.height/100*43),size.width/23, size.height/30);
       // graphics.fillOval(position.x + (size.width/100*33), position.y + (size.height/100*55),size.width/40, size.height/23);
        //tie flip
        int[] xTieFlip = {position.x + ( size.width/ 3), position.x + ( size.width / 3), position.x + ( size.width/100*43), position.x + ( size.width /100*43), position.x + ( size.width /100*39)};
        int[] yTieFlip = {position.y + ( size.height/100*55), position.y + ( size.height/100*60), position.y + ( size.height/100*47),position.y + ( size.height/100*43),position.y + ( size.height/100*42)};
        graphics.fillPolygon(xTieFlip, yTieFlip, xTieFlip.length);
        
       // graphics.fillOval(position.x, position.y, 10, 10);
        //graphics.fillOval(position.x + size.width, position.y + size.height, 10, 10);

        
       // graphics.drawOval(position.x + size/4, position.y+size/4, size.width/4,size.height/4);
    }
    
    
}
