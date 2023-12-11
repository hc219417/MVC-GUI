package mvc22f;

import javax.swing.*;

public final class PnlProgr extends PnlAbsCtrl {
    private final JLabel jlProgrammer = new JLabel("Programmer:");
    private final JLabel jlSpacer = new JLabel(" ");
    private final JLabel jlYourName = new JLabel("Hannah Culver");
    public PnlProgr(Model model) {
        super(model);
        add(jlProgrammer);
        add(jlSpacer);
        add(jlYourName);
    }
}