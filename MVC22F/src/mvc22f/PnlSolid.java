package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class PnlSolid extends PnlAbsCtrl {
    private final JLabel jlSolid = new JLabel("Solid:");
    private final JLabel jlSpacer = new JLabel("        ");
    private final JPanel jpButtons = new JPanel();
    private final JRadioButton jrbYes = new JRadioButton("Yes");
    private final JRadioButton jrbNo = new JRadioButton("No");
    private final ButtonGroup bgSolid = new ButtonGroup();
    public PnlSolid(Model model) {
        super(model);

        if (model.isSolid()) {
            jrbYes.setSelected(true);
        } else {
            jrbNo.setSelected(true);
        }

        jrbYes.addActionListener(ae -> {
            model.setSolid(true);
            model.getView().repaint();
        });

        jrbNo.addActionListener(ae -> {
            model.setSolid(false);
            model.getView().repaint();
        });

        bgSolid.add(jrbYes);
        bgSolid.add(jrbNo);

        jpButtons.add(jrbYes);
        jpButtons.add(jrbNo);

        jpButtons.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        add(jlSolid);
        add(jlSpacer);
        add(jpButtons);
    }
}