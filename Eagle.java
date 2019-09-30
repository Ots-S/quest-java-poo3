public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public int ascend(int meters) {
        this.altitude = getAltitude() + meters;
        System.out.println(this.getName() + " flies upward, altitude : " + this.getAltitude());
        return this.altitude;
    } 

    @Override 
    public int descend(int meters) {
        this.altitude = getAltitude() - meters;
        System.out.println(this.getName() + " flies downward, alitude : " + this.getAltitude());
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude <= 9) {
            System.out.println(this.getName() + " lands on the ground.");
        }
        else {
        System.out.println(this.getName() + " is too high to land.");
        }
        
    }
}
