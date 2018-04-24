public class Controler 
{
	int device=0;
	Object[][] div = new Object[6][2];
	public void addTV()
	{
		div[device][0]=new TV();
		div[device][1]="TV";
		device++;
	}
	
	public void addAC()
	{
		div[device][0]=new AC();
		div[device][1]="AC";
		device++;
	}
	public void addlights()
	{
		div[device][0]=new Lights();
		div[device][1]="light";
		device++;
	}
	
	public void displayDeviceList()
	{
		for(int i=0;i<device;i++)
		{
			if(div[i][1]=="AC")
				System.out.println("Device: "+((AC)div[i][1]));
			if(div[i][1]=="TV")
				System.out.println("Device: "+((TV)div[i][1]));
			if(div[i][1]=="light")
				System.out.println("Device: "+((Lights)div[i][1]));
		}
	}
	public void TurnOn(String string) 
	{
		// TODO Auto-generated method stub
		int i;
		for(i=0;div[i][1]!=string && i<device;i++);
		((Lights) div[i][0]).turnOn();;
	}
}
