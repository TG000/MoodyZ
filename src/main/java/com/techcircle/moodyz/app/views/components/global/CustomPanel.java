package com.techcircle.moodyz.app.views.components.global;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private int radius;

    public CustomPanel() {
        super();
        initDefaults();
    }

    private void initDefaults() {
        radius = 0;
        setOpaque(false);
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

