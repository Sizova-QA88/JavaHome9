package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int station;
    private int volume;
    private int numberOfRadioStations = 10;


    public Radio (int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public void setStation(int newStation) {
        if (newStation >= 0 && newStation < numberOfRadioStations) {
            this.station = newStation;
        }
    }
    public void nextStation() {
        if (getStation() < numberOfRadioStations - 1) {
            this.station++;
        } else {
            this.station = 0;
        }
    }

    public void prevStation() {
        if (getStation() == 0) {
            this.station = numberOfRadioStations - 1;
        } else {
            this.station--;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            this.volume = newVolume;
        } else {
            return;
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