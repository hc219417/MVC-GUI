package mvc22f;

import javax.swing.*;
import java.awt.*;

public final class Title extends JPanel {

    // user defined parameters (adjust as needed or desired)
    private final int fontSize = 36;
    private final String fontName = "Arial";
    private final String titleString = "Model - View - Controller";
    private final Color titleColor = new Color(15, 15, 255);
    private final Font titleFont = new Font(fontName, Font.BOLD, fontSize);
    private final JLabel jlTitle = new JLabel(titleString);

    public Title() {
        System.out.println("Title c-tor");
        setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        jlTitle.setFont(titleFont);
        jlTitle.setForeground(titleColor);
        add(jlTitle);
    }
}