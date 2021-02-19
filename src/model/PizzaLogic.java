package model;

/**
 * Kristopher Tope - kmtope@dmacc.edu
 * 202102 CIS175 22624
 * Feb 18, 2021
 */

public class PizzaLogic {

	private int guests;
	private int numPizzas;
	
	public PizzaLogic() {
		// TODO Auto-generated constructor stub
	}

	public PizzaLogic(int guests) {
		this.guests = guests;
		setNumPizzas(guests);
	}
	
	
	
	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public int getNumPizzas() {
		return numPizzas;
	}

	
	public void setNumPizzas(int guests) {
		numPizzas = Math.round(guests / 3);
		if (guests % 3 != 0) numPizzas++;
	}

	@Override
	public String toString() {
		return "PizzaLogic [guests=" + guests + ", numPizzas=" + numPizzas + "]";
	}
	
	
	
}
