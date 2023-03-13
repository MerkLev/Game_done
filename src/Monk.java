import Point.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Monk extends Ability{
    final Random random = new Random();
    Scanner Sc= new Scanner(System.in);
    Monk(String Imya, String Teams, String aTeams){
        setHealth(30);
        setMaxHealth(30);
        setArmor(7);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(12);
        setDelivery(0);
        Stat = "Alive";
        Team = Teams;
        setSpeed(5);
        setWizzard(1);
        Name = Imya;
        if (Team.equals("Blue")) {
            Pos = new Point(1, 3);
        } else Pos = new Point(10, 2);
        Info = "Монах";
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
        Ability A;
        Point Buff;
        Point Abuff;
        for (Ability C : Team) {
            if (C.getInfo().equals("Монах") && C.getHealth() > 0) {
                A = C;
                System.out.printf("\nХодит Монах %s команды!", A.getTeam());
                for (int i = 0; i < A.getSpeed(); i++) {
                    Buff = A.getPoint();
                    int X = Buff.getX();
                    int Y = Buff.getY();
                    System.out.println("\nПередвижение. Введите следующий символ:");
                    System.out.println("\nW- Вверх, A- Влево,S - Вниз, D-Вправо. Пример: DDSS");

                    String move = Sc.nextLine();
                    switch (move) {
                        case ("W"):
                            if((Y-1)<1){
                                System.out.println("Бежать некуда!");
                                break;
                            }else
                                Abuff =new Point(X, Y-1);
                            for(Ability F : allteam){
                                if (F.getPoint()==Abuff && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                    System.out.printf("Привет, %s!",F.getName());
                                } else if (F.getPoint()==Abuff && !F.getTeam().equals(C.getTeam())){
                                    doDamage(C,F);
                                }
                                else C.setPos(Abuff);
                            }
                            break;

                        case ("A"):
                            if((X-1)<1){
                                System.out.println("Бежать некуда!");
                                break;
                            }else
                                Abuff =new Point(X-1, Y);
                            for(Ability F : allteam){
                                if (F.getPoint()==Abuff && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                    System.out.printf("Привет, %s!",F.getName());
                                } else if (F.getPoint()==Abuff && !F.getTeam().equals(C.getTeam())){
                                    doDamage(C,F);
                                }
                                else C.setPos(Abuff);
                            }
                            break;
                        case ("S"):
                            if((Y+1)>10){
                                System.out.println("Бежать некуда!");
                                break;
                            }else
                                Abuff =new Point(X, Y+1);
                            for(Ability F : allteam){
                                if (F.getPoint()==Abuff && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                    System.out.printf("Привет, %s!",F.getName());
                                } else if (F.getPoint()==Abuff && !F.getTeam().equals(C.getTeam())){
                                    doDamage(C,F);
                                }
                                else C.setPos(Abuff);
                            }
                            break;
                        case ("D"):
                            if((X+1)>10){
                                System.out.println("Бежать некуда!");
                                break;
                            }else
                                Abuff =new Point(X+1, Y);
                            for(Ability F : allteam){
                                if (F.getPoint()==Abuff && F.getTeam().equals(C.getTeam()) && !F.getName().equals(C.getName())) {
                                    System.out.printf("Привет, %s!",F.getName());
                                } else if (F.getPoint()==Abuff && !F.getTeam().equals(C.getTeam())){
                                    doDamage(C,F);
                                }
                                else C.setPos(Abuff);
                            }
                            break;
                    }
                }
            }
        }
    }

}
