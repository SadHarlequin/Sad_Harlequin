package DZ_6.abstractFactory;

public class Graphic2DFactory extends GameFactory{
    @Override
    public Blasphemous getBlasphemous() {
        return new Blasphemous("2D");
    }

    @Override
    public TheSurge getTheSurge() {
        return new TheSurge("2D");
    }
}
