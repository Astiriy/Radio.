public class Radio {
    public int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int channel = minChannel;

    public Radio(int size) {
        maxChannel = minChannel + size - 1;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < 0) {
            return;
        }
        if (channel > 9) {
            return;
        }
        this.channel = channel;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void nextChannel() {
        if (channel < 9) {
            channel = channel + 1;
        } else {
            channel = 0;
        }
    }

    public void prevChannel() {
        if (channel > 0) {
            channel = channel - 1;
        } else {
            channel = 9;
        }
    }
}

