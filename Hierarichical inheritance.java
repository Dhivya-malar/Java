package madurai;

public class Garden_Owner {
		protected int price=10;
		private int seedCount=50;
		protected void pickfruits() {
			System.out.println("pick all types of fruits in my garden");
		}
		protected void entry() {
			System.out.println("My relative people can only enter into my garden");
			}
		private void OrganicFarming() {
			System.out.println("Organic farming is done in may garden.");
		}
	}

package salem;
import madurai.Garden_Owner;
public class SonGardenOwner extends Garden_Owner {
public static void main(String[] args) {
	SonGardenOwner property=new SonGardenOwner();
	property.pickfruits();
	property.entry();
}
	

}
package trichy;
import madurai.Garden_Owner;
public class DaughterGardenOwner extends Garden_Owner {
	public static void main(String[]args) {
		DaughterGardenOwner experience=new DaughterGardenOwner();
	    experience.entry();
	}

}
