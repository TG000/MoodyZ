package com.techcircle.moodyz.app.views.components.global;

import com.techcircle.moodyz.utils.IconBuilder;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class CustomMenuItem extends JMenuItem {
    private Color background;
    private Color textColor;
    private Color hoverColor;

    public CustomMenuItem() {
        super();
        initDefaults();
        addMouseListener(new CustomMenuItem.MenuItemHoverListener());
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

        if (getModel().isPressed()) {
            bg = background;
        }
        else if (getModel().isRollover()) {
            bg = hoverColor;
        }

        g2.setColor(bg);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, 0, 0));

        FontMetrics metrics = g2.getFontMetrics();
        int textHeight = metrics.getHeight();

        // Draw accelerator
        if (getAccelerator() != null) {
            g2.setColor(textColor);
            int textY = (getHeight() - textHeight) / 2 + metrics.getAscent();

            // Get the modifier key and the character key
            int modifiers = getAccelerator().getModifiers();
            String modifierString = InputEvent.getModifiersExText(modifiers);
            String keyString = KeyEvent.getKeyText(getAccelerator().getKeyCode());

            // Concatenate the modifier and key strings
            String acceleratorString = modifierString + "+" + keyString;
            int textWidth = metrics.stringWidth(acceleratorString);

            g2.drawString(acceleratorString, width - textWidth - 15, textY);
        }

        // Draw text
        if (getText() != null && !getText().isEmpty()) {
            g2.setColor(textColor);
            int textY = (getHeight() - textHeight) / 2 + metrics.getAscent();
            g2.drawString(getText(), 20, textY);
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

    private class MenuItemHoverListener extends MouseAdapter {
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