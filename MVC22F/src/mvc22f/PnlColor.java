package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class PnlColor extends PnlAbsCtrl {
    private final JLabel jlColor = new JLabel("Color:");
    private final JLabel jlSpacer = new JLabel("        ");
    private final JButton jbColor = new JButton("Change");
    public PnlColor(Model model) {
        super(model);
        jbColor.addActionListener(ae -> changeColor());
        add(jlColor);
        add(jlSpacer);
        add(jbColor);
    }
    private void changeColor() {
        model.setColor(JColorChooser
                .showDialog(
                        this,
                        "Choose new color",
                        model.getColor())
        );
        model.getView().repaint();
    }
}