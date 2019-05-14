package factory;

public class Yamaha extends Motorbike {

    public Yamaha(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        return "私は今 " + name + " を運転しています";
    }
}
