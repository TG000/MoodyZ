package com.techcircle.moodyz.app.views.components.global;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {
    private final int radius;

    public RoundedPanel(int radius) {
        super();
        this.radius = radius;
        setOpaque(false); // Ensure transparency
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fill the panel with the background color
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        g2d.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        super.paintBorder(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the border
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return super.getPreferredSize();
    }

    @Override
    public Dimension getMinimumSize() {
        return super.getMinimumSize();
    }
}

