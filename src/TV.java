public class TV 
{
	int on;
	int off;
	int channel=0;
	int volume=0;
	
	public int getOn()
	{
		return on;
	}
	
	public void TurnOn()
	{
		this.on=1;
		this.off=0;
	}
	
	public void TurnOff()
	{
		this.on=0;
		this.off=1;
	}
	
	public int getChannel()
	{
		return channel;
	}
	
	public void ChannelUp()
	{
		this.channel=this.channel++;
	}
	
	public void ChannelDown()
	{
		if((this.channel)>0)
		{
			this.channel=this.channel--;
		}
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void VolumeUp()
	{
		this.volume=this.volume++;
	}
	
	public void VolumeDown()
	{
		if((this.volume)>0)
		{
			this.volume=this.volume--;
		}
	}
	
	public void turnOn()
	{
		on=1;
		off=0;
		System.out.println("TV is Turned On");
	}
	public void turnOff()
	{
		on=0;
		off=1;
		System.out.println("TV is Turned Off");
	}
	public void channelNext()
	{
		channel++;
		System.out.println("Channel: "+channel);
	}
	public void channelPrevious()
	{
		channel--;
		System.out.println("Channel: "+channel);
	}
	public void volumeUp()
	{
		volume++;
		System.out.println("Volume: "+volume);
	}
	public void volumeDown()
	{
		volume--;
		System.out.println("Volume: "+volume);
	}
}
