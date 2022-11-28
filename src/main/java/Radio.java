public class Radio {
    public int currentVolume;
    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        if (newChannel > 9) {
            return;
        }
        channel = newChannel;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void downVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

    public int channel;

    public void nextChannel() {
        if (channel < 9) {
            channel = channel + 1;
        } else {
            channel = 0;
        }
    }

    public void prevChannel() {
        if (channel <= 9) {
            channel = channel - 1;
        }
        if (channel <= 0) {
            channel = 9;
        }
    }
}

