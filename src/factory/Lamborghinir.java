package factory;

public class Lamborghinir extends Car{

    public Lamborghinir(String modelName) {
        super(modelName);
    }

    @Override
    protected String getDescription() {
        return modelName + " - un'auto fatta in Italia";
    }
}
