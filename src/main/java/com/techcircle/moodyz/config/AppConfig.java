package com.techcircle.moodyz.config;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

import com.techcircle.moodyz.MoodyZApplication;
import com.techcircle.moodyz.constants.AssetConstants;
import com.techcircle.moodyz.router.Route;
import com.techcircle.moodyz.router.Router;
import com.techcircle.moodyz.utils.ComponentResizer;
import com.techcircle.moodyz.utils.ResourcesManager;

public class AppConfig {
    private final MoodyZApplication mainApp;
    private final ResourcesManager resourcesManager;

    public static Router router;

    public AppConfig(MoodyZApplication mainApp) {
        this.mainApp = mainApp;
        this.resourcesManager = new ResourcesManager(this.mainApp);
        router = new Router();
    }

    public void init() {
        mainApp.setIconImage(new ImageIcon(resourcesManager.loadImageURL(AssetConstants.logoIcon)).getImage());
        resourcesManager.init();

        ComponentResizer componentResizer = new ComponentResizer();
        componentResizer.registerComponent(mainApp);
        componentResizer.setMinimumSize(new Dimension(1366, 768));
        componentResizer.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        componentResizer.setSnapSize(new Dimension(1, 1));
    }

    public void use(Route route) {
        router.useRoute(route);
    }

    public void setDefault(Route route) {
        router.setDefaultRoute(route);
    }

    public static void redirect(Route route) {
        router.setCurrentRoute(route);
    }

    public static JPanel getCurrentPage() {
        return router.getCurrentPage();
    }

    public static Route getCurrentRoute() {
        return router.getCurrentRoute();
    }
}
