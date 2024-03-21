/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ADMIN
 */
public class Begie extends Dog{
    public Begie(String nameString, int age, double height, double weight){
        super(nameString, age, height, weight);
    }
    
    @Override
    public void bark(){
        System.out.println("Gau gau");
    }
    
}
