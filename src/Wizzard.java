import Point.Point;

import java.util.Random;
public class Wizzard extends Ability{
    final Random random = new Random();
    Wizzard(String Imya,String Teams){
        setHealth(30);
        setMaxHealth(30);
        setArmor(12);
        setArrow(0);
        setDamage(random.nextInt(2,5));
        setAttack(17);
        setDelivery(0);
        setSpeed(8);
        Team = Teams;
        setWizzard(1);
        if(Team == "Red"){Pos = new Point(0,6);} else Pos = new Point (9, 6);
        Name = Imya;
        Info = "Волшебник";
    }
}

