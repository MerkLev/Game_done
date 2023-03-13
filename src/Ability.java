import java.util.*;
import Point.*;
public abstract class Ability extends Distance{
    private int Attack;
    private int Armor;
    private int Arrow;
    private int Health;
    private int MaxHealth;
    private int Speed;
    private int Damage;
    private int Delivery;
    public String Stat;
    private int Wizzard;
    public String Name;
    public String Info;
    public Point Pos;
    public String Status;
    public String Team;
    public String aTeam;

    public String getaTeam() {
        return aTeam;
    }

    void StepBow(Ability Bow, List<Ability> Team, List<Ability> Team2){}

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }

    public int getArrow() {
        return Arrow;
    }

    public void setArrow(int arrow) {
        Arrow = arrow;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getDelivery() {
        return Delivery;
    }

    public void setDelivery(int delivery) {
        Delivery = delivery;
    }

    public int getWizzard() {
        return Wizzard;
    }

    public void setWizzard(int wizzard) {
        Wizzard = wizzard;
    }
    public String getInfo(){return(Info);}
    public Point getPoint(){return(Pos);}

    public int getMaxHealth() {
        return MaxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        MaxHealth = maxHealth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    //    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
     void Step( List<Ability> Team, List<Ability> Team2,List<Ability> allteam){};
     void Step(Ability Pes, List<Ability> Team){};

    public String getStat() {
        return Stat;
    }

    public String getTeam() {
        return Team;
    }

    public void setPos(Point pos) {
        Pos = pos;
    }

    public void setStat(String stat) {
        Stat = stat;
    }
    @Override
    public String toString() {
        return getName() +
                " H:" + Math.round(getHealth()) +
                " D:" + getArmor() +
                " A:" + getAttack() +
                " Dmg:" + getDamage() +
                " " + getStat();
    }
}
