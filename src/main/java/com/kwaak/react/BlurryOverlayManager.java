package com.kwaak.react;

import android.util.Log;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class BlurryOverlayManager extends SimpleViewManager<BlurryOverlayView> {


    public BlurryOverlayManager() {
    }

    public static final String REACT_CLASS = "RCTBlurryOverlay";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public BlurryOverlayView createViewInstance(ThemedReactContext context) {
        BlurryOverlayView c = new BlurryOverlayView(context, context.getCurrentActivity());

        return c;
    }

    @ReactProp(name = "radius", defaultInt = 0)
    public void setRadius(BlurryOverlayView view, int radius) {
        view.setRadiusAndUpdate(radius);
    }

    @ReactProp(name = "sampling", defaultInt = 0)
    public void setSampling(BlurryOverlayView view, int sampling) {
        Log.d(REACT_CLASS, sampling + "");
        view.setSamplingAndUpdate(sampling);
    }

    @ReactProp(name = "color")
    public void setColor(BlurryOverlayView view, String color) {
        view.setColorAndUpdate(color);
    }
}

