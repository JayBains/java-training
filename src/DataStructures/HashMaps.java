package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

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

    public void addWeapon(String material, String weaponType) {
        if (material == null || weaponType == null) {
            throw new IllegalArgumentException("Material and weapon type cannot be null");
        }
        weapons.computeIfAbsent(material, k -> new ArrayList<>()).add(weaponType);
    }

    public void printWeapons() {
        weapons.values().forEach(System.out::println);
    }

    public void printMaterials() {
        System.out.println(weapons.keySet());
    }

    public void printWeaponsByMaterial(String material) {
        System.out.printf("Key: %s | Value: %s%n",material, weapons.getOrDefault(material, new ArrayList<>()));
    }
}