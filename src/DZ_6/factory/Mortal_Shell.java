package DZ_6.factory;

import DZ_6.Souls;

public class Mortal_Shell implements Souls{
    @Override
    public String toString() {
        return "Mortal_Shell{}";
    }

    @Override
    public void start() {
        System.out.println("Start Mortal_Shell");
    }
}
