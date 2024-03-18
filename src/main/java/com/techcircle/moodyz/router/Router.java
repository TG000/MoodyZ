package com.techcircle.moodyz.router;

import javax.swing.*;
import java.util.ArrayList;

public class Router {
    private ArrayList<Route> routeList;
    private ArrayList<RouterListener> listeners;

    public Route defaultRoute;
    public Route currentRoute;

    public Router() {
        this.routeList = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.defaultRoute = null;
    }

    public void setDefaultRoute(Route route) {
        if (!routeList.contains(route)) {
            routeList.add(route);
        }

        this.defaultRoute = route;
        this.currentRoute = defaultRoute;
    }

    public void useRoute(Route route) {
        routeList.add(route);
    }

    public JPanel getCurrentRoute() {
        return this.currentRoute.component;
    }

    public void setCurrentRoute(Route route) {
        this.currentRoute = route;
        notifyListeners();
    }

    public void addRouteListener(RouterListener listener) {
        listeners.add(listener);
    }

    private void notifyListeners() {
        for (RouterListener listener : listeners) {
            listener.routeChanged();
        }
    }
}
