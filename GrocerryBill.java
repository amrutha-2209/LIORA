package day7;

public class GrocerryBill {

	public static void main(String[] args) {
		 String item = "Rice";
	        int quantity = 10;
	        double price = 60.0;
	        int member = 1; 

	        double subtotal = quantity * price;

	        double discount = 0;
	        if (member == 1) {
	            discount = subtotal * 0.10;
	        }

	        double afterDiscount = subtotal - discount;

	        double gst;
	        if (afterDiscount > 500) {
	            gst = afterDiscount * 0.05;
	        } else {
	            gst = afterDiscount * 0.12;
	        }

	        double total = afterDiscount + gst;

	        System.out.println("Item: " + item);
	        System.out.println("Subtotal: Rs " + subtotal);
	        System.out.println("Discount: Rs " + discount);
	        System.out.println("GST: Rs " + gst);
	        System.out.println("Final Total: Rs " + total);
	}

}
