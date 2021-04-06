package DZ_8;

import DZ_8.TM.Chess;
import DZ_8.TM.Game;
import DZ_8.TM.GameCode;
import DZ_8.TM.Monopoly;
import DZ_8.visitor.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Auto> arr = new ArrayList();
        arr.add(new Car("ВАЗ"));
        arr.add(new Track("ГАЗель"));
        arr.add(new Car("Mercedes"));
        arr.add(new Track("КамАЗ"));
        Visitor visitor = (Visitor) new AutoVisitor();
        for(Auto a:arr){
            a.Accept(visitor);
        }

        final GameCode gameCode = GameCode.Chess;
        Game game;
        switch (gameCode){
            case Chess :
                game = new Chess();
                break;
            case Monopoly :
                game = new Monopoly();
                break;
            default :
                throw new IllegalStateException();
        }
        game.playOneGame(2);
    }
}
