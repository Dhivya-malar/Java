package bank;

class Encapsulation{
	private String place;
	private int busno, people;
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
public static void main(String[]args) {
	Organizer Manager=new Organizer();
	Manager.setPlace( "Coimbatore");
	Manager.setBusno(1234);
	Manager.setPeople(50);
	
	System.out.println("The tourists place is" + Manager.getPlace());
	System.out.println("The Bus number is"+ Manager.getBusno());
	System.out.println("The number of people arriving for tour is"+ Manager.getPeople());
	
}
	
}