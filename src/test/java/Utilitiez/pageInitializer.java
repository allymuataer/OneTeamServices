package Utilitiez;

import Pages.homePage;
import Pages.ourServicesPage;

public class pageInitializer extends Driver {

	public static homePage hp;
	public static ourServicesPage osp;

public static void initialize() {
	

	hp = new homePage();
	osp = new ourServicesPage();
	
}
}
