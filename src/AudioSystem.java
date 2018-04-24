public class AudioSystem
{
	int on;
	int off;
	int volume;
	
	public int getASOn() 
	{
		return on;
	}
	public void setASOn() 
	{
		this.on = 1;
		this.off = 0;
	}
	
	public int getASOff() 
	{
		return off;
	}
	public void setACOf() 
	{
		this.on = 0;
		this.off = 1;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void VolumeUp()
	{
		if((this.volume)<100)
			this.volume=this.volume++;
	}
	
	public void VolumeDown()
	{
		if((this.volume)>0)
			this.volume=this.volume--;
	}
}
