package department;

import java.util.*;

public class Department {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        boolean exitProgram = false;
        while (true) {
            System.out.println("\nAre you processing a (P)erson or an "
                    + "(E)mployee? Q to (Q)uit.");
            String option = in.next();
            switch (option.toLowerCase()) {
                case "p":
                    System.out.println("\nYou chose person.\n");
                    System.out.println("Would you like to (A)dd, (R)emove "
                            + "or (C)hange an entry?");
                    option = in.next();
                    switch (option.toLowerCase()) {
                        case "a":
                            System.out.println("\nYou chose Add.\n");
                            Person p1 = new Person();
                            System.out.print("Enter First Name: ");
                            p1.firstName = in.next();
                            System.out.print("Enter Last Name: ");
                            p1.lastName = in.next();
                            System.out.print("Enter SSN: ");
                            p1.ssNum = in.nextInt();
                            System.out.print("Enter Date of Birth: ");
                            p1.dateBirth = in.next();
                            p1.fullName = p1.firstName + " " + p1.lastName;
                            persons.add(p1);
                            System.out.println("\nEntry added!");
                            break;
                        case "r":
                            System.out.println("\nYou chose Remove.\n");
                            System.out.println("List of Current People");
                            System.out.println("----------------------");
                            for (int i = 0; i < persons.size(); i++) {
                                System.out.println(persons.get(i).fullName);
                            }
                            if (persons.isEmpty())
                            {
                                System.out.println("There are currently no "
                                        + "people added.");
                                System.out.println("----------------------");
                                break;
                            }
                            System.out.println("----------------------");
                            System.out.println("\nType in the persons name"
                                    + " from the list that you want removed.");
                            in.nextLine();
                            String name = in.nextLine().toLowerCase();
                            for (int i = 0; i < persons.size(); i++) {
                                if (name.equals(persons.get(i).
                                        fullName.toLowerCase()))
                                {
                                    persons.remove(i);
                                    System.out.println("\nEntry removed!");
                                }
                            }
                            break;
                        case "c":
                            System.out.println("\nYou chose Change.\n");
                            System.out.println("List of Current People");
                            System.out.println("----------------------");
                            for (int i = 0; i < persons.size(); i++) {
                                System.out.println(persons.get(i).fullName);
                            }
                            if (persons.isEmpty())
                            {
                                System.out.println("\nThere are currently no "
                                        + "people added.");
                                System.out.println("----------------------");
                                break;
                            }
                            System.out.println("----------------------");
                            System.out.println("\nType in the persons name"
                                    + " from the list that you want to edit.");
                            in.nextLine();
                            name = in.nextLine().toLowerCase();
                            System.out.println("\nCurrent Information on " +
                                    name);
                            for (int i = 0; i < persons.size(); i++) {
                                if (name.equals(persons.get(i).
                                        fullName.toLowerCase()))
                                {
                                    System.out.println("---------------------");
                                    System.out.println("First Name: " +
                                            persons.get(i).firstName);
                                    System.out.println("Last Name: " +
                                            persons.get(i).lastName);
                                    System.out.println("SSN: " + 
                                            persons.get(i).ssNum);
                                    System.out.println("Date of Birth: " +
                                            persons.get(i).dateBirth);
                                    System.out.println("---------------------");
                                    System.out.print("Enter New First Name: ");
                                    persons.get(i).firstName = in.next();
                                    System.out.print("Enter New Last Name: ");
                                    persons.get(i).lastName = in.next();
                                    System.out.print("Enter New SSN: ");
                                    persons.get(i).ssNum = in.nextInt();
                                    System.out.print("Enter New "
                                            + "Date of Birth: ");
                                    persons.get(i).dateBirth = in.next();
                                    persons.get(i).fullName = 
                                            persons.get(i).firstName + " "
                                            + persons.get(i).lastName;
                                    System.out.println("\nEntry changed!");
                                }
                            }
                            break;
                        default :
                            break;
                    }
                    break;
                case "e":
                    System.out.println("\nYou chose employee.\n");
                    System.out.println("Would you like to (A)dd, (R)emove "
                            + "or (C)hange an entry?");
                    option = in.next();
                    switch (option.toLowerCase()) {
                        case "a":
                            System.out.println("\nYou chose Add.\n");
                            Employee e1 = new Employee();
                            System.out.print("Enter Employee ID#: ");
                            e1.employeeID = in.nextInt();
                            System.out.print("Enter Department: ");
                            in.nextLine();
                            e1.department = in.nextLine();
                            System.out.print("Enter Manager ID#: ");
                            e1.manager = in.nextInt();
                            System.out.print("Enter Position ID#: ");
                            e1.positionID = in.nextInt();
                            System.out.print("Enter Pay Rate: $");
                            e1.payRate = in.nextDouble();
                            employees.add(e1);
                            System.out.println("\nEntry added!");
                            break;
                        case "r":
                            System.out.println("\nYou chose Remove.\n");
                            System.out.println("List of Current Employees");
                            System.out.println("-------------------------");
                            for (int i = 0; i < employees.size(); i++) {
                                System.out.println(employees.get(i).employeeID);
                            }
                            if (employees.isEmpty())
                            {
                                System.out.println("There are currently no "
                                        + "employees added.");
                                System.out.println("----------------------");
                                break;
                            }
                            System.out.println("-------------------------");
                            System.out.println("\nType in the ID# from the "
                                    + "list that you want removed.\n");
                            int idNum = in.nextInt();
                            for (int i = 0; i < employees.size(); i++) {
                                if (idNum == employees.get(i).employeeID)
                                {
                                    employees.remove(i);
                                    System.out.println("\nEntry removed!");
                                }
                            }
                            break;
                        case "c":
                            System.out.println("You chose Change.");
                            System.out.println("List of Current Employees");
                            System.out.println("----------------------");
                            for (int i = 0; i < employees.size(); i++) {
                                System.out.println(employees.get(i).employeeID);
                            }
                            if (employees.isEmpty())
                            {
                                System.out.println("There are currently no "
                                        + "employees added.");
                                System.out.println("----------------------");
                                break;
                            }
                            System.out.println("----------------------");
                            System.out.println("\nType in the ID# from the "
                                    + "list that you want to edit.\n");
                            idNum = in.nextInt();
                            System.out.println("\nCurrent Information on " +
                                    "Employee ID# " + idNum);
                            for (int i = 0; i < employees.size(); i++) {
                                if (idNum == employees.get(i).employeeID)
                                {
                                    System.out.println("---------------------");
                                    System.out.println("Employee ID#: " +
                                            employees.get(i).employeeID);
                                    System.out.println("Department: " +
                                            employees.get(i).department);
                                    System.out.println("Manager ID#: " +
                                            employees.get(i).manager);
                                    System.out.println("Position ID#: " +
                                            employees.get(i).positionID);
                                    System.out.println("Pay Rate: $" +
                                            employees.get(i).payRate);
                                    System.out.println("---------------------");
                                    System.out.print("Enter New "
                                            + "Employee ID#: ");
                                    employees.get(i).employeeID = in.nextInt();
                                    System.out.print("Enter New Department: ");
                                    in.nextLine();
                                    employees.get(i).department = in.nextLine();
                                    System.out.print("Enter New Manager ID#: ");
                                    employees.get(i).manager = in.nextInt();
                                    System.out.print("Enter New "
                                            + "Position ID#: ");
                                    employees.get(i).positionID = in.nextInt();
                                    System.out.print("Enter New Pay Rate: $");
                                    employees.get(i).payRate = in.nextDouble();
                                    System.out.println("\nEntry changed!");
                                }
                            }
                            break;
                        default :
                            break;
                    }
                    break;
                case "q":
                    System.out.println("\nClosing program.");
                    exitProgram = true;
                    System.exit(0);
                default:
                    System.out.println("\nInvalid option. "
                            + "Please choose P for Person, E for Employee "
                            + "or Q to Quit the program.");
                    break;
            }
        }
        }
}
