package com.medicine;

public class Medicine{
	public void displayLabel(){
	System.out.println("Company : Aurobindo Pharma");
	System.out.println("Address : "Gurugram");
	}
	}
class Tablet extends Medicine{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicine{
	public void displayLabel(){
	System.out.println("Consumption as directed by the physician");
	}
	}
class Ointment extends Medicine{
	public void displayLabel(){
	System.out.println("for external use only");
}
}