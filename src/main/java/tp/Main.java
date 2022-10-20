package tp;

public class Main {
   
    public static void main(String[] args){
       
        System.out.println("Trabajo Practico 2");
        EpicDoubleHashMap<Integer, String, String> map = new EpicDoubleHashMap<>();
        map.addFirstType(5,"Bulldog");
        map.addSecondType(2,"Bull Terrier");
        map.addTwo(1,"Chihuahua", "Pitbull");
        System.out.println(map.getSecondMap2(5));
           
    }

}

