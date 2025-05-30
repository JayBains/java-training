package DataStructures;

import java.util.*;

public class Lists {

    private Map<String, List<String>> listMap;

    public Lists() {
        this.listMap = new HashMap<>();
        listMap.put("myList", new ArrayList<>());
    }

    public List<String> getList(String listName){
        return listMap.get(listName);
    }

    public void addToList(String listName, String s){
        if(!listMap.containsKey(listName)){
            listMap.put(listName, new ArrayList<>());
        }
        listMap.get(listName).add(s);
    }

    public void printList(String listName) {
        List<String> list = listMap.get(listName);
        System.out.println(listName + ": " + list);
    }

    public void sortList(String listName){
        List<String> list = listMap.get(listName);
        Collections.sort(list);
    }

    public void reverseList(String listName){
        List<String> list = listMap.get(listName);
        Collections.reverse(list);
    }

//        myList.add(0, "yellow");
//        myList.set(0, "purple");
//        myList.remove(0);
//        System.out.println("Contains red: " + myList.contains("red"));
//        System.out.println("Element at index 0: " + myList.get(0));
//        Collections.sort(myList);
//        System.out.println("Sorted list: " + myList);
//        System.out.println("Portion: " + myList.subList(2, 4));
//        newList.addAll(myList);
//        Collections.reverse(newList);
//        Collections.swap(newList, 2, 3);
//        myList.forEach((a) -> System.out.print(newList.contains(a) + " "));


}