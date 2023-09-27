package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioStation20Test() {
        RadioStation20 radio = new RadioStation20();
        radio.setRadioStation20(15);

        Assertions.assertEquals(15, radio.getRadioStation20());
    }

    @Test
    public void maxMinRadioStationNumberTest() {
        Radio number = new Radio();

        Assertions.assertEquals(0, number.getMinRadioStationNumber());
        Assertions.assertEquals(9, number.getMaxRadioStationNumber());
    }

    @Test
    public void stationNumber() {
        Radio number = new Radio(10);

        Assertions.assertEquals(10, number.getRadioStationNumber());
    }


    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio number = new Radio(10);

        number.setRadioStationNumber(10);

        Assertions.assertEquals(0, number.getRadioStationNumber());
    }

    @Test
    public void shouldNotSetNumberBelowMin() {
        Radio number = new Radio();

        number.setRadioStationNumber(-1);

        Assertions.assertEquals(9, number.getRadioStationNumber());
    }

    @Test
    public void directIndicationNumber() {
        Radio number = new Radio();

        number.setRadioStationNumber(8);

        Assertions.assertEquals(8, number.getRadioStationNumber());
    }

    @Test
    public void increaseNumberTest() {
        Radio number = new Radio();
        number.setRadioStationNumber(9);

        number.increaseNumber();

        Assertions.assertEquals(0, number.getRadioStationNumber());
    }

    @Test
    public void reducingNumberTest() {
        Radio number = new Radio();
        number.setRadioStationNumber(0);

        number.reducingNumber();

        Assertions.assertEquals(9, number.getRadioStationNumber());
    }

    @Test
    public void maxSoundVolumeTest() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(100);

        Assertions.assertEquals(100, volume.getSoundVolume());
    }

    @Test
    public void minSoundVolumeTest() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(0);

        Assertions.assertEquals(0, volume.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundAboveMax() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(101);

        Assertions.assertEquals(100, volume.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundBelowMin() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(-1);

        Assertions.assertEquals(0, volume.getSoundVolume());
    }

    @Test
    public void increaseSoundVolumeTest() {
        Radio volume = new Radio();
        volume.setNumberSoundVolume(100);

        volume.increaseSoundVolume();

        Assertions.assertEquals(100, volume.getSoundVolume());
    }

    @Test
    public void reducingSoundVolumeTest() {
        Radio volume = new Radio();
        volume.setNumberSoundVolume(0);

        volume.reducingSoundVolume();

        Assertions.assertEquals(0, volume.getSoundVolume());
    }

}





