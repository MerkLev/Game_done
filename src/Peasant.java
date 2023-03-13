import Point.Point;

import java.util.List;
import java.util.Random;
class Peasant extends Ability{
    final Random random = new Random();
    Peasant(String Imya, String Teams, String aTeams){
        setHealth(1);
        setMaxHealth(1);
        setArmor(1);

        setArrow(0);
        setDamage(1);
        setAttack(1);
        Team = Teams;
        Stat = "Alive";
        setDelivery(1);
        setSpeed(3);
        setWizzard(0);
        Name = Imya;
        if (Team.equals("Blue")) {
            Pos = new Point(1, 4);
        } else Pos = new Point(10, 3);
        Info = "Фермер";
        aTeam = aTeams;
    }
    @Override
    public void Step(List<Ability> Team, List<Ability> Team2,List<Ability> allteam){
        for (Ability A : Team) {
            if (A.getInfo().equals("Фермер") && A.getHealth() > 0) {
                for (Ability B : Team) {
                    if (B.getHealth() < B.getMaxHealth() && B.getHealth()>0) {
                        B.setHealth(B.getHealth()+6);
                        return;
                    }
                }
            }
        }
    }
}
