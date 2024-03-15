package com.techcircle.moodyz.utils;

import org.jdesktop.core.animation.timing.Animator;
import org.jdesktop.core.animation.timing.TimingSource;
import org.jdesktop.core.animation.timing.TimingTargetAdapter;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AnimationManager {
    public enum ActionType {
        MINIMIZE,
        EXIT,
    }

    private final TimingSource timingSource;

    public AnimationManager(TimingSource timingSource) {
        this.timingSource = timingSource;
    }

    public void fadeOut(JFrame frame, ActionType actionType) {
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
                        switch (actionType) {
                            case EXIT:
                                System.exit(0);
                                break;
                            case MINIMIZE:
                                frame.setState(JFrame.ICONIFIED);
                                break;
                            default:
                                break;
                        }

                        frame.setOpacity(1);
                    }
                }).build();
        animator.start();
    }
}
