package com.techcircle.moodyz.app.views.components.global;

import com.techcircle.moodyz.utils.IconBuilder;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class CustomMenu extends JMenu {
    private Color background;
    private Color textColor;
    private Color hoverColor;

    public CustomMenu() {
        super();
        initDefaults();
        addMouseListener(new MenuHoverListener());
        setIcon(new IconBuilder(FontAwesomeSolid.ARROW_RIGHT, 10, Color.WHITE).prepareIcon());
    }

    private void initDefaults() {
        this.background = new Color(0, 0, 0, 0);
        this.hoverColor = Color.LIGHT_GRAY;
        this.textColor = Color.BLACK;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        Color bg = background;

        if (getModel().isRollover()) {
            bg = hoverColor;
        }

        g2.setColor(bg);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, 0, 0));

        // Draw icon
        if (getIcon() != null) {
            int iconY = (height - getIcon().getIconHeight()) / 2;
            g2.setColor(textColor); // Set the color for the icon
            getIcon().paintIcon(this, g2, width - getIcon().getIconWidth() - 15, iconY);
        }

        // Draw text
        if (getText() != null && !getText().isEmpty()) {
            g2.setColor(textColor);
            FontMetrics metrics = g2.getFontMetrics();
            int textHeight = metrics.getHeight();
            int textY = (getHeight() - textHeight) / 2 + metrics.getAscent();
            g2.drawString(getText(), 20, textY); // Draw text at a fixed padding of 5 pixels from the left
        }

        g2.dispose();
    }

    @Override
    public Color getBackground() {
        return background;
    }

    @Override
    public void setBackground(Color backgroundColor) {
        this.background = backgroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    private class MenuHoverListener extends MouseAdapter {
        private Color previousColor;

        @Override
        public void mouseEntered(MouseEvent e) {
            previousColor = getBackground();
            setBackground(getHoverColor());
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setBackground(previousColor);
        }
    }
}