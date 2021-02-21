package DZ_6.abstractFactory;

import DZ_6.Souls;

public class Blasphemous implements Souls{
    private final String graphic;

    public Blasphemous(String graphic){
        this.graphic = graphic;
    }

    @Override
    public void start() {
        System.out.println("Start Blasphemous");
    }

    @Override
    public String toString() {
        return "Blasphemous{" +
                "graphic='" + graphic + '\'' +
                '}';
    }
}
