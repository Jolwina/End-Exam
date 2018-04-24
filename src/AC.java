public class AC 
{
	int on;
	int off;
	int temperature;
	
	public int getACOn() 
	{
		return on;
	}
	public void setACOn() 
	{
		this.on = 1;
		this.off = 0;
	}
	
	public int getACOff() 
	{
		return off;
	}
	public void setACOff() 
	{
		this.on = 0;
		this.off = 1;
	}
	
	public int getTemperature()
	{
		return temperature;
	}
	
	public void TemperatureUp()
	{
		if((this.temperature)>16 && (this.temperature)<32)
			this.temperature=this.temperature++;
	}
	
	public void TemperatureDown()
	{
		if((this.temperature)>16 && (this.temperature)<32)
			this.temperature=this.temperature--;
	}
	
	public void turnOn()
	{
		on=1;
		off=0;
		System.out.println("AC is Turned On");
	}
	public void turnOff()
	{
		on=0;
		off=1;
		System.out.println("AC is Turned On");
	}
	public void tempIncrease()
	{
		temperature++;
		System.out.println("Temperature: "+temperature);
	}
	public void tempDecrease()
	{
		temperature--;
		System.out.println("Temperature: "+temperature);
	}
}
