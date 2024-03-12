/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_1;

import java.util.UUID;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String idString;
    private String nameString;
    private String birthString;
    private boolean gender;
    
    public Student(){
        
    }
    
    public Student(String idString, String nameString, String birthString, boolean gender){
        this.idString=UUID.randomUUID().toString();
        this.nameString=nameString;
        this.birthString=birthString;
        this.gender=gender;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getBirthString() {
        return birthString;
    }

    public void setBirthString(String birthString) {
        this.birthString = birthString;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "ID: " + UUID.randomUUID().toString() + ", Ho ten: " + nameString + ", Ngay Thang Nam Sinh: " + birthString + ", Gioi tinh: " + (gender ? "Nam" : "Nu");    
    }
}
