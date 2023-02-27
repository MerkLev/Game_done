import java.util.*;
public class Ability {
    private int Attack;
    private int Armor;
    private int Arrow;
    private int Health;
    private int Speed;
    private int Damage;
    private int Delivery;
    private int Wizzard;
    public String Name;
    public String Info;

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
}
