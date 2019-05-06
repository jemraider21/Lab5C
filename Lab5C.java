/**
 * Name: Mark Quinn
 * Class: CMSY167-001
 * Description:  A good description.
 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab5C {

	//private static int total;

    public static void main(String[] args) {
    	ExecutorService executor = Executors.newFixedThreadPool(5);
    	
    	// Create array of orders, then add them to a list
    	Order order1 = new Order("Mark Quinn", "10901 Little Patuxent Parkway",50);
        Order[] orders = {
        		new Order("Mark Quinn", "10901 Little Patuxent Parkway",50),
        		new Order("Barack Obama", "1600 Pennsylvania Ave", 60),
        		new Order("Jared Morris", "1234 Address Road", 40),
        		new Order("Mother Teresa", "313 Foster St. ", 67),
        		new Order("Mahatma Gandhi", "415 Cedar Road", 54),
        		new Order("Leonardo da Vinci", "8 Indian Spring Ave.", 49)
        };
        List<Order> listOfOrders = Arrays.asList(orders);
        
        // Creating threads to be ran by the program
        generateShippingLabel label1 = new generateShippingLabel(orders[0]);
        generateShippingLabel label2 = new generateShippingLabel(orders[1]);
        generateShippingLabel label3 = new generateShippingLabel(orders[2]);
        generateShippingLabel label4 = new generateShippingLabel(orders[3]);
        generateShippingLabel label5 = new generateShippingLabel(orders[4]);
        generateShippingLabel label6 = new generateShippingLabel(orders[5]);
        
        // Execute the threads
        System.out.println(executor.isShutdown());
        executor.execute(label1);
        executor.execute(label2);
        executor.execute(label3);
        executor.execute(label4);
        executor.execute(label5);
        executor.execute(label6);
        
        System.out.println(executor.isShutdown());
        
        // Shutdown the threads and display the total
        executor.shutdown();
        System.out.println(executor.isShutdown());
    }
    
    
   
}