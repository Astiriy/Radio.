import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    public int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int channel = minChannel;

    public Radio(int size) {
        maxChannel = minChannel + size - 1;
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


    public void nextChannel() {
        if (channel < maxChannel) {
            channel = channel + 1;
        } else {
            channel = minChannel;
        }
    }

    public void prevChannel() {
        if (channel <= maxChannel) {
            channel = channel - 1;
        }
        if (channel <= minChannel) {
            channel = maxChannel;
        }
    }
}