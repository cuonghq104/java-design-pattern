package factory;

public abstract class Car {

    protected String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    protected abstract String getDescription();

    @Override
    public String toString() {
        return "[Car]" + getDescription();
    }
}
