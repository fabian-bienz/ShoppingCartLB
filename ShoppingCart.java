package ShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<IBuyable> shoppingCart;
	
	public ShoppingCart() {
		shoppingCart = new ArrayList<IBuyable>();
	}
	
	/**
	 * Add a produce to the shopping-cart
	 * @param iBuyable of type IBuyable
	 */
	public void addToCart(IBuyable iBuyable) {shoppingCart.add(iBuyable);}
	
	
	/**
	 * Returns the sum-prize of all produce in the shopping-cart
	 * @return prize
	 */
	public double getPrize() {
		
		double prize = 0.0;
		
		for(IBuyable iBuyable : shoppingCart) {
			prize += iBuyable.Prize();
		}
		
		return prize;
	}
	
	
}
