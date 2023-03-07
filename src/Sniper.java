import Point.Point;

import java.util.Random;
public class Sniper extends Ability{
    final Random random = new Random();
    Sniper(String Imya,String Teams){
        setHealth(15);
        setMaxHealth(15);
        setArmor(10);
        setArrow(32);
        setDamage(random.nextInt(8,10));
        setAttack(12);
        setDelivery(0);
        Team = Teams;
        setSpeed(9);
        setWizzard(0);
        Name = Imya;
        if(Team == "Red"){Pos = new Point(0,4);} else Pos = new Point (9, 4);
        Info = "Снайпер";
    }

}
