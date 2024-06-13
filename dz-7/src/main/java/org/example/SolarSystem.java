package org.example;

public enum SolarSystem {
    МЕРКУРІЙ(0, 512, null),
    ВЕНЕРА(16, 1024, МЕРКУРІЙ),
    ЗЕМЛЯ(32, 2048, ВЕНЕРА),
    МАРС(64, 4096, ЗЕМЛЯ),
    ЮПІТЕР(128, 8192, МАРС),
    САТУРН(256, 16384, ЮПІТЕР),
    УРАН(512, 32768, САТУРН),
    НЕПТУН(1024, 65536, УРАН);

    private final int numFromSun;
    private final int distanceFromPrevious;
    private final int distanceFromSun;
    private final int radius;
    private final SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(int distanceFromPrevious, int radius, SolarSystem previousPlanet) {
        this.numFromSun = ordinal() + 1;
        this.distanceFromPrevious = distanceFromPrevious;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = (previousPlanet == null) ? 0 : previousPlanet.distanceFromSun + distanceFromPrevious;

        if (previousPlanet != null) {
            previousPlanet.nextPlanet = this;
        }
    }

    public int getNumFromSun() {
        return numFromSun;
    }
    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }
    public int getDistanceFromSun() {
        return distanceFromSun;
    }
    public int getRadius() {
        return radius;
    }
    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }
    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }
}
