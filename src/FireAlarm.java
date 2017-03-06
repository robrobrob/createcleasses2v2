import java.util.Scanner;

/**
 * Created by Robert on 2/24/17.
 */
public class FireAlarm {
	boolean hasPower;
	boolean isRinging;
	boolean isFlashing;
	String color;
	//constructor
	public FireAlarm(){
		hasPower = false;
		isRinging = false;
		isFlashing = false;
		color = "Red";
	}
	//getters
	public boolean getHasPower(){return hasPower;}
	public boolean getRinging(){return isRinging;}
	public boolean getFlashing(){return isFlashing;}
	public String getColor(){return color;}
	//setters
	public void setFire(boolean isFire){
		if (isFire && hasPower){
			hasPower = isFire;
			isRinging = isFire;
			isFlashing = isFire;
		}
		if (isFire && !hasPower){
			System.out.println("No Power Present");
		}
		if (!isFire){
			System.out.println("No fire present");
		}
	}
	public void setPower(boolean newPower){
		hasPower = newPower;
	}
	//test
	public static void main(String[] args) {
		FireAlarm fA1 = new FireAlarm();
		FireAlarm fA2 = new FireAlarm();
		String hasFire;;
		String hasPower;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fire Alarm 1 is colored "+fA1.getColor());
		System.out.println("Fire Alarm 2 is "+fA2.getHasPower()+" Do you want to turn it on? Y or N.");
		hasPower = scanner.nextLine();
		if (hasPower.equals("Y")){
			fA2.setPower(true);
		}
		if (hasPower.equals("N")){
			System.out.println("Power is still off");
		}
		hasPower = null;
		System.out.println("Fire Alarm 1 is "+fA1.getHasPower()+" Do you want to turn it on? Y or N.");
		hasPower = scanner.nextLine();
		if (hasPower.equals("Y")){
			fA1.setPower(true);
		}
		if (hasPower.equals("N")){
			System.out.println("Power is still off");
		}
		System.out.println("Is there fire? Y or N.");
		hasFire = scanner.nextLine();
		boolean bothOn = fA2.getHasPower() && fA1.getHasPower();
		if (hasFire.equals("Y") && bothOn){
			fA2.setFire(true);
			fA1.setFire(true);
			System.out.println("Both fire alarms are flashing:"+ fA1.getFlashing()+ ". Also, both are ringing:"+fA2.getRinging());
		}


	}
}
