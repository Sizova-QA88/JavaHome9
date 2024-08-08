package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void currentStation() {
        Radio radio = new Radio();

        radio.setStation(7);

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeStation() {
        Radio newStation = new Radio();

        newStation.setStation(-1);

        int expected = 0;
        int actual = newStation.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio station = new Radio();
        station.setStation(1);

        station.nextStation();
        int expected = 2;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio station = new Radio();
        station.setStation(5);

        station.prevStation();
        int expected = 4;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnToValidStation() {
        Radio station = new Radio();
        station.setStation(9);

        station.nextStation();
        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void backToValidStation() {
        Radio station = new Radio();
        station.setStation(0);

        station.prevStation();
        int expected = 9;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outsideValidStation() {
        Radio station = new Radio();
        station.setStation(10);

        int expected = 0;
        int actual = station.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void impossibleLoudVolume() {
        Radio volume = new Radio();
        volume.setVolume(5);

        int expected = 5;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overshootLoudVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(77);

        volume.increaseVolume();

        int expected = 78;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(77);

        volume.decreaseVolume();

        int expected = 76;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMax() {
        Radio volume = new Radio();
        volume.setVolume(100);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio volume = new Radio();
        volume.setVolume(0);

        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);

        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
