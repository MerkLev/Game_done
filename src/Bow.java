import Point.Point;
import java.util.*;
class Bow extends Ability {
    final Random random = new Random();

    Bow(String Imya, String Teams, String aTeams) {
        setMaxHealth(10);
        setHealth(10);
        setArmor(3);
        setArrow(16);
        setDamage(random.nextInt(2, 3));
        setAttack(6);
        setDelivery(0);
        setSpeed(4);
        Team = Teams;
        Stat = "Alive";
        setWizzard(0);
        if (Team.equals("Blue")) {
            Pos = new Point(1, 1);
        } else Pos = new Point(10, 7);
        Name = Imya;
        Info = "Лучник";
        aTeam = aTeams;
    }

    public void doDamage(Ability Bow, Ability Enemy) {
        int dam = Bow.getDamage();
        Enemy.setHealth(Enemy.getHealth() - dam);
        if(Enemy.getHealth()>0){
            System.out.printf("\n%s наносит %s %d урона", Bow.getName(),Enemy.getName(),dam);
        } else if ((Enemy.getHealth())<=0) {
            System.out.printf("\n%s убивает %s", Bow.getName(), Enemy.getName());
            Enemy.setStat("Dead");
        }
    }


    //    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    @Override
    void Step(List<Ability> Team, List<Ability> Team2,List<Ability> allteam) {
        for (Ability A : Team) {
            if (A.getInfo().equals("Лучник") && A.getHealth() > 0 && A.getArrow() > 0) {
                Ability Bo = A;
                doDamage(Bo, Team2.get(getNearestEnemy(Bo.getPoint(), Team2)));
                for (Ability B : Team) {
                    if (B.getInfo().equals("Фермер") && B.getHealth() > 0) {
                        return;
                    } else if (B.getInfo().equals("Фермер") && B.getHealth() == 0) {
                        System.out.println("Bowman: Poor Yorick");
                        Bo.setArrow(Bo.getArrow() - 1);
                    }
                    ;
                }
            }
        }
    }
}


