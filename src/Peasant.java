import Point.Point;

import java.util.List;
import java.util.Random;
class Peasant extends Ability{
    final Random random = new Random();
    Peasant(String Imya, String Teams){
        setHealth(1);
        setMaxHealth(1);
        setArmor(1);

        setArrow(0);
        setDamage(1);
        setAttack(1);
        Team = Teams;
        setDelivery(1);
        setSpeed(3);
        setWizzard(0);
        Name = Imya;
        if(Team == "Red"){Pos = new Point(0,2);} else Pos = new Point (9, 2);
        Info = "Фермер";
    }
    @Override
    public void StepPeasant(Ability Pes, List<Ability> Team){
        if(Pes.getHealth()>0){
            for(Ability A: Team){
                if (A.getHealth()<A.getMaxHealth()) {
                    System.out.println("Peasant: Somebody needs my attention!");
                    A.setHealth(A.getMaxHealth());
                    return;
                }
            }
            System.out.println("Peasant: I have free time now");
        }
    }
}
