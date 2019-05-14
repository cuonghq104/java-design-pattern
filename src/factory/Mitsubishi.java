package factory;

public class Mitsubishi extends Car{

    public Mitsubishi(String modelName) {
        super(modelName);
    }

    @Override
    protected String getDescription() {
        return modelName + " - イタリア製の車";
    }
}
