package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class Frame extends JFrame {
    private final Model model;
    public Frame(Model model) throws HeadlessException {
        this.model = model;
        System.out.println("Frame c-tor: model = " + model);

        setLayout(new BorderLayout());
        add(model.getTitle(),BorderLayout.NORTH);
        add(model.getController(),BorderLayout.WEST);
        add(model.getView(), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);
        setTitle("MVC 22 Fall");
        setVisible(true);
    }
}