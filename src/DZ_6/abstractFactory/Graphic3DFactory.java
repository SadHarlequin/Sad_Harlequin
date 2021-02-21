package DZ_6.abstractFactory;

public class Graphic3DFactory extends GameFactory{
    @Override
    public Blasphemous getBlasphemous() {
        return new Blasphemous("3D");
    }

    @Override
    public TheSurge getTheSurge() {
        return new TheSurge("3D");
    }
}
