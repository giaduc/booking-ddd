package domain;

import java.util.Date;

public class Booking {

	private int bookingId;
	private Guest guest;
	private Room room;
	private Date start;
	private Date end;
	private Date bookedAt;

	public Booking(int bookingId, Guest guest, Room room, Date start, Date end, Date bookedAt) {
		super();
		this.bookingId = bookingId;
		this.guest = guest;
		this.room = room;
		this.start = start;
		this.end = end;
		this.bookedAt = bookedAt;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getBookedAt() {
		return bookedAt;
	}

	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}

}
