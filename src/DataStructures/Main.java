package DataStructures;

public class Main {
    public static void main(String[] args) {

        HashMaps weapons = new HashMaps();
        weapons.weaponMap();
        weapons.addWeapon("Glass", "Mace");
        weapons.addWeapon("Glass", "Longsword");
        weapons.printMaterials();
        weapons.printWeaponsByMaterial( "Glass");

        Stacks stacks = new Stacks(10);
        stacks.printStack();
        stacks.shuffleStack();
        stacks.printStack();
        stacks.manualSortStack();
    }
}