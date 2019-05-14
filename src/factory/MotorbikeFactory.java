package factory;

public class MotorbikeFactory {

    public static final int YAMAHA = 1;
    public static final int DUCATI = 2;

    public static Motorbike create(String name, int type) {
        switch (type) {
            case YAMAHA: {
                return new Yamaha(name);
            }
            case DUCATI: {
                return new Ducati(name);
            }
            default:
                return null;
        }
    }

    public static Motorbike createYamaha(String name) {
        return create(name, YAMAHA);
    }

    public static Motorbike createDucati(String name) {
        return create(name, DUCATI);
    }
}
