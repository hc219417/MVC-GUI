package mvc22f;

import java.awt.*;

public class Point2D {
    private final int x1;
    private final int x2;
    public Point2D(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public String toString(){
        return "(" + x1 + "," + x2 + ")";
    }
    public Point2D mid(Point2D that){
        return new Point2D((x1 + that.x1) / 2, (x2 + that.x2) / 2);
    }
    public void draw(Graphics g){
        g.drawRect(x1, x2, 1, 1);
    }
    public static void main(String[] args) {
        Point2D a = new Point2D(11, 22);
        System.out.println("a = " + a);
        Point2D b = new Point2D(33,44);
        System.out.println("b = " + b);
        Point2D middle = a.mid(b);
        System.out.println("middle = " + middle);
    }
}