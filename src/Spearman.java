import Point.Point;

import java.util.Random;
public class Spearman extends Ability{
    final Random random = new Random();
    Spearman(String Imya,String Teams){
        setHealth(10);
        setMaxHealth(10);
        setArmor(5);
        setArrow(0);
        setDamage(random.nextInt(8,10));
        setAttack(4);
        setDelivery(0);
        setSpeed(4);
        Team = Teams;
        setWizzard(0);
        Name = Imya;
        if(Team == "Red"){Pos = new Point(0,5);} else Pos = new Point (9, 5);
        Info = "Копейщик";
    }
}

