package com.techcircle.moodyz.utils;

public class PathManager {
    private static final String rootPath;
    private static final String resourcesPath;

    static {
        rootPath = determineRootPath();
        resourcesPath = determineResourcesPath();
    }

    public static String getRootPath() {
        return rootPath;
    }

    public static String getResourcesPath() {
        return resourcesPath;
    }

    private static String determineRootPath() {
        return determineMainPath() + "/java/com/techcircle/moodyz";
    }

    private static String determineResourcesPath() {
        return determineMainPath() + "/resources/";
    }

    private static String determineMainPath() {
        return System.getProperty("user.dir") + "/src/main/";
    }
}
