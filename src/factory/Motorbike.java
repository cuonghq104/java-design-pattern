package factory;

public abstract class Motorbike{

    protected String name;

    public Motorbike(String name) {
        this.name = name;
    }

    protected abstract String getDescription();

    @Override
    public String toString() {
        return "[Motorbike]" + getDescription();
    }
}
