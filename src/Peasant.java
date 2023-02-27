import java.util.Random;
public class Peasant extends Ability{
    final Random random = new Random();
    Peasant(String Imya){
        setHealth(1);
        setArmor(1);
        setArrow(0);
        setDamage(1);
        setAttack(1);
        setDelivery(1);
        setSpeed(3);
        setWizzard(0);
        Name = Imya;
        Info = "Тут и сказать нечего";
    }
}
