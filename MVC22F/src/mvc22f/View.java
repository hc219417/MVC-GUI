package mvc22f;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public final class View extends JPanel {
    private final Model model;
    private int xCenter;
    private int yCenter;
    private int xStart;
    private int yStart;
    private int width;
    private int height;
    public View(Model model) {
        this.model = model;
        System.out.println("View c-tor: model = " + model);
        setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));

        repaint();
    }
    private void setUp(){
        // center of view panel, in pixels:
        xCenter = getWidth() / 2;
        yCenter = getHeight() / 2;

        // upper left corner of object we will draw:
        xStart = xCenter - model.getxSize();
        yStart = yCenter - model.getySize();

        // width of object we will draw:
        width = 2 * model.getxSize();
        height = 2 * model.getySize();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // call the super class c-tor
        super.paintComponents(g);
        setUp();

        // update drawing color
        g.setColor(model.getColor());

        // clear out the old picture
        g.clearRect(0,0,getWidth(),getHeight());

        switch(model.getTask()){
            case ELLIPSE:
                paintEllipse(g);
                break;
            case RECTANGLE:
                paintRectangle(g);
                break;
            case COLOR:
                paintColor(g);
                break;
            case INFORMATION:
                paintStudentInfo(g);
                break;
            case SIERPINSKI_GASKET:
                paintSG(g);
                break;
            default:
                throw new RuntimeException("BUMMERRR - no such task");
        }
    }
    private void paintColor(Graphics g) {

    }
    private void paintEllipse(Graphics g){
        // draw new picture
        if (model.isSolid()) {
            g.fillOval(xStart, yStart, width, height);
        } else {
            g.drawOval(xStart, yStart, width, height);
        }
    }
    private void paintRectangle(Graphics g){
        // draw new picture
        if (model.isSolid()) {
            g.fillRect(xStart, yStart, width, height);
        } else {
            g.drawRect(xStart, yStart, width, height);
        }
    }
    private void paintSG(Graphics g) {
        Random random = new Random();
        Point2D pointA = new Point2D(0, 0);
        Point2D pointB = new Point2D(model.getxSize(), getHeight());
        Point2D pointC = new Point2D(getWidth(), model.getySize());
        Point2D[] sTri = {pointA, pointB, pointC};
        Point2D runner = new Point2D(getWidth() / 2, getHeight() / 2);
        g.setColor(Color.RED);
        for (int i = 0; i < 10; ++i) {
            runner = runner.mid(sTri[random.nextInt(3)]);
            runner.draw(g);
        }
        g.setColor(model.getColor());
        final long STEPS = 1_000_000;
        for (long i = 0; i < STEPS; ++i){
            runner = runner.mid(sTri[random.nextInt(3)]);
            runner.draw(g);
        }
    }
    private final String studentTitle = "Programming Wizard"; // pick favorite title
    private final String studentName = "Hannah Culver"; // use actual name
    private final String studentAffiliation = "Ohio University";
    private final int MIN_LENGTH = 4;
    private final double FONT_FACTOR = 0.3;
    private final int INFO_X_START = 100;
    private final double Y_FRACTION_1 = 0.3;
    private final double Y_FRACTION_2 = 0.5;
    private final double Y_FRACTION_3 = 0.7;
    private void paintStudentInfo(Graphics g) {
        int maxStringLength = Math.max(studentTitle.length(),
                studentName.length());
        maxStringLength = Math.max(maxStringLength,
                studentAffiliation.length());
        maxStringLength = Math.min(maxStringLength, MIN_LENGTH);
        int fontSize = (int) (FONT_FACTOR * getWidth() / maxStringLength);
        g.setFont(new Font("Courier", Font.PLAIN, fontSize));
        g.setColor(model.getColor());
        g.drawString(studentTitle, INFO_X_START,
                (int) (Y_FRACTION_1 * getHeight()));
        g.drawString(studentName, INFO_X_START,
                (int) (Y_FRACTION_2 * getHeight()));
        g.drawString(studentAffiliation, INFO_X_START,
                (int) (Y_FRACTION_3 * getHeight()));
    }
}