import Point.Point;

import java.util.Random;
public class Robber extends Ability{
    final Random random = new Random();
    Robber(String Imya,String Teams){
        setHealth(10);
        setMaxHealth(10);
        setArmor(3);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(8);
        setDelivery(0);
        Team = Teams;
        setSpeed(6);
        setWizzard(0);
        Name = Imya;
        if(Team == "Red"){Pos = new Point(0,3);} else Pos = new Point (9, 3);
        Info = "Вор";
    }
}

