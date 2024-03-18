import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class LudoGameRunner extends JFrame {
    private static final int WIDTH = 1500;
    private static final int HEIGHT = 750;
    public LudoGameRunner()
    {
        super("LudoGame");

        setSize(WIDTH,HEIGHT);

        getContentPane().add( new LudoGame() );

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main( String args[] ) {LudoGameRunner run = new LudoGameRunner();}
}
