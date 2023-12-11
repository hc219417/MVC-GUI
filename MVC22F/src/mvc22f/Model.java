package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class Model {
    private final Title title = new Title();
    private final Controller controller;
    private final View view;
    private final Frame frame;

    private Task task = Task.ELLIPSE;
    private int xSize = 66;
    private int ySize = 44;
    private Color color = Color.BLUE;
    private boolean solid = true;

    public Model(){
        System.out.println("Model c-tor: this = " + this);
        controller = new Controller(this);
        view = new View(this);
        frame = new Frame(this);
        System.out.println("End Model c-tor");
    }

    public Title getTitle() {
        return title;
    }
    public Controller getController() {
        return controller;
    }
    public View getView() {
        return view;
    }
    public Frame getFrame() {
        return frame;
    }
    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }
    public int getxSize() {
        return xSize;
    }
    public void setxSize(int xSize) {
        this.xSize = xSize;
    }
    public int getySize() {
        return ySize;
    }
    public void setySize(int ySize) {
        this.ySize = ySize;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public boolean isSolid() {
        return solid;
    }
    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public static void main(String[] args) {
        System.out.println("Start MVC GUI Application main method");
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
        });
        System.out.println("End MVC GUI Application main method");
    }
}