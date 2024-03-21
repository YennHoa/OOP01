/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ADMIN
 */
public abstract class Dog {
    protected String nameString;
    protected int age;
    protected double height;
    protected double weight;
    
    public abstract void bark();
    
    public Dog(){
        
    }
    
    public Dog(String nameString, int age, double height, double weight){
        this.nameString =  nameString;
        this.age =  age;
        this.height = height;
        this.weight = weight;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
  
}
