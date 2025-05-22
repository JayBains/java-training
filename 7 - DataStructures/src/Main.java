public class Main {
    public static void main(String[] args) {

        HashMaps weapons = new HashMaps();
        System.out.println(weapons.getWeaponsByMaterial("Dragonbone"));
        weapons.addWeapon("Glass", "Mace");
        weapons.addWeapon("Glass", "Longsword");
        weapons.weaponMap();
        System.out.println(weapons.getMaterials());
        System.out.println(weapons.hasMaterial("Glass"));

        Stacks stacks = new Stacks(10);
        stacks.printStack();
        stacks.shuffleStack();
        stacks.printStack();
        stacks.manualSortStack();
    }
}