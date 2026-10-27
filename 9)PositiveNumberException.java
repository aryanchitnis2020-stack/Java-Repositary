package Student;


import java.io.*;
import java.util.*;

public class PositiveNumberException {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextInt()) {
                int num = sc.nextInt();

                if (num > 0) {
                    throw new Exception(
                        "Positive number found: " + num
                    );
                }

                System.out.println("Number: " + num);
            }

            sc.close();
            System.out.println("No positive numbers found.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}




	
		// TODO Auto-generated method stub

	


