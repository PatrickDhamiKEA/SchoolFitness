import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    ArrayList<String> personsList = new ArrayList<>();
    ArrayList<String> employeesList = new ArrayList<>();
    ArrayList<String> membersList = new ArrayList<>();

    public void viewPersons() {
        File personsFile = new File("C:/Users/Patrick/Desktop/Fitness/src/tekstfiles/persons.txt");

        try (Scanner scanner = new Scanner(personsFile)) {
            while (scanner.hasNextLine()) {
                personsList.add(scanner.nextLine());
            }
            System.out.println(personsList.toString().replaceAll(",", "\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        File employeesFile = new File("C:/Users/Patrick/Desktop/Fitness/src/tekstfiles/employees.txt");

        try (Scanner scanner = new Scanner(employeesFile)) {
            while (scanner.hasNextLine()) {

                employeesList.add(scanner.nextLine());
            }
            System.out.println(employeesList.toString().replaceAll(",", "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewMembers() {
        File membersFile = new File("C:/Users/Patrick/Desktop/Fitness/src/tekstfiles/members.txt");

        try (Scanner scanner = new Scanner(membersFile)) {
            while (scanner.hasNextLine()) {

                membersList.add(scanner.nextLine());
            }
            System.out.println(membersList.toString().replaceAll(",", "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}