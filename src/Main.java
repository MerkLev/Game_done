import java.util.*;
public class Main {
    public static void main(String[] args) {
        Ability Sn = new Sniper("Dasha");
        Ability Mo = new Monk("Vasya");
        Ability Ro = new Robber("Pasha");
        Ability Wi = new Wizzard("Willy Wonka");
        Ability Pi = new Peasant("Masha");
        Ability Sp =new Spearman("Ilya");
        Ability Sn1 = new Sniper("Katya");
        Ability Mo1 = new Monk("Vanya");
        Ability Ro1 = new Robber("Petr");
        Ability Wi1 = new Wizzard("Harry Potter");
        Ability Pi1 = new Peasant("Nasya");
        Ability Sp1 =new Spearman("Gosha");



        List<Ability> A = Arrays.asList(Sn,Mo,Wi,Pi,Sp,Ro);
        List<Ability> A1 = Arrays.asList(Sn1,Mo1,Wi1,Pi1,Sp1,Ro1);
        List<Ability> listC = new ArrayList<>(A);
        listC.addAll(A1);
        Collections.sort(listC, (o1, o2) -> o2.getSpeed() - o1.getSpeed());
        for (Ability D:listC){
            System.out.println(D.getInfo());
        }





    }
}