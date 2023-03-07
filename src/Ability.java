import java.util.*;
import Point.*;
public class Ability extends Distance{
    private int Attack;
    private int Armor;
    private int Arrow;
    private int Health;
    private int MaxHealth;
    private int Speed;
    private int Damage;
    private int Delivery;
    private int Wizzard;
    public String Name;
    public String Info;
    public Point Pos;
    public String Status;
    public String Team;

    void StepBow(Ability Bow,List<Ability> Team,List<Ability> Team2){}

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
    public void StepPeasant(Ability Pes, List<Ability> Team){}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
