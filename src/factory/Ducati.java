package factory;

public class Ducati extends Motorbike {

    public Ducati(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        return "Sto guidando un" + name + " ora";
    }
}
