import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    public int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int channel = minChannel;

    public Radio(int size) {
        maxChannel = minChannel + size - 1;
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

