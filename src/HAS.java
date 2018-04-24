public class HAS 
{
	public static void main(String[] args) {
		
		
		Controler has1=new Controler();
		has1.addlights();
		has1.TurnOn("light");
		has1.displayDeviceList();
		
		Controler has2=new Controler();
		has2.addlights();
		has2.addAC();
		has2.addTV();
		has2.displayDeviceList();
	}
}