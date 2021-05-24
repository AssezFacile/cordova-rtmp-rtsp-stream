package com.webmons.disono.rtmpandrtspstreamer;

/**
 * Author: Archie, Disono (webmonsph@gmail.com)
 * Website: http://www.webmons.com
 *
 * Created at: 11/15/2018
 */

public class VideoHelper {
    public int bitrate(int width, int height) {
        if (width <= 640 && height <= 360) {
            return 1000000;
        }

        if (width <= 854 && height <= 480) {
            return 2500000;
        }

        if (width <= 1280 && height <= 720) {
            return 5000000;
        }

        if (width <= 1920 && height <= 1080) {
            return 8000000;
        }

        return 16000000;
    }
}
