package domain;

public class Room {

	private int roomId;
	private String roomType;
	private RoomStatus roomStatus;

	public Room() {
		super();
	}

	public Room(int roomId, String roomType, RoomStatus roomStatus) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomStatus = roomStatus;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

}
