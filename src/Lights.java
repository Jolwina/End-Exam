public class Lights 
{
	int on;
	int off;
	
	public int getLightOn() 
	{
		return on;
	}
	public void setLightOn() 
	{
		this.on = 1;
		this.off = 0;
	}
	
	public int getLightOff() 
	{
		return off;
	}
	public void setLightOff() 
	{
		this.on = 0;
		this.off = 1;
	}
	
	public void turnOn()
	{
		on=1;
		off=0;
		System.out.println("Light is Turned On");
	}
	public void turnOff()
	{
		on=0;
		off=1;
		System.out.println("Light is Turned Off");
	}
}
