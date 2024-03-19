package com.techcircle.moodyz.utils;

import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.swing.FontIcon;

import java.awt.*;

public class IconBuilder {
    private final Ikon icon;
    private final int size;
    private final Color color;

    public IconBuilder(Ikon icon, int size, Color color) {
        this.icon = icon;
        this.size = size;
        this.color = color;
    }

    public FontIcon prepareIcon() {
        FontIcon newIcon = FontIcon.of(this.icon);
        newIcon.setIconSize(this.size);
        newIcon.setIconColor(this.color);
        return newIcon;
    }
}
