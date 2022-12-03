import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();


        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.downVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxDownVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.downVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio rad = new Radio();

        rad.setChannel(8);
        rad.nextChannel();

        int expected = 9;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfter9Channel() {
        Radio rad = new Radio();

        rad.setChannel(9);
        rad.nextChannel();

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio rad = new Radio();

        rad.setChannel(9);
        rad.prevChannel();

        int expected = 8;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAfter0Channel() {
        Radio rad = new Radio();

        rad.setChannel(0);
        rad.prevChannel();

        int expected = 9;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeChannelOutside() {
        Radio rad = new Radio();

        rad.setChannel(9);
        rad.nextChannel();

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeChannel() {
        Radio rad = new Radio();

        rad.setChannel(8);

        int expected = 8;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSetChannel() {
        Radio rad = new Radio();

        rad.setChannel(10);

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSetChannel() {
        Radio rad = new Radio();

        rad.setChannel(-1);

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getChannel();

        Assertions.assertEquals(expected, actual);
    }
}