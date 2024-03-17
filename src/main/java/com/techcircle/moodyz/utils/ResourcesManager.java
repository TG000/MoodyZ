package com.techcircle.moodyz.utils;

import com.techcircle.moodyz.MoodyZApplication;

import java.net.URL;

public class ResourcesManager {
    private final MoodyZApplication root;

    public ResourcesManager(MoodyZApplication root) {
        this.root = root;
    }

    public URL loadImageURL(String fileName) {
        return root.getClass().getResource("/images/" + fileName);
    }
}
