import java.util.Random;
public class Robber extends Ability{
    final Random random = new Random();
    Robber(String Imya){
        setHealth(10);
        setArmor(3);
        setArrow(0);
        setDamage(random.nextInt(2,4));
        setAttack(8);
        setDelivery(0);
        setSpeed(6);
        setWizzard(0);
        Name = Imya;
        Info = "Фокус с монеткой зашел слишком далеко";
    }
}

