/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        DogCage dogcage = new DogCage(100);
        
        System.out.println("Adding dogs to the cage");
        PitBull pitBull = new PitBull("Lex", 3, 50, 30);
        Begie begie = new Begie("Rux", 1, 60, 20);
        Chihuahua chihuahua = new Chihuahua("Si", 1, 40, 15);
        AlaskanMalamute alaskanMalamute = new AlaskanMalamute("Chic", 4, 80, 30);
        Husky husky = new Husky("Tan", 2, 50, 30);
        
        dogcage.addDog(new PitBull("Lex", 3, 50, 30));
        dogcage.addDog(new Begie("Rux", 1, 60, 20));
        dogcage.addDog(new Chihuahua("Si", 1, 40, 15));
        dogcage.addDog(new AlaskanMalamute("Chic", 4, 80, 30));
        dogcage.addDog(new Husky("Tan", 2, 50, 30));
        
        dogcage.listPitbull();
        dogcage.listBegie();
        dogcage.listChihuahua();
        dogcage.listAlaskanMalamute();
        dogcage.listHusky();
        
        System.out.println("\n Total weight: " + dogcage.getTotalWeight() + " kg!");
        
        System.out.println("Throwing squirrel to the cage");
        dogcage.throwSquirrel();
        
        System.out.println("\nRemoving a dog from the cage");
        dogcage.removeDog(begie);
        
        System.out.print("\nList of Pitbull in the cage: ");
        dogcage.listPitbull();
        
        System.out.print("\nList of Chihuahua in the cage: ");
        dogcage.listChihuahua();
        
        System.out.print("\nList of Begie in the cage: ");
        dogcage.listBegie();
        
        System.out.print("\nList of Husky in the cage: ");
        dogcage.listHusky();
        
        System.out.print("\nList of Alaska Malamute in the cage: ");
        dogcage.listAlaskanMalamute();
        
        scanner.close();
        
       
    }
    
}
