package factory;

public class Main {

    public static void main(String[] args) {

        System.out.println(CarFactory.create("Aventador", CarFactory.LAMBORGHINIR));
        System.out.println(CarFactory.create("Veneno", CarFactory.LAMBORGHINIR));
        System.out.println(CarFactory.create("E300 coupe", CarFactory.MERCEDES));
        System.out.println(CarFactory.createMercedes("Glc 300"));
        System.out.println(CarFactory.createMitsubishi("Outlander"));
        System.out.println(CarFactory.create("Eclipse Cross", CarFactory.MITSUBISHI));
        System.out.println(CarFactory.create("Eclipse Cross", 4));
    }
}
