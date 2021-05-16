/*Tashreeq Williams(217290671)*/

import java.util.ArrayList;

public class ListSample {
    public ArrayList <String> addToList(ArrayList<String> fruits, String fruitName) {

         fruits.add(fruitName);
         return fruits;
    }
    public ArrayList <String> removeFromList(ArrayList<String> fruits, String fruitName) {

     fruits.remove(fruitName);
     return fruits;
}
    public ArrayList <String> findFromList(ArrayList<String> fruits, String fruitName){
        fruits.contains(fruitName);
        return fruits;
    }

}