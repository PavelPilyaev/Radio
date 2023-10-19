package ru.netology.domain;

public class Radio {
    private int soundVolume;
    private int radioStationNumber = 20;
    private int maxRadioStationNumber = 9;
    private int minRadioStationNumber = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio(int number) {
        radioStationNumber = number;
    }

    public Radio() {

    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentStationNumber > radioStationNumber) {
            return;
        }
        radioStationNumber = newCurrentStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            radioStationNumber = maxRadioStationNumber;
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            radioStationNumber = minRadioStationNumber;
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setNumberSoundVolume(int newSetNumberSoundVolume) {
        if (newSetNumberSoundVolume > maxSoundVolume) {
            soundVolume = maxSoundVolume;
            return;
        }
        if (newSetNumberSoundVolume < minSoundVolume) {
            soundVolume = minSoundVolume;
            return;
        }
        soundVolume = newSetNumberSoundVolume;
    }

    public void increaseNumber() {
        int number = radioStationNumber + 1;
        setRadioStationNumber(number);
    }

    public void reducingNumber() {
        int number = radioStationNumber - 1;
        setRadioStationNumber(number);
    }

    public void increaseSoundVolume() {
        int volume = soundVolume + 1;
        setNumberSoundVolume(volume);
    }

    public void reducingSoundVolume() {
        int volume = soundVolume - 1;
        setNumberSoundVolume(volume);
    }
}