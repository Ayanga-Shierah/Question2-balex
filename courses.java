/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balex;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class courses {
 public static void main(String[] args) {
        // Declare course details
        String[] courseIDs = {"BSE", "BIT", "BCS", "BCE"};
        String[] courseNames = {"Software Engineering", "Information Technology", "Computer Science", "Computer Engineering"};
        int[] tuitions = {900000, 750000, 800000, 950000};

        // Prompt the user to enter a CourseID
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CourseID: ");
        String courseID = input.nextLine().toUpperCase();

        // Find and display course details or show error message
        boolean found = false;
        for (int i = 0; i < courseIDs.length; i++) {
            if (courseIDs[i].equals(courseID)) {
                System.out.println("Course Name: " + courseNames[i]);
                System.out.println("Tuition: " + tuitions[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong CourseID details");
        }

        input.close();
    }
}   

