import Point.Point;

import java.util.Random;
public class Monk extends Ability{
    final Random random = new Random();
    Monk(String Imya, String Teams){
        setHealth(30);
        setMaxHealth(30);
        setArmor(7);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(12);
        setDelivery(0);
        Team = Teams;
        setSpeed(5);
        setWizzard(1);
        Name = Imya;
        if(Team == "Red"){Pos = new Point(0,1);} else Pos = new Point (9, 1);
        Info = "Монах";
    }
}
