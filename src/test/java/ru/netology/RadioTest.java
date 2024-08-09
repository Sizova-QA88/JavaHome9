package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void numberOgRadioStations() {
        Radio station = new Radio(10);

        Assertions.assertEquals(10, station.getNumberOfRadioStations());
    }

    @Test
    public void impossibleRadioStation() {
        Radio station = new Radio(10);

        station.setStation(8);

        Assertions.assertEquals(8, station.getStation());
    }

    @Test
    public void negativeStation() {
        Radio station = new Radio(10);

        station.setStation(-1);

        Assertions.assertEquals(0, station.getStation());
    }

    @Test
    public void nextStation() {
        Radio station = new Radio(10);

        station.setStation(6);

        station.nextStation();

        Assertions.assertEquals(7, station.getStation());
    }

    @Test
    public void previousStation() {
        Radio station = new Radio(10);
        station.setStation(5);

        station.prevStation();

        Assertions.assertEquals(4, station.getStation());
    }

    @Test
    public void returnToValidStation() {
        Radio station = new Radio(10);
        station.setStation(9);

        station.nextStation();

        Assertions.assertEquals(0, station.getStation());
    }

    @Test
    public void backToValidStation() {
        Radio station = new Radio(10);
        station.setStation(0);

        station.prevStation();

        Assertions.assertEquals(9, station.getStation());
    }

    @Test
    public void outsideValidStation() {
        Radio station = new Radio(10);

        station.setStation(11);

        Assertions.assertEquals(0, station.getStation());
    }

    @Test
    public void impossibleLoudVolume() {
        Radio volume = new Radio();

        volume.setVolume(5);

        Assertions.assertEquals(5, volume.getVolume());
    }

    @Test
    public void overshootLoudVolume() {
        Radio volume = new Radio();

        volume.setVolume(101);

        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(77);
        volume.increaseVolume();

        Assertions.assertEquals(78, volume.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(77);
        volume.decreaseVolume();

        Assertions.assertEquals(76, volume.getVolume());
    }

    @Test
    public void volumeMax() {
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getVolume());
    }

    @Test
    public void volumeMin() {
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void negativeVolume() {
        Radio volume = new Radio();

        volume.setVolume(-1);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getVolume());
    }


}
