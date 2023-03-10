import Units.*;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Unit> team1 = new ArrayList<>();
        ArrayList<Unit> taem2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    team1.add(new XBowMan(getName()));
                    break;
                case 1:
                    team1.add(new Monk(getName()));
                    break;
        
                default:
                    team1.add(new Sniper(getName()));
                    break;
            }
            switch (new Random().nextInt(3)){
                case 0:
                    taem2.add(new XBowMan(getName()));
                    break;
                case 1:
                    taem2.add(new Monk(getName()));
                    break;
              
                default:
                    team1.add(new Sniper(getName()));
                    break;
            }
        }

        team1.forEach(u -> u.getNAME());
        taem2.forEach(u -> u.getNAME());
    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}
