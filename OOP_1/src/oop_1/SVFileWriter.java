/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_1;

import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SVFileWriter {
    private List<Student> students;
    
    public SVFileWriter(List<Student> students){
        this.students = students;
    }
    
    public void writeToFile(Scanner sc){
        int n = 0;
        if(n>=3 && n<=40){
            System.out.println("Nhap ten file: ");
            String fileName = sc.nextLine();
            try(FileWriter writer = new FileWriter(fileName)){
                for(Student student :  students){
                    writer.write(student.toString() + "\n");
                }writer.flush();
                System.out.println("Ghi file thanh cong!");
            }catch (Exception e) {
                System.out.println("Ghi file bi loi!" + e.getMessage());
            }
        }
    }
}
