package Project;

class Room {
    private double roomPrice; 
    private String roomId;
    

    public Room(double roomPrice,String roomId) {
        this.roomPrice = roomPrice;
        this.roomId=roomId;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "Room [roomPrice=" + roomPrice + ", roomId=" + roomId +  "]";
	}

	
	
}
   
