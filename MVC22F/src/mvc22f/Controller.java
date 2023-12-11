package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class Controller extends JPanel {
    private final Model model;
    public Controller(Model model) {
        this.model = model;

        setBorder(BorderFactory.createLineBorder(Color.GREEN));
        setLayout(new GridLayout(6,1));

        add(new PnlProgr(model));
        add(new PnlTask(model));
        add(new PnlSizeX(model));
        add(new PnlSizeY(model));
        add(new PnlColor(model));
        add(new PnlSolid(model));
    }
}