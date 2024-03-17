package com.techcircle.moodyz.utils;

import org.jdesktop.core.animation.timing.Animator;
import org.jdesktop.core.animation.timing.TimingSource;
import org.jdesktop.core.animation.timing.TimingTargetAdapter;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Animation {
    private final TimingSource timingSource;

    public Animation(TimingSource timingSource) {
        this.timingSource = timingSource;
    }

    public void fadeOut(JFrame frame, AnimationCallback callback) {
        Animator animator = new Animator.Builder(timingSource)
                .setDuration(100, TimeUnit.MILLISECONDS)
                .setInterpolator(new org.jdesktop.core.animation.timing.interpolators.AccelerationInterpolator(0.5, 0.5))
                .addTarget(new TimingTargetAdapter() {
                    @Override
                    public void timingEvent(Animator source, double fraction) {
                        frame.setOpacity((float) (1 - fraction));
                    }

                    @Override
                    public void end(Animator source) {
                        // Do some code here
                        if (callback != null) {
                            callback.onAnimationComplete();
                        }

                        frame.setOpacity(1);
                    }
                }).build();
        animator.start();
    }

    public void setHoverColor(JComponent component, Color color) {
        component.setOpaque(true);
        component.setBackground(color);
    }

    public void removeHoverColor(JComponent component) {
        component.setOpaque(false);
    }

    public interface AnimationCallback {
        void onAnimationComplete();
    }
}
