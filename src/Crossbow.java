import java.util.Random;
public class Crossbow extends Ability{
    final Random random = new Random();
    Crossbow(String Imya){
        setHealth(10);
        setArmor(3);
        setArrow(16);
        setDamage(random.nextInt(2,3));
        setAttack(6);
        setDelivery(0);
        setSpeed(4);
        setWizzard(0);
        Name = Imya;
        Info = "Перезаряжаю дольше, чем стреляю";
    }
}

