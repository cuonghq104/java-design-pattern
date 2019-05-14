package factory;

public class Mercedes extends Car {
    public Mercedes(String modelName) {
        super(modelName);
    }

    @Override
    protected String getDescription() {
        return modelName + " - ein in Italien hergestelltes Auto";
    }
}
