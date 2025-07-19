package abstraction;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}
class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor Plus";
    }
    public String getRegistrationNumber() {
        return "AP01 AB1234";
    }
    public String getOwnerName() {
        return "Ravi Kumar";
    }
    public int getSpeed() {
        return 60; 
    }
    public void radio() {
        System.out.println("Radio is ON in Hero. Tuning FM...");
    }
}
 class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Activa";
    }
    public String getRegistrationNumber() {
        return "TS09 XY6789";
    }
    public String getOwnerName() {
        return "Sita Reddy";
    }
    public int getSpeed() {
        return 55; 
    }
    public void cdplayer() {
        System.out.println("CD Player is running in Honda. Playing track...");
    }
}
public class Question2 {
  public class TestVehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero();
        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Hero Reg. No: " + hero.getRegistrationNumber());
        System.out.println("Hero Owner: " + hero.getOwnerName());
        System.out.println("Hero Speed: " + hero.getSpeed() + " km/h");
        hero.radio();  
        System.out.println();
        Honda honda = new Honda();
        System.out.println("Honda Model: " + honda.getModelName());
        System.out.println("Honda Reg. No: " + honda.getRegistrationNumber());
        System.out.println("Honda Owner: " + honda.getOwnerName());
        System.out.println("Honda Speed: " + honda.getSpeed() + " km/h");
        honda.cdplayer();

	}
  }

}
