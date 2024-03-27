/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

//import animal.Husky;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class DogCage {
    private final double maxWeight;
    private List<Dog> dogs;
    
    public DogCage(double maxWeight){
        this.maxWeight = maxWeight;
        this.dogs = new ArrayList<>();
    }
    
    public void addDog(Dog dog){
        if(getTotalWeight() + dog.getWeight() < maxWeight){
            dogs.add(dog);
            System.out.println("\n" + dog.getNameString() + " added to the cage!");
        }else{
            System.out.println("\nCan't add " + dog.getNameString() + ". Cage is full!");
        }
    }
    
    public void removeDog(Dog dog){
        dogs.remove(dog);
        System.out.println("\n " + dog.getNameString() + " removed in the cage!");
    }
    
    public void throwSquirrel(){
        for(Dog dog : dogs){
            System.out.print(dog.getNameString() + " is barking! ");
            if(dog instanceof Mastiff){
                ((Mastiff)dog).bark();
            }else{
                dog.bark();
            }
        }
    }
    
//    public double getTotalWeight(){
//        double totalWeight = 0;
//        for(Dog dog : dogs){
//            totalWeight = totalWeight + dog.getWeight();
//        }
//        return totalWeight;
//    }
    
    //Stream API
    public double getTotalWeight(){
        return dogs.stream()
                .mapToDouble(Dog::getWeight)
                .sum();  
    }
    
    
    
//    public void listPitbull(){
//        System.out.print("\nPitbull in the cage! ");
//        for(Dog dog : dogs){
//            if(dog instanceof PitBull){
//                System.out.println("It's " + dog.getNameString());
//            }
//        }
//    }
    
    //Stream API
    public void listPitbull(){
        List<String> pitbull = dogs.stream()
                .filter(dog -> dog instanceof PitBull)
                .map(Dog::getNameString)
                .collect(Collectors.toList());
        System.out.print("\nPitbul in the cage! ");
        System.out.println("It's " + pitbull);
    }
    
    

//    public void listChihuahua(){
//        System.out.print("Chihuahua in the cage! ");
//        for(Dog dog :dogs){
//            if(dog instanceof Chihuahua){
//                System.out.println("It's " + dog.getNameString());
//            }
//        }   
//    }
    
    //Stream API
    public void listChihuahua(){
        List<String> chihuahua = dogs.stream()
                .filter(dog -> dog instanceof Chihuahua)
                .map(Dog::getNameString)
                .collect(Collectors.toList());
        System.out.print("\nChihuahua in the cage! ");
        System.out.println("It's " + chihuahua);
    }
    
    
    
//    public void listBegie(){
//        System.out.print("Begie in the cage! ");
//        for(Dog dog : dogs){
//            if(dog instanceof Begie){
//                System.out.println("It's " + dog.getNameString());
//            }
//        }
//    }
    
    //Stream API
    public void listBegie(){
        List<String> begie = dogs.stream()
                .filter(dog -> dog instanceof Begie)
                .map(Dog::getNameString)
                .collect(Collectors.toList());
        System.out.print("\nBegie in the cage! ");
        System.out.println("It's " + begie);
    }
    
    

//    public void listHusky(){
//        System.out.print("Husky in the cage! ");
//        for(Dog dog : dogs){
//            if(dog instanceof Husky){
//                System.out.println("It's " + dog.getNameString());
//                }else{
//                System.out.println("null");
//            }
//            }
//        }
    
    //Stream API
    public void listHusky(){
        List<String> husky = dogs.stream()
                .filter(dog -> dog instanceof Husky)
                .map(Dog::getNameString)
                .collect(Collectors.toList());
        System.out.println("\nHusky in the cage! ");
        System.out.println("It's " + husky);
    }
    
    
    
//    public void listAlaskanMalamute(){
//        System.out.print("Alaskan in the cage! ");
//        for(Dog dog : dogs){
//            if(dog instanceof AlaskanMalamute){
//                System.out.println("It's " + dog.getNameString());
//            }
//        }
//    }
    
    //Stream API
    public void listAlaskanMalamute(){
        List<String> alaskanmalamute = dogs.stream()
                .filter(dog -> dog instanceof AlaskanMalamute)
                .map(Dog::getNameString)
                .collect(Collectors.toList());
        System.out.print("\nAlaskanMalamute in the cage! ");
        System.out.println("It's " + alaskanmalamute);
    }
 
}
