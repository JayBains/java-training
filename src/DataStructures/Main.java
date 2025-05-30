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

        Lists lists = new Lists();
        lists.printList("myList");

        lists.addToList("lombok", "5");
        lists.addToList("lombok", "2");
        lists.addToList("lombok", "03");
        lists.addToList("lombok", "c");

        lists.sortList("lombok");
        lists.reverseList("lombok");
        lists.printList("lombok");


    }
}