public class WashMachine
{
	int on;
	int off;
	int timer;
	
	public int getWMOn() 
	{
		return on;
	}
	public void setWMOn() 
	{
		this.on = 1;
		this.off = 0;
	}
	
	public int getWMOff() 
	{
		return off;
	}
	public void setWMOf() 
	{
		this.on = 0;
		this.off = 1;
		this.timer = 0;
	}
	
	public int getTimer()
	{
		return timer;
	}
	
	public void setTimer(int Timer)
	{
		this.timer=Timer;
	}
}
