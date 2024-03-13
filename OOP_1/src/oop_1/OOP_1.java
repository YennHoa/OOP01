/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author ADMIN
 */
public class OOP_1 {

    /**
     * @param args the command line arguments
     */
    public static List<Student> students = new ArrayList<>();
    
    private static void nhapSV(Scanner sc){
        System.out.println("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        if(n>=3 && n<=40){
            for(int i=0; i<n; i++){
                System.out.println("Nhap thong tin sinh vien:");
                
                System.out.println("ID: "+UUID.randomUUID().toString()); 
                
                System.out.print("Ho ten: ");
                String nameString = sc.nextLine();
                
                System.out.print("Ngay thang nam sinh: ");
                String birthString = sc.nextLine();
                
                System.out.print("Gioi tinh: ");
                boolean gender = sc.nextBoolean();
                sc.nextLine();
                
                students.add(new Student(UUID.randomUUID().toString(),nameString, birthString, gender));
            }
        }else{
            System.out.println("So luong k hop le!");
        }
    }
    
    private static void inSV(){
        for(Student student : students){
            System.out.println("\nThong tin sinh vien: ");
            System.out.println(student);
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        nhapSV(sc);
        inSV();
        SVFileWriter fileWriter = new SVFileWriter(students);
        fileWriter.writeToFile(sc);
        sc.close();
    }
    
}
