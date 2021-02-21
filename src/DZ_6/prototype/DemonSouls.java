package DZ_6.prototype;

public class DemonSouls implements Cloneable<DemonSouls>{
    private String Gameplay, Stamina;

    public DemonSouls(String Gameplay, String Stamina){
        this.Gameplay=Gameplay;
        this.Stamina=Stamina;
    }

    @Override
    public DemonSouls clone(){
        return new DemonSouls( Gameplay, Stamina);
    }

    @Override
    public String toString() {
        return "DemonSouls{" +
                "Gameplay='" + Gameplay + '\'' +
                ", Stamina='" + Stamina + '\'' +
                '}';
    }
}
