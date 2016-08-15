package com.justgifit;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

/**
 * Created by Fausto on 8/15/2016.
 */

@ConfigurationProperties(prefix = "com.justgifit")
public class JustGifItProperties {

    /**
     * The location of the animated gifs.
     */
    private File gifLocation;
    /**
     * Whether or not to optimize web filters.
     */
    private boolean optimize;

    public File getGifLocation() {
        return gifLocation;
    }

    public void setGifLocation(File gifLocation) {
        this.gifLocation = gifLocation;
    }

    public boolean getOptimize() {
        return optimize;
    }

    public void setOptimize(boolean optimize) {
        this.optimize = optimize;
    }
}
