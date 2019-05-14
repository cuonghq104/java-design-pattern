package factory;

public class CarFactory extends RootFactory<Car>{
    public static final int LAMBORGHINIR = 1;
    public static final int MERCEDES = 2;
    public static final int MITSUBISHI = 3;

    public static Car create(String modelName, int type) {
        switch (type) {
            case LAMBORGHINIR: {
                return new Lamborghinir(modelName);
            }
            case MERCEDES: {
                return new Mercedes(modelName);
            }
            case MITSUBISHI: {
                return new Mitsubishi(modelName);
            }
            default:
                return null;
        }
    }

    public static Car createMercedes(String modelName) {
        return create(modelName, MERCEDES);
    }

    public static Car createLamborghinir(String modelName) {
        return create(modelName, LAMBORGHINIR);
    }

    public static Car createMitsubishi(String modelName) {
        return create(modelName, MITSUBISHI);
    }

    @Override
    public Car create(int name, int type) {
        return null;
    }
}
