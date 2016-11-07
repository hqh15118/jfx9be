package com.jfxbe;

import javafx.scene.effect.ColorAdjust;

/**
 * This class has a url to the image file and a degrees value
 * to rotate the image view based on the angle of incre
 */
public class ImageInfo {
    private String url;
    private int degrees;
    private ColorAdjust colorAdjust;
    private double translateY;

    public ImageInfo(String url) {
        this.url = url;
        this.colorAdjust = new ColorAdjust();
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public double getTranslateY() {
        return translateY;
    }

    public void setTranslateY(double translateY) {
        this.translateY = translateY;
    }

    public void addDegrees(int degrees) {
        this.degrees += degrees;
    }

    public ColorAdjust getColorAdjust() {
        return colorAdjust;
    }

    public void setColorAdjust(ColorAdjust colorAdjust) {
        this.colorAdjust = colorAdjust;
    }
}