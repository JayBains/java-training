import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;

public class HashMaps {
    private final Map<String, List<String>> weapons;

    public HashMaps() {
        weapons = new HashMap<>();
        
        List<String> dragonboneWeapons = new ArrayList<>(Arrays.asList("Sword", "Axe"));
        List<String> deadricWeapons = new ArrayList<>(Arrays.asList("Sword", "Dagger", "Bow"));
        List<String> ebonyWeapons = new ArrayList<>(List.of("Spear"));

        weapons.put("Dragonbone", dragonboneWeapons);
        weapons.put("Deadric", deadricWeapons);
        weapons.put("Ebony", ebonyWeapons);
    }

    public void weaponMap() {
        weapons.forEach((key, value) -> System.out.printf("Key: %s | Value: %s%n", key, value));
    }

    public List<String> getWeaponsByMaterial(String material) {
        return weapons.getOrDefault(material, new ArrayList<>());
    }

    public void addWeapon(String material, String weaponType) {
        if (material == null || weaponType == null) {
            throw new IllegalArgumentException("Material and weapon type cannot be null");
        }
        weapons.computeIfAbsent(material, k -> new ArrayList<>())
              .add(weaponType);
    }

    public boolean hasMaterial(String material) {
        return weapons.containsKey(material);
    }

    public Set<String> getMaterials() {
        return weapons.keySet();
    }
}