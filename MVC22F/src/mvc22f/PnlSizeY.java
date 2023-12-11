package mvc22f;

import javax.swing.*;

public final class PnlSizeY extends PnlAbsCtrl {
    private final JLabel jlYSize = new JLabel("Y Size:");
    private final JLabel jlSpacer = new JLabel(" ");
    private final int JTFI_SIZE = 6;
    private final JTextFieldInt jtfiYSize = new JTextFieldInt(JTFI_SIZE);
    public PnlSizeY(Model model) {
        super(model);
        jtfiYSize.setText("" + model.getySize());
        jtfiYSize.addActionListener(ae -> update());
        add(jlYSize);
        add(jlSpacer);
        add(jtfiYSize);
    }
    private void update(){
        int newYSize = jtfiYSize.getInt();              // use new class
        if (newYSize == 0){                             // bad input
            jtfiYSize.setText("" + model.getySize());   // reset number
        } else {
            model.setySize(newYSize);                   // update y size
            model.getView().repaint();                  // show changes
        }
    }
}