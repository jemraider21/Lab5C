/**
 * Name: Mark Quinn
 * Class: CMSY167-001
 * Description:  A good description.
 */
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Lab5C {

	//private static int total;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
    	
    	// Create array of orders, then add them to a list
    	//Order order1 = new Order("Mark Quinn", "10901 Little Patuxent Parkway",50);
        Order[] orders = {
        		new Order("Mark Quinn", "10901 Little Patuxent Parkway",50),
        		new Order("Barack Obama", "1600 Pennsylvania Ave", 60),
        		new Order("Jared Morris", "1234 Address Road", 40),
        		new Order("Mother Teresa", "313 Foster St. ", 67),
        		new Order("Mahatma Gandhi", "415 Cedar Road", 54),
        		new Order("Leonardo da Vinci", "8 Indian Spring Ave.", 49)
        };
        //List<Order> listOfOrders = Arrays.asList(orders);
        
        // Creating threads to be ran by the program
        generateShippingLabel[] labels = {
            new generateShippingLabel(orders[0]),
            new generateShippingLabel(orders[1]),
            new generateShippingLabel(orders[2]),
            new generateShippingLabel(orders[3]),
            new generateShippingLabel(orders[4]),
            new generateShippingLabel(orders[5])
        };
        
        // Execute the threads
        for(int i = 0; i < 6; i++){
            executor.execute(labels[i]);
            
        }
        
        // Shutdown the threads and display the total
        executor.shutdown();
    }
}