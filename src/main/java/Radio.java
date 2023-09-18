public class Radio {
    public int radioStationNumber;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void maxRadioStationNumber() {
        radioStationNumber = 9;
    }

    public void minRadioStationNumber() {
        radioStationNumber = 0;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            maxRadioStationNumber();
            return;
        }
        if (newRadioStationNumber > 9) {
            minRadioStationNumber();
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void increaseNumber() {
        int number = radioStationNumber + 1;
        setRadioStationNumber(number);
    }

    public void reducingNumber() {
        int number = radioStationNumber - 1;
        setRadioStationNumber(number);
    }

    public int soundVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void maxSoundVolume() {
        soundVolume = 100;
    }

    public void minSoundVolume() {
        soundVolume = 0;
    }

    public void setNumberSoundVolume(int newSetNumberSoundVolume) {
        if (newSetNumberSoundVolume > 100) {
            maxSoundVolume();
            return;
        }
        if (newSetNumberSoundVolume < 0) {
            minSoundVolume();
            return;
        }
        soundVolume = newSetNumberSoundVolume;
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
