/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bazinga;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author liambrockley
 */
public class BazingaEnvironment extends Environment{
    Dilbert myDilbert;

    @Override
    public void initializeEnvironment() {
        myDilbert = new Dilbert();
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        myDilbert.draw(graphics);
    }
    
}
