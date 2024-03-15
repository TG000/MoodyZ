package com.techcircle.moodyz.utils;

import com.techcircle.moodyz.MoodyZApplication;

import javax.swing.*;
import java.net.URL;

public class ResourcesManager {
    private final MoodyZApplication root;

    public ResourcesManager(MoodyZApplication root) {
        this.root = root;
    }

    public URL loadImageURL(String fileName) {
        System.out.println(root.getClass().getResource("/images/"));
        return root.getClass().getResource("/images/" + fileName);
    }
}
