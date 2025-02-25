package BusReservation;

public class Bus {
	
	private int busNo;
	private boolean Ac;
	private int Capacity;
	
	Bus(int no, boolean Ac, int capacity)
	{
		this.busNo = no;
		this.Ac=Ac;
		this.Capacity=capacity;
	}
	
	public int getCapacity()
	{
		return Capacity;
	}
	public void setCapacity(int cap)
	{
		Capacity = cap;
	}
}
