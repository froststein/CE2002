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
			@Override
			public int compare(PlaneSeat o1, PlaneSeat o2) {
				return o1.getCustomerID()- o2.getCustomerID();
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
		if(bySeatId) {
			for(PlaneSeat ps: this.seat) {
				if(ps.isOccupied()) {
					System.out.println(String.format("SeatID %d assigned to CustomerID %d", ps.getSeatID(),ps.getCustomerID()));
				}
			}
		}else {
			for(PlaneSeat ps: this.sortSeats()) {
				if(ps.isOccupied()) {
					System.out.println(String.format("SeatID %d assigned to CustomerID %d", ps.getSeatID(),ps.getCustomerID()));
				}
			}
		}
	}
	
	public void assignSeat(int seatId,int cust_id) {
		if(this.seat[seatId-1].isOccupied()) {
			System.out.println("Seat already assigned to customer");
		}else {
			this.seat[seatId-1].assign(cust_id);
			numEmptySeat--;
			System.out.println("Seat assigned!");
		}
	}
	
	public void unAssignSeat(int seatId) {
		if(this.seat[seatId-1].isOccupied()) {
			this.seat[seatId-1].unAssign();
			numEmptySeat++;
			System.out.println("Seat unassigned!");
		}else {
			System.out.println("Seat was never assigned!");
		}
		
	}

}
