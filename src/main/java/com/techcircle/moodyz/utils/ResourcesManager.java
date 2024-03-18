package com.techcircle.moodyz.utils;

import com.techcircle.moodyz.MoodyZApplication;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ResourcesManager {
    private final MoodyZApplication root;

    public ResourcesManager(MoodyZApplication root) {
        this.root = root;
    }

    public void init() {
        try {
            Font defaultFont = Font.createFont(Font.TRUETYPE_FONT, new File(PathManager.getResourcesPath() + "/styles/fonts/proxima-nova/ProximaNova-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(defaultFont);
        }
        catch (IOException | FontFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public URL loadImageURL(String fileName) {
        return root.getClass().getResource("/images/" + fileName);
    }
}
