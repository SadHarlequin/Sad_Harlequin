package DZ_6.factory;

import DZ_6.SoulsEnum;
import DZ_6.Souls;


public class Factory {
    public static Souls getSouls(SoulsEnum souls){
        return souls.equals(SoulsEnum.BLOODBORNE) ? new Bloodborne() : new Mortal_Shell();
    }
}
