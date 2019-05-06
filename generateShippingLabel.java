public class generateShippingLabel implements Runnable {

	private Order order;
	
	public generateShippingLabel(Order order) {
		this.order = order;
	}
	
	@Override
	public void run() {
		try {
			ShippingService shippingService = new ShippingService();
	        ShippingLabel slabel = shippingService.getShippingLabel(order.getCustomerName(), order.getCustomerAddress(), order.getPoundsOfHoney());
	        System.out.printf("%s%n", slabel);
	        Thread.sleep(5000);
		} catch(InterruptedException e){}
	}

}