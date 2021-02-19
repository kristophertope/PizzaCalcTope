package model;

/**
 * Kristopher Tope - kmtope@dmacc.edu
 * 202102 CIS175 22624
 * Feb 18, 2021
 */

public class SodaLogic {

	private int guests;
	private int numSodas;
	
	public SodaLogic() {
		// TODO Auto-generated constructor stub
	}

	public SodaLogic(int guests) {
		this.guests = guests;
		setNumSodas(guests);
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public int getNumSodas() {
		return numSodas;
	}

	public void setNumSodas(int guests) {
		numSodas = Math.round(guests / 8);
		if (guests % 8 != 0) numSodas++;
	}

	@Override
	public String toString() {
		return "SodaLogic [guests=" + guests + ", numSodas=" + numSodas + "]";
	}
	
}
