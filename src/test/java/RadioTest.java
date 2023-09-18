import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maxRadioStationNumberTest() {
        Radio radNum = new Radio();

        radNum.maxRadioStationNumber();

        int expected = 9;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRadioStationNumberTest() {
        Radio radNum = new Radio();

        radNum.minRadioStationNumber();

        int expected = 0;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio radNum = new Radio();

        radNum.setRadioStationNumber(10);

        int expected = 0;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberBelowMin() {
        Radio radNum = new Radio();

        radNum.setRadioStationNumber(-1);

        int expected = 9;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void directIndicationNumber () {
        Radio radNum = new Radio();

        radNum.setRadioStationNumber(8);

        int expected = 8;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberTest() {
        Radio radNum = new Radio();
        radNum.setRadioStationNumber(9);

        radNum.increaseNumber();

        int expected = 0;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingNumberTest() {
        Radio radNum = new Radio();
        radNum.setRadioStationNumber(0);

        radNum.reducingNumber();

        int expected = 9;
        int actual = radNum.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSoundVolumeTest() {
        Radio volume = new Radio();

        volume.maxSoundVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSoundVolumeTest() {
        Radio volume = new Radio();

        volume.minSoundVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundAboveMax() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(101);

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundBelowMin() {
        Radio volume = new Radio();

        volume.setNumberSoundVolume(-1);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeTest() {
        Radio volume = new Radio();
        volume.setNumberSoundVolume(100);

        volume.increaseSoundVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reducingSoundVolumeTest() {
        Radio volume = new Radio();
        volume.setNumberSoundVolume(0);

        volume.reducingSoundVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
