package DZ_6.abstractFactory;

import DZ_6.Souls;

public class TheSurge implements Souls{
    private final String graphic;

    public TheSurge(String graphic){
        this.graphic = graphic;
    }

    @Override
    public void start() {
        System.out.println("Start TheSurge");
    }

    @Override
    public String toString() {
        return "TheSurge{" +
                "graphic='" + graphic + '\'' +
                '}';
    }
}
