import Point.Point;

import java.util.List;
import java.util.Random;
import java.util.*;
public class Spearman extends Ability {
    final Random random = new Random();

    Spearman(String Imya, String Teams, String aTeams) {
        setHealth(10);
        setMaxHealth(10);
        setArmor(5);
        setArrow(0);
        setDamage(random.nextInt(8, 10));
        setAttack(4);
        setDelivery(0);
        Stat = "Alive";
        setSpeed(4);
        Team = Teams;
        setWizzard(0);
        Name = Imya;
        if (Team.equals("Blue")) {
            Pos = new Point(1, 7);
        } else Pos = new Point(10, 6);
        Info = "Копейщик";
        aTeam = aTeams;
    }

    Scanner Sc = new Scanner(System.in);

    public void doDamage(Ability Bow, Ability Enemy) {
        int dam = Bow.getDamage();
        Enemy.setHealth(Enemy.getHealth() - dam);
        if (Enemy.getHealth() > 0) {
            System.out.printf("\n%s наносит %s %d урона", Bow.getName(), Enemy.getName(), dam);
        } else if ((Enemy.getHealth()) <= 0) {
            System.out.printf("\n%s убивает %s", Bow.getName(), Enemy.getName());
            Enemy.setStat("Dead");
        }
    }


    @Override
    void Step(List<Ability> Team, List<Ability> Team2,List<Ability> allteam) {
        Ability A;
        Point Buff;
        Point Abuff;
        for (Ability C : Team) {
            if (C.getInfo().equals("Копейщик") && C.getHealth() > 0) {
                A = C;
                System.out.printf("\nХодит Копейщик %s команды!", A.getTeam());
                for (int i = 0; i < A.getSpeed(); i++) {
                    Buff = A.getPoint();
                    int X = Buff.getX();
                    int Y = Buff.getY();
                    boolean posss = false;
                    System.out.println("\nПередвижение. Введите следующий символ:");
                    System.out.println("\nW- Вверх, A- Влево,S - Вниз, D-Вправо.");
                    String move = Sc.nextLine();
                    switch (move) {
                        case ("W"):
                            Abuff =new Point(X, Y-1);
                            if((Y-1)<1){
                                System.out.println("Бежать некуда!");
                                break;}
                            for(Ability F : allteam) {
                                if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY()) {
                                    posss = true;
                                }
                            }
                            for(Ability F: allteam){
                                if (!posss) {
                                    C.setPos(Abuff);
                                } else if (posss) {
                                    if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                        System.out.printf("Привет, %s!", F.getName());
                                    } else if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && !F.getTeam().equals(C.getTeam())) {
                                        doDamage(C, F);
                                    }
                                }
                            }
                            break;

                        case ("A"):
                            Abuff =new Point(X-1, Y);
                            if((X-1)<1){
                                System.out.println("Бежать некуда!");
                                break;
                            }
                            for(Ability F : allteam) {
                                if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY()) {
                                    posss = true;
                                }
                            }
                            for(Ability F: allteam){
                                if (!posss) {
                                    C.setPos(Abuff);
                                } else if (posss) {
                                    if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                        System.out.printf("Привет, %s!", F.getName());
                                    } else if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && !F.getTeam().equals(C.getTeam())) {
                                        doDamage(C, F);
                                    }
                                }
                            }
                            break;
                        case ("S"):
                            Abuff =new Point(X, Y+1);
                            if((Y+1)>10){
                                System.out.println("Бежать некуда!");
                                break;
                            }
                            for(Ability F : allteam) {
                                if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY()) {
                                    posss = true;
                                }
                            }
                            for(Ability F: allteam){
                                if (!posss) {
                                    C.setPos(Abuff);
                                } else if (posss) {
                                    if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                        System.out.printf("Привет, %s!", F.getName());
                                    } else if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && !F.getTeam().equals(C.getTeam())) {
                                        doDamage(C, F);
                                    }
                                }
                            }
                            break;

                        case ("D"):
                            Abuff =new Point(X+1, Y);
                            if((X+1)>10){
                                System.out.println("Бежать некуда!");
                                break;
                            }
                            for(Ability F : allteam) {
                                if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY()) {
                                    posss = true;
                                }
                            }
                            for(Ability F: allteam){
                                if (!posss) {
                                    C.setPos(Abuff);
                                } else if (posss) {
                                    if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                        System.out.printf("Привет, %s!", F.getName());
                                    } else if (F.getPoint().getX() == Abuff.getX() && F.getPoint().getY() == Abuff.getY() && !F.getTeam().equals(C.getTeam())) {
                                        doDamage(C, F);
                                    }
                                }
                            }
                            break;
                    }
                }
            }
        }
    }
}
