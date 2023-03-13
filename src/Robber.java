import Point.Point;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Robber extends Ability{
    final Random random = new Random();
    Scanner Sc= new Scanner(System.in);
    Robber(String Imya,String Teams, String aTeams){
        setHealth(10);
        setMaxHealth(10);
        setArmor(3);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(8);
        setDelivery(0);
        Stat = "Alive";
        Team = Teams;
        setSpeed(6);
        setWizzard(0);
        Name = Imya;
        if (Team.equals("Blue")) {
            Pos = new Point(1, 5);
        } else Pos = new Point(10, 4);
        Info = "Вор";
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
            if (C.getInfo().equals("Вор") && C.getHealth() > 0) {
                A = C;
                System.out.printf("\nХодит Вор %s команды!", A.getTeam());
                for (int i = 0; i < A.getSpeed(); i++) {
                    Buff = A.getPoint();
                    int X = Buff.getX();
                    int Y = Buff.getY();
                    System.out.println("\nПередвижение. Введите следующий символ:");
                    System.out.println("\nW- Вверх, A- Влево,S - Вниз, D-Вправо:");
                    String move = Sc.nextLine();
                    switch (move) {
                        case ("W"):
                            if((Y-1)<1){
                                System.out.println("Бежать некуда!"); break;}
                            Abuff =new Point(X, Y-1);
                            for(Ability F : allteam){
                                if (F.getPoint().equals(Abuff) && F.getTeam().equals(A.getTeam())) {
                                    System.out.print("Тут наш союзник");
                                    break;
                                }else if(F.getPoint()==Abuff && F.getTeam().equals(A.getaTeam())){
                                    doDamage(A,F);
                                    return;
                                }else
                                    A.setPos(Abuff);
                                    break;
                            }
                        case ("A"):
                            if((X-1)<1){
                                System.out.println("Бежать некуда!"); break;}
                            Abuff =new Point(X-1, Y);
                            for(Ability F : allteam){
                                if (F.getPoint().equals(Abuff) && F.getTeam().equals(A.getTeam())) {
                                    System.out.print("Тут наш союзник");
                                    break;
                                }else if(F.getPoint()==Abuff){
                                    doDamage(A,F);
                                    return;
                                }else
                                    A.setPos(Abuff);
                            }
                            break;
                        case ("S"):
                            if((Y+1)>10){
                                System.out.println("Бежать некуда!"); break;}
                            Abuff =new Point(X, Y+1);
                            for(Ability F : allteam){
                                if (F.getPoint().equals(Abuff) && F.getTeam().equals(A.getTeam())) {
                                    System.out.print("Тут наш союзник");
                                    break;
                                }else if(F.getPoint()==Abuff){
                                    doDamage(A,F);
                                    return;
                                }else
                                    A.setPos(Abuff);
                                    break;
                            }
                        case ("D"):
                            if((X+1)>10){
                                System.out.println("Бежать некуда!"); break;}
                            Abuff =new Point(X+1, Y);
                            for(Ability F : allteam){
                                if (F.getPoint().equals(Abuff) && F.getTeam().equals(A.getTeam())) {
                                    System.out.print("Тут наш союзник");
                                    break;
                                }else if(F.getPoint()==Abuff){
                                    doDamage(A,F);
                                    return;
                                }else
                                    A.setPos(Abuff);
                                    break;
                            }
                    }
                }
            }
        }
    }
}

