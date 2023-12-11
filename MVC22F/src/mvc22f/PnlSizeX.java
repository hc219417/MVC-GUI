package mvc22f;

import javax.swing.*;

public final class PnlSizeX extends PnlAbsCtrl {
    private final JLabel jlXSize = new JLabel("X Size:");
    private final JLabel jlSpacer = new JLabel(" ");
    private final int JTFI_SIZE = 6;
    private final JTextFieldInt jtfiXSize = new JTextFieldInt(JTFI_SIZE);
    public PnlSizeX(Model model) {
        super(model);
        jtfiXSize.setText("" + model.getxSize());
        jtfiXSize.addActionListener(ae -> update());
        add(jlXSize);
        add(jlSpacer);
        add(jtfiXSize);
    }
    private void update(){
        int newXSize = jtfiXSize.getInt();              // use new class
        if (newXSize == 0){                             // bad input
            jtfiXSize.setText("" + model.getxSize());   // reset number
        } else {
            model.setxSize(newXSize);                   // update x size
            model.getView().repaint();                  // show changes
        }
    }
}