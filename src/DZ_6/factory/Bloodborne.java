package DZ_6.factory;

import DZ_6.Souls;

public class Bloodborne implements Souls{
    @Override
    public void start(){
        System.out.println("Start Bloodborne");
    }
    @Override
    public String toString() {
        return "Bloodborne{}";
    }
}
