import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMaps weapons = new HashMaps();
        System.out.println(weapons.getWeaponsByMaterial("Dragonbone"));
        weapons.addWeapon("Glass", "Mace");
        weapons.addWeapon("Glass", "Longsword");
        weapons.weaponMap();
        System.out.println(weapons.getMaterials());
        System.out.println(weapons.hasMaterial("Glass"));
    }
}