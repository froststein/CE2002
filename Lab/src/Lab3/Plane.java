package Lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
	private PlaneSeat[] seat;
	private int numEmptySeat;
	public Plane() {
		this.seat=new PlaneSeat[12];
		for(int i=0; i<12;i++) {
			seat[i]=new PlaneSeat(i+1);
		}
		numEmptySeat=12;
	}
	private PlaneSeat[] sortSeats() {
		PlaneSeat[] seatSorted= seat.clone();
		Arrays.sort(seatSorted, new Comparator<PlaneSeat>() {
			public int compare(PlaneSeat p1, PlaneSeat p2) {
				return (p1.getCustomerID() > p2.getCustomerID())? 0 : 1;
			}
		});
		return seatSorted;
	}
	public void showNumEmptySeats() {
		System.out.println(String.format("There are %d empty seats.", numEmptySeat));
	}
	public void showEmptySeats() {
		for(PlaneSeat ps: this.seat) {
			if(!ps.isOccupied()) {
				System.out.println(String.format("SeatID: %d", ps.getSeatID()));
			}
		}
	}
	public void showAssignedSeats(boolean bySeatId) {
		

	}
	public void assignSeat(int seatId,int cust_id) {

	}
	public void unAssignSeat(int seatId) {

	}

}
