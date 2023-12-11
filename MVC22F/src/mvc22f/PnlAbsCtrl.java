package mvc22f;

import javax.swing.*;

public abstract class PnlAbsCtrl extends JPanel {
    protected final Model model;
    public PnlAbsCtrl(Model model) {
        this.model = model;
        setUp();
    }
    private void setUp() {
        setBorder(BorderFactory.createEtchedBorder());
    }
}