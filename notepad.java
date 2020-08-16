package Notepad;

import java.util.Scanner;

public class Notepad {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("  Notepad Application(only .txt) ");
        menu:do{
            System.out.println("Options:");
            System.out.println("1.New file");
            System.out.println("2.Browse Directory");
            System.out.print("Enter option number: ");
            int opt = scan.nextInt();
            switch(opt){
                case 1:
                    System.out.print("Enter filename: ");
                    String name = scan.nextLine();
                    File file = new File(name);
                    System.out.print("Enter content for the file:");
                    String content = scan.nextLine();
                    System.out.print("Would you like to save and exit(y/n): ");
                    char sav = scan.next().toCharArray()[0];
                    switch(sav){
                        case 'y':
                        file.writeContent(content);
                        System.out.print("");
                    }

            }
        }while(true)
    }
}