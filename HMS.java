package Project;

public class HMS { // as in hotel management system
    Employee[] employees;
    private Customer[] customers;
    private Reservation[] reservations;
    private Room[] rooms;
    private int employeeCount;
    private int customerCount;
    private int reservationCount;
    private int roomCount;

    public HMS() {
    	
    	/* this hotel only offers 15 employees as a maximum.
    	it also has single rooms only and of one type therefore it has same number of 
    	customers as of reservation.*/
    	
        this.employees = new Employee[15];
        this.customers = new Customer[30];
        this.reservations = new Reservation[30];
        this.rooms = new Room[30];
        this.employeeCount = 0;
        this.customerCount = 0;
        this.reservationCount = 0;
        this.roomCount = 0;
    }

    public void fillEmployees(Employee[] _employees) {
    	for(int i =0;i<_employees.length;i++) {
    		if(_employees[i]!=null) {
    			employees[i]=_employees[i];
    			employeeCount++;
    		}
    	}
    }
    
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Unable to add employee. Employee database is full.");
        }
    }

    
    public Employee findEmployee(String id) {
        for (int i = 0; i < employeeCount; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getEmployeeID().equals(id)) {
                return employee;
            }
        }
        System.out.println("Employee not found.");
        return null;
    }
    
    public Employee[] findEmployeesByFirstName(String fname) {
        Employee[] _employees = new Employee[employeeCount];
        int j = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] != null && employees[i].getFirstName().equalsIgnoreCase(fname)) {
                _employees[j] = employees[i];
                j++;
            }
        }
        return _employees;
    }

    

    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeID().equals(employee.getEmployeeID())) {
                employees[i] = employee;
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    
    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeID().equals(employee.getEmployeeID())) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[employeeCount - 1] = null;
                employeeCount--;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    
    public void addCustomer(Customer customer) {
        if (customerCount < customers.length) {
            customers[customerCount] = customer;
            customerCount++;
            System.out.println("Customer added successfully.");
        } else {
            System.out.println("Cannot add more customers. Maximum limit reached.");
        }
    }

    public Customer findCustomerById(String id) {
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            if (customer != null && customer.getCustomerID().equals(id)) {
                return customer;
            }
        }
        System.out.println("Customer not found.");
        return null;
    }


    public Customer[] findCustomersByFirstName(String fname) {
    	Customer[] _customers = new Customer[customerCount];
    	int j=0;
    	for (int i = 0; i < customerCount; i++) {
            if (customers[i] != null && customers[i].getFirstName().equalsIgnoreCase(fname)) {
            	_customers[j] =customers[i];
            	j++;
            } 
        }
    	return _customers;
    }
    
    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getCustomerID().equals(customer.getCustomerID())) {
                customers[i] = customer;
                System.out.println("Customer updated successfully.");
                return;
            }
        }
        System.out.println("Customer not found.");
    }

public void deleteCustomer(Customer customer) {
    for (int i = 0; i < customerCount; i++) {
        if (customers[i].getCustomerID().equals(customer.getCustomerID())) {
            for (int j = i; j < customerCount - 1; j++) {
                customers[j] = customers[j + 1];
            }
            customers[customerCount - 1] = null;
            customerCount--;
            System.out.println("Customer deleted successfully.");
            return;
        }
    }
    System.out.println("Customer not found.");
}
public void addReservation(Reservation reservation) {
    if (reservationCount < reservations.length) {
        reservations[reservationCount] = reservation;
        reservationCount++;
        System.out.println("reservation added successfully.");
    } else {
        System.out.println("Cannot add more reservation. Maximum limit reached.");
    }
}

public Reservation findReservationById(String id) {
    for (int i = 0; i < reservations.length; i++) {
        Reservation reservation = reservations[i];
        if (reservation != null && reservation.getReservationID().equals(id)) {
            return reservation;
        }
    }
    System.out.println("Reservation not found.");
    return null;
}

public void updateReservation(Reservation reservation) {
    for (int i = 0; i < reservationCount; i++) {
        if (reservations[i].getReservationID().equals(reservation.getReservationID())) {
            reservations[i] = reservation;
            System.out.println("Reservation updated successfully.");
            return;
        } 
    }
    System.out.println("Reservation not found.");
}

public void deleteReservation(Reservation reservation) {
    for (int i = 0; i < reservationCount; i++) {
        if (reservations[i].getReservationID().equals(reservation.getReservationID())) {
            for (int j = i; j < reservationCount - 1; j++) {
                reservations[j] = reservations[j + 1];
            }
            reservations[reservationCount - 1] = null;
            reservationCount--;
            System.out.println("Reservation deleted successfully.");
            return;
        }
    }
    System.out.println("Reservation not found.");
}
public Room findRoomById(String id) {
    for (int i = 0; i < rooms.length; i++) {
        Room room = rooms[i];
        if (room != null && room.getRoomId().equals(id)) {
            return room;
        }
    }
    System.out.println("Room not found.");
    return null;
}
public void addRoom(Room room) {
    if (roomCount < rooms.length) {
        rooms[roomCount] = room;
        roomCount++;
        System.out.println("Room added successfully.");
    } else {
        System.out.println("Cannot add more rooms. Maximum limit reached.");
    }
}




}