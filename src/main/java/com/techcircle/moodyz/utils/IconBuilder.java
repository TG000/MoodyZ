package com.techcircle.moodyz.utils;

import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.fontawesome5.FontAwesomeRegular;
import org.kordamp.ikonli.swing.FontIcon;

import java.awt.*;

public class IconBuilder {
    public IconBuilder() {

    }

    public FontIcon prepareIcon(Ikon icon, int size, Color color) {
        FontIcon newIcon = FontIcon.of(icon);
        newIcon.setIconSize(size / 2);
        newIcon.setIconColor(color);
        return newIcon;
    }
}
