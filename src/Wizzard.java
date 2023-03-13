import Point.Point;

import java.util.List;
import java.util.Random;
public class Wizzard extends Ability {
    final Random random = new Random();

    Wizzard(String Imya, String Teams, String aTeams) {
        setHealth(30);
        setMaxHealth(30);
        setArmor(12);
        setArrow(0);
        setDamage(random.nextInt(2, 5));
        setAttack(17);
        setDelivery(0);
        setSpeed(8);
        Stat = "Alive";
        Team = Teams;
        setWizzard(1);
        if (Team .equals( "Blue")) {
            Pos = new Point(1, 2);
        } else Pos = new Point(10, 1);
        Name = Imya;
        Info = "Чернокнижник";
        aTeam = aTeams;
    }

    public void doDamage(Ability Bow, Ability Enemy) {
        int dam = Bow.getDamage();
        Enemy.setHealth(Enemy.getHealth() - dam);
        if(Enemy.getHealth()>0){
            System.out.printf("\n%s наносит %s %d урона", Bow.getName(),Enemy.getName(),dam);
        }
        else if ((Enemy.getHealth())<=0) {
            System.out.printf("\n%s убивает %s", Bow.getName(), Enemy.getName());
            Enemy.setStat("Dead");
        }
    }
    @Override
    void Step(List<Ability> Team, List<Ability> Team2,List<Ability> allteam) {
        for (Ability A : Team) {
            if (A.getInfo().equals("Чернокнижник") && A.getHealth() > 0) {
                Ability Bo = A;
                doDamage(Bo, Team2.get(getNearestEnemy(Bo.getPoint(), Team2)));
            }
        }
    }
}

