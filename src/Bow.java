import Point.Point;
import java.util.*;
class Bow extends Ability {
    final Random random = new Random();

    Bow(String Imya, String Teams) {
        setMaxHealth(10);
        setHealth(10);
        setArmor(3);
        setArrow(16);
        setDamage(random.nextInt(2, 3));
        setAttack(6);
        setDelivery(0);
        setSpeed(4);
        Team = Teams;
        setWizzard(0);
        if (Team.equals("Red")) {
            Pos = new Point(0, 7);
        } else Pos = new Point(9, 7);
        Name = Imya;
        Info = "Лучник";
    }

    public void doDamage(Ability Bow, Ability Enemy) {
        System.out.println(Enemy.getName());
        System.out.println(Enemy.getPoint());
        System.out.println(getDistance(Bow.getPoint(),Enemy.getPoint()));
        Enemy.setHealth(Enemy.getHealth() - Bow.getDamage());
        System.out.println(Enemy.getHealth());
    }


    //    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    @Override
    void StepBow(Ability Bow, List<Ability> Team, List<Ability> Team2) {
        if (Bow.getHealth() > 0 && Bow.getArrow() > 0) {
            doDamage(Bow, Team2.get(getNearestEnemy(Bow.getPoint(), Team2)));
        }
        for (Ability A : Team) {
            if (A.getInfo().equals("Фермер") && A.getHealth() > 0) {
                System.out.println("Peasant: Nice shot sir!");
                return;
            } else if (A.getInfo().equals("Фермер") && A.getHealth() == 0) {
                System.out.println("Bowman: Poor Yorick");
                Bow.setArrow(Bow.getArrow() - 1);
            } ;
        }
    }
}
