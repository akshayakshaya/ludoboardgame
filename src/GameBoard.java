import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
abstract class GameBoard extends Canvas{
    private int x, y, w, h; //instance variables
    //Parameterized Constructor
    public GameBoard( int ex, int wy, int wd, int ht)
    {
        x = ex;
        y  = wy;
        w = wd;
        h = ht;
    }
    //Default Constructor
    public GameBoard(){
        x=0;
        y=0;
        w=0;
        h=0;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public int getW(){return w;}
    public int getH(){return h;}
    public void setX(int ex){x = ex;}
    public void setY(int ey){y = ey;}

    public boolean intersects( GameBoard other )
    {
        Rectangle a = new Rectangle(getX(), getY(), getW(), getH());
        Rectangle b = new Rectangle(other.getX(), other.getY(), other.getW(), other.getH());
        if(a.intersects(b)){
            return true;
        }
        return false;
    }
}
