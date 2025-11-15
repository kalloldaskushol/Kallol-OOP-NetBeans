package Practice_MID.WAP;

class Device {
    private String deviceName;
    private boolean isOn;

    Device(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void status() {
        String s = isOn ? "ON" : "OFF";
        System.out.println(deviceName + " is " + s);
    }

    protected boolean getIsOn() {
        return isOn;
    }

    protected String getDeviceName() {
        return deviceName;
    }
}
class Fan extends Device {
    private int speed;

    Fan(String name) {
        super(name);
        this.speed = 1;
    }

    public void setSpeed(int s) {
        if (s >= 1 && s <= 5) {
            speed = s;
        } else {
            System.out.println("❌ Invalid Fan Speed (Allowed 1–5)");
        }
    }

    @Override
    public void status() {
        System.out.println(getDeviceName() + " | Power: " + (getIsOn() ? "ON" : "OFF") + " | Speed: " + speed);
    }
}
class AC extends Device {
    private int temperature;

    AC(String name) {
        super(name);
        this.temperature = 24; // default comfortable temperature
    }

    public void setTemperature(int t) {
        if (t >= 16 && t <= 30) {
            temperature = t;
        } else {
            System.out.println("❌ Invalid AC Temperature (Allowed 16–30)");
        }
    }

    @Override
    public void status() {
        System.out.println(getDeviceName() + " | Power: " + (getIsOn() ? "ON" : "OFF") + " | Temperature: " + temperature);
    }
}
public class Self10 {
    public static void main(String[] args) {

        Fan fan = new Fan("Living Room Fan");
        AC ac = new AC("Bedroom AC");

        fan.setSpeed(3);
        fan.setSpeed(8);   // invalid

        ac.setTemperature(18);
        ac.setTemperature(35); // invalid

        fan.turnOn();
        ac.turnOn();

        System.out.println("\n=== FINAL DEVICE STATUS ===");
        fan.status();
        ac.status();
    }
}
