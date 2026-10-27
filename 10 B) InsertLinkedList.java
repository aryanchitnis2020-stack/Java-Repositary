package info.java;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original LinkedList: " + list);

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (1 to " + (list.size() + 1) + "): ");
        int position = sc.nextInt();

        if (position >= 1 && position <= list.size() + 1) {
            list.add(position - 1, element);
            System.out.println("Updated LinkedList: " + list);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}




	
		// TODO Auto-generated method stub

	


