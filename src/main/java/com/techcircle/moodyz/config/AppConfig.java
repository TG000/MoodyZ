package com.techcircle.moodyz.config;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

import com.techcircle.moodyz.MoodyZApplication;
import com.techcircle.moodyz.constants.AssetConstants;
import com.techcircle.moodyz.utils.ComponentResizer;
import com.techcircle.moodyz.utils.ResourcesManager;

public class AppConfig {
    private final MoodyZApplication mainApp;
    private final ResourcesManager resourcesManager;

    public AppConfig(MoodyZApplication mainApp) {
        this.mainApp = mainApp;
        this.resourcesManager = new ResourcesManager(this.mainApp);
    }

    public void init() {
        
        mainApp.setIconImage(new ImageIcon(resourcesManager.loadImageURL(AssetConstants.logoIcon)).getImage());
        
        ComponentResizer componentResizer = new ComponentResizer();
        componentResizer.registerComponent(mainApp);
        componentResizer.setMinimumSize(new Dimension(1600, 900));
        componentResizer.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        componentResizer.setSnapSize(new Dimension(1, 1));
    }
}
