package Project;

import java.io.FileWriter;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class Test {

	public static void main(String[] args) throws IOException {
		HMS hms = new HMS();
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		hms.fillEmployees(ReadCSV());

		while (choice != 0) {
			System.out.println("Select an option:");
			System.out.println("1. Add employee");
			System.out.println("2. Find employee");
			System.out.println("3. Update employee");
			System.out.println("4. Delete employee");
			System.out.println("5. Add customer");
			System.out.println("6. Find customer");
			System.out.println("7. Update customer");
			System.out.println("8. Delete customer");
			System.out.println("9. Add room");
			System.out.println("10. Add reservation");
			System.out.println("11. Find reservation");
			System.out.println("12. Update reservation");
			System.out.println("13. Delete reservation");
			System.out.println("14. retrieve customer");
			System.out.println("15. retrieve employee");
			System.out.println("0. Exit");

			choice = scanner.nextInt();
			scanner.nextLine(); 
			switch (choice) {
			case 1:

				System.out.println("Enter employee details:");
				System.out.print("First name: ");
				String Efname = scanner.nextLine();
				System.out.print("Last name: ");
				String Elname = scanner.nextLine();

				System.out.print("Employee phone: ");
				int Ephone = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Employee ID: ");
				String Eid = scanner.nextLine();
				System.out.print("Salary: ");
				double Esalary = scanner.nextDouble();

				Employee employee = new Employee(Efname, Elname, Ephone, Eid, Esalary);
				hms.addEmployee(employee);
				WriteCSV(employee);
				break;
			case 2:
				System.out.print("Enter employee ID: ");
				String employeeID = scanner.nextLine();
				Employee foundEmployee = hms.findEmployee(employeeID);
				if (foundEmployee != null) {
					System.out.println("Employee found: " + foundEmployee.toString());
				}
				break;
			case 3:
				System.out.print("Enter employee ID to update: ");
				String employeeIDToUpdate = scanner.nextLine();
				Employee employeeToUpdate = hms.findEmployee(employeeIDToUpdate);
				if (employeeToUpdate != null) {
					System.out.println("Enter new employee details:");
					System.out.print("first Name: ");
					employeeToUpdate.setFirstName(scanner.nextLine());
					System.out.print("last Name: ");
					employeeToUpdate.setLastName(scanner.nextLine());
					System.out.print("phone: ");
					employeeToUpdate.setPhone(scanner.nextInt());
					scanner.nextLine();
					System.out.print("ID: ");
					employeeToUpdate.setEmployeeID(scanner.nextLine());
					System.out.print("salary: ");
					employeeToUpdate.setSalary(scanner.nextDouble());
					hms.updateEmployee(employeeToUpdate);
				}

				break;
			case 4:
				System.out.print("Enter employee ID to delete: ");
				String employeeIDToDelete = scanner.nextLine();
				Employee employeeToDelete = hms.findEmployee(employeeIDToDelete);
				if (employeeToDelete != null) {
					hms.deleteEmployee(employeeToDelete);
				}

				break;
			case 5:

				System.out.println("Enter customer details:");
				System.out.print("First name: ");
				String Cfname = scanner.next();
				System.out.print("Last name: ");
				String Clname = scanner.next();
				System.out.print("Customer phone: ");
				int Cphone = scanner.nextInt();
				System.out.print("Customer ID: ");
				String Cid = scanner.next();
				Customer customer = new Customer(Cfname, Clname, Cphone, Cid);
				hms.addCustomer(customer);
				break;

			case 6:
				System.out.print("Enter customer ID: ");
				String customerID = scanner.nextLine();
				Customer foundCustomer = hms.findCustomerById(customerID);
				if (foundCustomer != null) {
					System.out.println("Customer found: " + foundCustomer.toString());
				}
				break;

			case 7:
				System.out.print("Enter customer ID to update: ");
				String customerIDToUpdate = scanner.nextLine();
				Customer customerToUpdate = hms.findCustomerById(customerIDToUpdate);
				if (customerToUpdate != null) {
					System.out.println("Enter new customer details:");
					System.out.print("First Name: ");
					customerToUpdate.setFirstName(scanner.nextLine());
					System.out.print("Last Name: ");
					customerToUpdate.setLastName(scanner.nextLine());
					System.out.print("Phone: ");
					customerToUpdate.setPhone(scanner.nextInt());
					scanner.nextLine(); // Clear the newline character
					System.out.print("ID: ");
					customerToUpdate.setCustomerID(scanner.nextLine());
					hms.updateCustomer(customerToUpdate);
				}

				break;

			case 8:
				System.out.print("Enter customer ID to delete: ");
				String customerIDToDelete = scanner.nextLine();
				Customer customerToDelete = hms.findCustomerById(customerIDToDelete);
				if (customerToDelete != null) {
					hms.deleteCustomer(customerToDelete);
				}
				break;
			case 9:
				System.out.println("enter room price");
				double roomprice = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("enter room id");
				String roomid = scanner.nextLine();
				Room room = new Room(roomprice, roomid);
				hms.addRoom(room);
				break;

			case 10:

				System.out.println("Enter reservation details:");
				System.out.print("Reservation ID: ");
				String RId = scanner.nextLine();
				System.out.print("Check-in date: ");
				int Checkin = scanner.nextInt();
				System.out.print("Check-out date: ");
				int Checkout = scanner.nextInt();
				System.out.print("Customer ID: ");
				String customerID1 = scanner.next();
				Customer foundCustomer1 = hms.findCustomerById(customerID1);
				System.out.println("Enter room id");
				String roomid1 = scanner.next();
				Room room1 = hms.findRoomById(roomid1);
				Reservation reservation = new Reservation(RId, foundCustomer1, room1, Checkin, Checkout);
				hms.addReservation(reservation);
				break;

			case 11:
				System.out.print("Enter reservation ID: ");
				String reservationID = scanner.nextLine();
				Reservation foundReservation = hms.findReservationById(reservationID);
				if (foundReservation != null) {
					System.out.println("Reservation found: " + foundReservation.toString());
				}

				break;
			case 12:
				System.out.print("Enter reservation ID to update: ");
				String reservationIDToUpdate = scanner.nextLine();
				Reservation reservationToUpdate = hms.findReservationById(reservationIDToUpdate);
				if (reservationToUpdate != null) {
					System.out.println("Enter new reservation details:");
					System.out.print("Reservation ID: ");
					reservationToUpdate.setReservationID(reservationIDToUpdate);
					System.out.print("Check-in date: ");
					reservationToUpdate.setCheckInDate(scanner.nextInt());
					System.out.print("Check-out date: ");
					reservationToUpdate.setCheckOutDate(scanner.nextInt());
					hms.updateReservation(reservationToUpdate);

				}
				break;
			case 13:
				System.out.print("Enter reservation ID to delete: ");
				String reservationIDToDelete = scanner.nextLine();
				Reservation reservationToDelete = hms.findReservationById(reservationIDToDelete);
				if (reservationToDelete != null) {
					hms.deleteReservation(reservationToDelete);
				}

				break;
			case 14:
				System.out.println("Enter customer first name:");
				String fname = scanner.nextLine();
				Customer[] foundCustomers = hms.findCustomersByFirstName(fname);
				for (int i = 0; i < foundCustomers.length; i++) {
					if (foundCustomers[i] != null) {
						System.out.println(foundCustomers[i].toString());

					}
				}
				break;
			case 15:
				System.out.println("Enter employee first name:");
				String firstname = scanner.nextLine();
				Employee[] foundEmployees = hms.findEmployeesByFirstName(firstname);
				for (int i = 0; i < foundEmployees.length; i++) {
					if (foundEmployees[i] != null) {
						System.out.println(foundEmployees[i].toString());

					}
				}
				break;
			case 0:
				
				System.out.println("Exiting HMS. Thank you!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}

		scanner.close();

	}

	public static void WriteCSV(Employee employee) throws IOException {
		File csvFile = new File("Employees.csv");
		FileWriter fileWriter = new FileWriter(csvFile, true);
		if (employee != null) {
			String employeeData = employee.toStringData();
			fileWriter.write(employeeData);
		}
		fileWriter.close();
	}
	
	public static Employee[] ReadCSV() throws IOException {
		Employee[] employees = new Employee[30];
		BufferedReader br = new BufferedReader(new FileReader("Employees.csv"));
		String line = null;
		int i = 0;
		while ((line = br.readLine()) != null)   {
			String[] values = line.split(",");
			String Id = values[0];
			String Fname = values[1];
			String Lname = values[2];
			int Phone = Integer.parseInt(values[3]);
			double Salary = Double.parseDouble(values[4]);
			
			Employee e = new Employee(Fname,Lname,Phone,Id,Salary);
			employees[i] = e;
			i++;
		}
		return employees;
	}

}
