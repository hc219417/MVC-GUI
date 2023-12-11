package mvc22f;

import javax.swing.*;

public final class JTextFieldInt extends JTextField {
    public JTextFieldInt(int columns) {
        super(columns);
    }
    public int getInt() {
        String newTFString;
        int newTFInt = 0;                                   // default value
        try {
            newTFString = getText();                        // String entered in TF
            newTFInt = Integer
                    .parseInt(newTFString);                 // parse txt to int
            System.out.println("good new int " + newTFInt);
        } catch (NumberFormatException                      // deal with bad number
                 | NullPointerException nfe) {              // deal with WTF?
            setText("BAD INPUT!");                          // replace bad input
            JOptionPane.showMessageDialog(                  // popup GUI msg
                    null,
                    "Invalid input. Not a number.", // error message
                    "CS 2300 Error Message:",               // error title
                    JOptionPane.ERROR_MESSAGE);             // error symbol
            System.out.println("bad new int " + newTFInt);
        } catch (Exception ex){                             // check for bad WTF?
            System.out.println("Bad error. Should not occur");
        }
        return newTFInt;
    }
}