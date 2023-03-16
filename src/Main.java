import Point.Point;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class Main {
    static Ability Sn = new Sniper("Dasha", "Blue", "Green");
    static Ability Mo = new Monk("Vasya", "Blue", "Green");
    static Ability Ro = new Robber("Pasha", "Blue", "Green");
    static Ability Wi = new Wizzard("Willy Wonka", "Blue", "Green");
    static Ability Pi = new Peasant("Masha", "Blue", "Green");
    static Ability Sp = new Spearman("Ilya", "Blue", "Green");
    static Ability Bo = new Bow("Lera", "Blue", "Green");
    static Ability Sn1 = new Sniper("Katya", "Green", "Blue");
    static Ability Mo1 = new Monk("Vanya", "Green", "Blue");
    static Ability Ro1 = new Robber("Petr", "Green", "Blue");
    static Ability Wi1 = new Wizzard("Harry Potter", "Green", "Blue");
    static Ability Pi1 = new Peasant("Nasya", "Green", "Blue");
    static Ability Bo1 = new Bow("VaLera", "Green", "Blue");
    static Ability Sp1 = new Spearman("Gosha", "Green", "Blue");
    static List <Ability> holyTeam = Arrays.asList(Sn, Bo, Mo, Ro, Wi, Pi, Sp);
    static List <Ability> darkTeam = Arrays.asList(Sn1, Bo1, Mo1, Ro1, Wi1, Pi1, Sp1);
    static List <Ability> allTeam = new ArrayList<>();
    static List <Point> Positions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);
        boolean Game = true;
        while (Game){
            View.view();
            Sc.nextLine();
            for(Ability A: allTeam){
                Positions.add(A.getPoint());
            }
            boolean WinBlue = false;
            boolean WinGreen = false;
            int deadCount = 0;
            for(Ability P: holyTeam) {
                if (P.getStat().equals("Dead")) {deadCount++;}
                if (deadCount == 7) {WinGreen = true;}
            }
            deadCount = 0;
            for (Ability H : darkTeam) {
                if (H.getStat().equals("Dead")) {deadCount++;}
                if (deadCount == 7) {WinBlue = true;}
            }
            if(WinGreen){
                System.out.println("Green wins!");
                Game = false;
            }else if (WinBlue){
                System.out.println("Blue wins!");
                Game = false;
            }
            if (!WinGreen && !WinBlue){
                for (Ability human: allTeam) {
                    if (holyTeam.contains(human)) {
                        human.Step(holyTeam, darkTeam, allTeam);
                    } else human.Step(darkTeam, holyTeam, allTeam);
                }
            }
        }
    }
    static void sortTeam (List<Ability> team){
        team.sort(new Comparator<Ability>() {
            @Override
            public int compare(Ability t0, Ability t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHealth() - t0.getHealth());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }

}