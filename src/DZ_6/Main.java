package DZ_6;

import DZ_6.abstractFactory.GameFactory;
import DZ_6.abstractFactory.Graphic2DFactory;
import DZ_6.abstractFactory.Graphic3DFactory;
import DZ_6.builder.Human;
import DZ_6.factory.Factory;
import DZ_6.prototype.DemonSouls;

public class Main {
    public static void main(String[] args) {
        Souls bloodborne = Factory.getSouls(SoulsEnum.BLOODBORNE);
        Souls mortal_shell = Factory.getSouls(SoulsEnum.MORTAL_SHELL);
        System.out.println(bloodborne + " " + mortal_shell);

        GameFactory graphic2DFactory = new Graphic2DFactory();
        GameFactory graphic3DFactory = new Graphic3DFactory();
        Souls graphic2DBlasphemous = graphic2DFactory.getBlasphemous();
        Souls graphic3DTheSurge = graphic3DFactory.getTheSurge();
        System.out.println(graphic2DBlasphemous + " " + graphic3DTheSurge);

        Human human = new Human.Builder( "Hidetaka").setAge(60).setFirstName("Miyadzaki").build();
        System.out.println(human);

        DemonSouls demonSouls = new DemonSouls("nice", "Awesome");
        System.out.println(demonSouls.clone());
    }
}
