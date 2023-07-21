package Utilitiez;

import Pages.bookStorePage;
import Pages.loginPage;

public class pageInitializer extends Driver {

	public static bookStorePage bsp;

public static void initialize() {
	

	bsp = new bookStorePage();
	
}
}
