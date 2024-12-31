package Project;


public class Reservation implements Billing {
    private String reservationID;
    private Customer customer;
    private Room room;
    private int checkInDate;
    private int checkOutDate;

    public Reservation(String reservationID, Customer customer, Room room, int checkInDate, int checkOutDate) {
        this.reservationID = reservationID;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and setters
    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(int checkInDate) {
        this.checkInDate = checkInDate;
    }

    public int getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(int checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    
    public int getNumberOfNights() {
        if(checkInDate<checkOutDate) {
        	return checkOutDate-checkInDate;
        }
        else if(checkInDate>checkOutDate) {
        	return checkInDate-checkOutDate;
        }
        	else return 1;
    }

    
    public double calculateTotalPrice(double Roomprice,int checkInDate, int checkOutDate) {
    	Roomprice=room.getRoomPrice();
    	  if(checkInDate<checkOutDate) {
          	return Roomprice*(checkOutDate-checkInDate);
          }
          else if(checkInDate>checkOutDate) {
          	return Roomprice*(checkInDate-checkOutDate);
          }
          	else return room.getRoomPrice();
      }

	public String toString() {
		double total;
		double Roomprice=room.getRoomPrice();
  	  if(checkInDate<checkOutDate) {
        	total= Roomprice*(checkOutDate-checkInDate);
        }
        else if(checkInDate>checkOutDate) {
        	total= Roomprice*(checkInDate-checkOutDate);
        }
        	else total= room.getRoomPrice();
    
		return "Reservation [reservationID=" + reservationID + ", customer=" + customer + ", room=" + room
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + "total price is: "+total+"]";
	}

}