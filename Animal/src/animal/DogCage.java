/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import animal.Husky;
import java.util.ArrayList;
import java.util.List;

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
            System.out.println("Can't add " + dog.getNameString() + ". Cage is full!");
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
    
    public double getTotalWeight(){
        double totalWeight = 0;
        for(Dog dog : dogs){
            totalWeight = totalWeight + dog.getWeight();
        }
        return totalWeight;
    }
    
    public void listPitbull(){
        System.out.print("\nPitbull in the cage! ");
        for(Dog dog : dogs){
            if(dog instanceof PitBull){
                System.out.println("It's " + dog.getNameString());
            }
        }
    }
    
    public void listChihuahua(){
        System.out.print("Chihuahua in the cage! ");
        for(Dog dog :dogs){
            if(dog instanceof Chihuahua){
                System.out.println("It's " + dog.getNameString());
            }
        }   
    }
    
    public void listBegie(){
        System.out.print("Begie in the cage! ");
        for(Dog dog : dogs){
            if(dog instanceof Begie){
                System.out.println("It's " + dog.getNameString());
            }
        }
    }
    
    public void listHusky(){
        System.out.print("Husky in the cage! ");
        for(Dog dog : dogs){
            if(dog instanceof Husky){
                System.out.println("It's " + dog.getNameString());
                }else{
                System.out.println("null");
            }
            }
        }
    
    public void listAlaskanMalamute(){
        System.out.print("Alaskan in the cage! ");
        for(Dog dog : dogs){
            if(dog instanceof AlaskanMalamute){
                System.out.println("It's " + dog.getNameString());
            }
        }
    }
 
}
