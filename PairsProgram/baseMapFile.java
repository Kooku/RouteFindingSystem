package kunchaim;

import java.io.Serializable;



public class baseMapFile implements Serializable {
	private static final long serialVersionUID = 1L;
	

	
	public baseMapFile() {
		
	}
	
	public SystemManager addData() throws Exception {
		
		SystemManager sm = new SystemManager();
		
 		Location l1 = new BikeDeliveryLocation("AAAAAAAA");
		Location l2 = new BikeDeliveryLocation("BBBBBBBB");
		Location l3 = new BikeDeliveryLocation("CCCCCCCC");
		Location l4 = new BikeDeliveryLocation("DDDDDDDD");
		Location l5 = new BikeDeliveryLocation("EEEEEEEE");
		Location l6 = new BikeDeliveryLocation("SWAGLANE");
		Location l7 = new TruckDepot("SWAGMINN");
		Location l8 = new TruckDepot("LAGYCODE");
		Location l9 = new TruckDepot("LONGASSE");
		Location l10 = new TruckDepot("POTATOES");
		Location l11 = new Airport("URS");
		Location l12 = new Airport("BES");
		Location l13 = new Airport("RAN");
		Location l14 = new Airport("PEN");
		Location l15 = new Airport("LOL");
		Location l16 = new TruckDepot("FIMMMMMM");
		
		
		sm.addLocation(l1);
		sm.addLocation(l2);
		sm.addLocation(l3);
		sm.addLocation(l4);
		sm.addLocation(l5);
		sm.addLocation(l6);
		sm.addLocation(l7);
		sm.addLocation(l8);
		sm.addLocation(l9);	
		sm.addLocation(l10);
		sm.addLocation(l11);
		sm.addLocation(l12);
		sm.addLocation(l13);
		sm.addLocation(l14);
		sm.addLocation(l15);
		sm.addLocation(l16);
		
		sm.addLeg(new BikeLeg(l1,l7,2,"MTWRF"));
		sm.addLeg(new BikeLeg(l2,l7,4,"MTWRF"));
		sm.addLeg(new TruckLeg(l7,l9,300,"MTWRF"));
		sm.addLeg(new BikeLeg(l9,l4,2,"MTWRF"));
		sm.addLeg(new TruckLeg(l7,l12,30,"MTWRF"));
		sm.addLeg(new TruckLeg(l7,l11,15,"MTWRF"));
		sm.addLeg(new Flight(l11,l12,100,"MTWRF"));
		sm.addLeg(new Flight(l12,l13,400,"MTWRF"));
		sm.addLeg(new Flight(l12,l15,120,"MTWRF"));
		sm.addLeg(new Flight(l11,l13,100,"MTWRF"));
		sm.addLeg(new TruckLeg(l8,l12,8,"MTWRF"));
		sm.addLeg(new Flight(l11,l14,200,"MTWRF"));
		sm.addLeg(new TruckLeg(l8,l14,30,"MTWRF"));
		sm.addLeg(new Flight(l11,l15,80,"MTWRF"));
		sm.addLeg(new Flight(l15,l13,80,"MTWRF"));
		sm.addLeg(new TruckLeg(l8,l10,200,"MTWRF"));
		sm.addLeg(new TruckLeg(l13,l9,18,"MTWRF"));
		sm.addLeg(new Flight(l15,l14,20,"MTWRF"));
		sm.addLeg(new TruckLeg(l14,l10,30,"MTWRF"));
		sm.addLeg(new TruckLeg(l14,l9,40,"MTWRF"));
		sm.addLeg(new BikeLeg(l16,l3,10,"MTWRF"));
		sm.addLeg(new BikeLeg(l3,l8,1,"MTWRF"));
		sm.addLeg(new TruckLeg(l16,l8,15,"MTWRF"));
		sm.addLeg(new BikeLeg(l9,l5,7,"MTWRF"));
		sm.addLeg(new BikeLeg(l10,l5,6,"MTWRF"));
		sm.addLeg(new BikeLeg(l10,l6,1,"MTWRF"));
		
		
		return sm;
	}
	
	
}
