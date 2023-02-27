import java.util.Random;
public class Sniper extends Ability{
    final Random random = new Random();
    Sniper(String Imya){
        setHealth(15);
        setArmor(10);
        setArrow(32);
        setDamage(random.nextInt(8,10));
        setAttack(12);
        setDelivery(0);
        setSpeed(9);
        setWizzard(0);
        Name = Imya;
        Info = "Не в бровь, а в глаз";
    }

}
