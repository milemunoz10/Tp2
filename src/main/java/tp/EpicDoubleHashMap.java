package tp;

import java.util.HashMap;

public class EpicDoubleHashMap <K extends Number, V, T> {

    HashMap<K, V> mapValue1;
    HashMap<K, T> mapValue2;
    public EpicDoubleHashMap(){
        mapValue1 = new HashMap<>();
        mapValue2 = new HashMap<>();
    }

    public HashMap<K, V> getFirstMap1() {
        return mapValue1;
    }
    public String addFirstType(K key, V value){
       return (String) mapValue1.put(key, value);
    }
    public String addSecondType(K key, T value2){
       return (String) mapValue2.put(key, value2);
    }
    public HashMap<K, T> getSecondMap2() {
        return mapValue2;
    }

    public Object addTwo(K key, V value, T value2) {
        mapValue1.put(key, value);
        mapValue2.put(key, value2);

        return null;
    }

    public void removeFirstType(K key){
        mapValue1.remove(key);
    }

    public void removerSecondType(K key){
        mapValue2.remove(key);
    }
    public void removeTwoTypes(K key){
        mapValue1.remove(key);
        mapValue2.remove(key);
    }
}

