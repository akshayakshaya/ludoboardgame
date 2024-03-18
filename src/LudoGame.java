import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
public class LudoGame extends JPanel implements Runnable, KeyListener{
    private boolean[] keys;

//    addKeyListener( this );
//    setFocusable( true );		// Do NOT DELETE these three lines
//    new Thread(this).start();

    public void paint(Graphics window) {
        //Background Image
        Image background = Toolkit.getDefaultToolkit().getImage("backgroundImage.png");
        window.drawImage(background, 0, 0, 1500, 750, this);

        //Mouse Pointer for coordinates
        window.setColor(Color.WHITE);
        window.drawString("Mouse  coordinates " + "(" + MouseInfo.getPointerInfo().getLocation().x + "   " + MouseInfo.getPointerInfo().getLocation().y + ")", 150, 30);

        //Game Board Image
        Image gameBoard = Toolkit.getDefaultToolkit().getImage("gameBoard.png");
        window.drawImage(gameBoard, 400, 25, 700, 700, this);
    }
    public void keyPressed(KeyEvent e)
    {
        //Java KeyEvent docs
        //https://docs.oracle.com/javase/8/docs/api/java/awt/event/KeyEvent.html

        if( e.getKeyCode()  == KeyEvent.VK_SPACE )
        {
            keys[0]=true;
        }

        if( e.getKeyCode()  == KeyEvent.VK_LEFT )
        {
            keys[1]=true;
        }

        if( e.getKeyCode()  == KeyEvent.VK_RIGHT )
        {
            keys[2]=true;
        }
    }
    /*****~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*****/
// do not edit anything from this point on!!!
    public void keyTyped(KeyEvent e)
    {
        keyPressed( e );
    }
    public void keyReleased(KeyEvent e)
    {
        if( e.getKeyCode()  == KeyEvent.VK_LEFT )
        {
            keys[1]=false;
        }

        if( e.getKeyCode()  == KeyEvent.VK_RIGHT )
        {
            keys[2]=false;
        }
    }
    public void run() {
        try
        {
            while( true )
            {
                Thread.sleep( 10 );
                repaint();
            }
        }
        catch( Exception e )
        {
        }
    }
}
