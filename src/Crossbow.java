import Point.Point;

import java.util.List;
import java.util.Random;
public class Crossbow extends Ability{
    final Random random = new Random();
    Crossbow(String Imya,String Teams, String aTeams){
        setHealth(10);
        setMaxHealth(10);
        setArmor(3);
        setArrow(16);
        setDamage(random.nextInt(2,3));
        setAttack(6);
        setDelivery(0);
        Stat = "Alive";
        setSpeed(4);
        Team = Teams;
        setWizzard(0);
        if (Team.equals("Blue")) {
            Pos = new Point(1, 2);
        } else Pos = new Point(10, 1);
        Name = Imya;
        Info = "Арбалетчик";
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
            if (A.getInfo().equals("Волшебник") && A.getHealth() > 0) {
                Ability Bo = A;
                doDamage(Bo, Team2.get(getNearestEnemy(Bo.getPoint(), Team2)));
            }
        }
    }
}

