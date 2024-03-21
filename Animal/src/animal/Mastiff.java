/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author ADMIN
 */
public class Mastiff extends Dog{
    private String howlString;
    
    public Mastiff(String nameString, int age, double height, double weight, String howlString){
        super(nameString, age, height, weight);
        this.howlString = howlString;
    }

    public String getHowlString() {
        return howlString;
    }

    public void setHowlString(String howlString) {
        this.howlString = howlString;
    }
    
    @Override
    public void bark(){
        System.out.println(howlString);
    }

}
