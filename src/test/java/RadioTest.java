import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 0;
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 10;
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 10;
        rad.downVolume();

        int expected = 9;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxDownVolume() {
        Radio rad = new Radio();

        rad.currentVolume = 0;
        rad.downVolume();

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio rad = new Radio();

        rad.channel = 8;
        rad.nextChannel();

        int expected = 9;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfter9Channel() {
        Radio rad = new Radio();

        rad.channel = 9;
        rad.nextChannel();

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio rad = new Radio();

        rad.channel = 9;
        rad.prevChannel();

        int expected = 8;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfter0Channel() {
        Radio rad = new Radio();

        rad.channel = 0;
        rad.prevChannel();

        int expected = 9;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeChannel() {
        Radio rad = new Radio();

        rad.setChannel(9);

        int expected = 9;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeChannelOutside() {
        Radio rad = new Radio();

        rad.setChannel(10);

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }
}