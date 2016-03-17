package HashCode;

public class Drone {

    private int MaxPayload;
    private boolean Free;

    public Drone() {
        Free = true;
    }

    public void setMaxPayload(int maxPayload) {
        MaxPayload = maxPayload;
    }

    public int getMaxPayload() {
        return MaxPayload;
    }

    public boolean isFree() {
        return Free;
    }
}
