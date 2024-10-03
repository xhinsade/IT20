
package Linkedlist_String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        // Adding initial songs
        list.add("Agora Hills");
        list.add("Fantasize");
        list.add("Sining");
        list.add("Sugar");
        list.add("Lil Kasalanan");
        list.add("Walang Alam");
        boolean running = true;
        while (running) {
            System.out.println("\nCurrent Music List:");
            System.out.println("----------------------------");
            list.ShowList();

            System.out.println("----------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Add a song");
            System.out.println("2. Delete a song");
            System.out.println("3. Move or Swap a song");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
             switch (choice) {
                case 1:
                    System.out.print("Enter the song title to add: ");
                    String songToAdd = sc.nextLine();
                    list.add(songToAdd);
                    System.out.println("Song added.");
                    break;
             }
        }
    }
}