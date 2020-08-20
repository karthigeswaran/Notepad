package Notepad;

import java.util.Scanner;
//import java.io.File;
import java.io.FileWriter;
import java.lang.Thread;

public class Notepad_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Notepad Application(only '.txt') ");
        menu: do {
            System.out.println("Options:");
            System.out.println("1.New file");
            System.out.println("2.Browse Directory");
            System.out.println("3.Exit");
            System.out.print("Enter option number: ");
            int opt = scan.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter content of file: ");
                    String content = scan.next();
                    System.out.println("Would you like to save(y/n): ");
                    String c = scan.next();
                    if(c=="y"){
                        System.out.println("Enter file name:");
                        String name = scan.next();
                        FileWriter fw = null;
                        try {
                            fw = new FileWriter(name+".txt");
                            fw.write(content);
                            fw.close();
                        } catch (Exception e) {
                            System.out.println("Error: File missing");
                        }
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }                    
                    break;
                case 2:
                    
                case 3:
                    break menu; 
                default:
                    System.out.println("Unknown option");
            }
        }while(true);
        scan.close();
    }
}