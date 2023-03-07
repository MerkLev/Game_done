import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        Ability Sn = new Sniper("Dasha", "Red");
        Ability Mo = new Monk("Vasya", "Red");
        Ability Ro = new Robber("Pasha", "Red");
        Ability Wi = new Wizzard("Willy Wonka", "Red");
        Ability Pi = new Peasant("Masha", "Red");
        Ability Sp = new Spearman("Ilya", "Red");
        Ability Bo = new Bow("Lera", "Red");
        Ability Sn1 = new Sniper("Katya", "Green");
        Ability Mo1 = new Monk("Vanya", "Green");
        Ability Ro1 = new Robber("Petr", "Green");
        Ability Wi1 = new Wizzard("Harry Potter", "Green");
        Ability Pi1 = new Peasant("Nasya", "Green");
        Ability Bo1 = new Bow("VaLera", "Green");
        Ability Sp1 = new Spearman("Gosha", "Green");

        List <Ability> team1 = Arrays.asList(Sn, Bo, Mo, Ro, Wi, Pi, Sp);
        List <Ability> team2 = Arrays.asList(Sn1, Bo1, Mo1, Ro1, Wi1, Pi1, Sp1);

        Bo.StepBow(Bo, team1, team2);
        Pi.StepPeasant(Pi, team1);
    }
}