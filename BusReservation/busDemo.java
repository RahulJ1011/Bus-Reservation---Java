package BusReservation;
import java.util.*;
public class busDemo {
	
	public static void main(String[] args)
	{
		ArrayList<Bus>buses = new ArrayList<>();
		
		int choice;
		choice = 1;
		Scanner sc = new Scanner(System.in);
		while(choice == 1)
		{
			System.out.println("Enter 1 to book and 2 to exit:");
			choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Booking ");
			}
		}
	}
}
