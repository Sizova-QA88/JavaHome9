package ru.netology;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            this.station = newStation;
        } else {
            return;
        }
    }


    public void nextStation() {
        if (getStation() == 9) {
            setStation(0);
        } else {
            this.station++;
        }
    }

    public void prevStation() {
        if (getStation() == 0) {
            setStation(9);
        } else {
            this.station--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
}
    public void increaseVolume() {
        if (getVolume() < 100) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if (getVolume() > 0) {
            this.volume--;
        }
    }
}