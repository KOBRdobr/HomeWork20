package ru.zinnurov;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 09.10.2018
 */

public class Sun {
    private String sunRise;
    private String sunSet;

    public Sun(String sunRise, String sunSet) {
        this.sunRise = sunRise;
        this.sunSet = sunSet;
    }

    public void showSunRiseAndSet() {
        System.out.println("Sun rise today: " + sunRise);
        System.out.println("Sun set today: " + sunSet);

    }

}
