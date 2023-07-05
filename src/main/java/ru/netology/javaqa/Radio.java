package ru.netology.javaqa;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() { // Не параметризированный конструктор
    }
    
    public Radio(int mxVol, int minVol, int crVol) { // Параметризированный конструктор
        maxVolume = mxVol;
        minVolume = minVol;
        currentVolume = crVol;
    }

    // Опции Радиоcтанций
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation >= maxStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void remoteCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        } else if (currentStation < minStation) {
            setCurrentStation(minStation);
        } else {
            this.currentStation = currentStation;
        }
    }

    // Опции Громкости
    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}