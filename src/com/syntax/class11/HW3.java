package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		
//create an array of countries
//while retrieving all values from an array print capital for each country
		
String[] countries= {"usa","Ukraine","Canada"};
String[] capitals= {"Dc","Kyiv","Ottawa"};

for(int v=0; v<countries.length; v++) {
	System.out.println("the capital of "+countries[v]+ " is "+ capitals[v]);
	
}
System.out.println("------------");
String capital;
for(String country:countries) {
	switch(country) {
	case "usa":
		capital="Dc";
		break;
	case "Ukraine":
		capital="Kyiv";
		break;
	case "Canada":
		capital="Ottawa";
		break;
	default:
		capital="I d know";
	}
	System.out.println("capital of the "+country+" is "+ capital);
	
	}
	
}


	}

