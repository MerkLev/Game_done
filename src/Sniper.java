import Point.Point;

import java.util.List;
import java.util.Random;
public class Sniper extends Ability{
    final Random random = new Random();
    Sniper(String Imya,String Teams, String aTeams){
        setHealth(15);
        setMaxHealth(15);
        setArmor(10);
        setArrow(32);
        setDamage(random.nextInt(8,10));
        setAttack(12);
        Stat = "Alive";
        setDelivery(0);
        Team = Teams;
        setSpeed(9);
        setWizzard(0);
        Name = Imya;
        if (Team.equals("Blue")) {
            Pos = new Point(1, 6);
        } else Pos = new Point(10, 5);
        Info = "Снайпер";
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
            if (A.getInfo().equals("Снайпер") && A.getHealth() > 0) {
                Ability Bo = A;
                doDamage(Bo, Team2.get(getNearestEnemy(Bo.getPoint(), Team2)));
            }
        }
    }

}
