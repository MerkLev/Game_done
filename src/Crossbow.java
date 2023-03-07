import Point.Point;

import java.util.Random;
public class Crossbow extends Ability{
    final Random random = new Random();
    Crossbow(String Imya,String Teams){
        setHealth(10);
        setMaxHealth(10);
        setArmor(3);
        setArrow(16);
        setDamage(random.nextInt(2,3));
        setAttack(6);
        setDelivery(0);
        setSpeed(4);
        Team = Teams;
        setWizzard(0);
        if(Team == "Red"){Pos = new Point(0,0);} else Pos = new Point (9, 0);
        Name = Imya;
        Info = "Арбалетчик";
    }
}

