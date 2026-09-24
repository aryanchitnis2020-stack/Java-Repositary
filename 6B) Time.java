package info.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Time {
    int hr, min, sec;

    Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    Time(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    void display() {
        System.out.println(hr + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(10, 30, 45);

        System.out.print("Default Time: ");
        t1.display();

        System.out.print("Parameterized Time: ");
        t2.display();

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date and Time: "
            + now.format(formatter));
    }
}



	
		// TODO Auto-generated method stub

	


