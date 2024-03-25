package com.techcircle.moodyz.app.views.components.global;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;
import java.awt.*;

public class CustomPopupMenu extends JPopupMenu {
    private Color background;
    private Color borderColor;
    private Insets insets;

    public CustomPopupMenu() {
        super();
        initDefaults();
    }

    private void initDefaults() {
        this.background = Color.WHITE;
        this.borderColor = Color.BLACK;
        this.insets = new Insets(3, 3, 3, 3);
        setUI(new CustomPopupMenuUI());
    }

    @Override
    public Color getBackground() {
        return background;
    }

    @Override
    public void setBackground(Color background) {
        this.background = background;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public Insets getInsets() {
        return insets;
    }

    public void setInsets(Insets insets) {
        this.insets = insets;
    }

    private static class CustomPopupMenuUI extends BasicPopupMenuUI {
        @Override
        public void paint(Graphics g, JComponent c) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(c.getBackground());
            g2d.fillRect(0, 0, c.getWidth(), c.getHeight());

            // Draw border
            g2d.setColor(((CustomPopupMenu) c).getBorderColor());
            g2d.drawRect(0, 0, c.getWidth() - 1, c.getHeight() - 1);

            g2d.dispose();
            super.paint(g, c);
        }

        public static ComponentUI createUI(JComponent c) {
            return new CustomPopupMenuUI();
        }
    }
}
