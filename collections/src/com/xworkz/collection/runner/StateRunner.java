package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import com.xworkz.CollectionDTO.StateDTO;
import com.xworkz.CollectionDTO.StateDTO.Direction;

public class StateRunner {

	public static void main(String[] args) {

		StateDTO state1=new StateDTO("Karnataka", 61.100d,Direction.SOUTH, "Siddaramaiah", 226.178d, 346.409d );
		StateDTO state2=new StateDTO("Andhra Pradesh", 9.46d,Direction.SOUTH, "Y. S. Jagan Mohan Reddy", 13177.280d,279.279d );
		StateDTO state3=new StateDTO("Arunachal Pradesh",18.25d,Direction.WEST, "Pema Khandu", 612.657d, 29.657d );
		StateDTO state4=new StateDTO("Assam", 3.66d,Direction.WEST, "Himanta Biswa Sarma", 398.986d, 321d);
		StateDTO state5=new StateDTO("Bihar", 13.10d,Direction.WEST, "Nitish Kumar", 751.396d, 261.885d);
		StateDTO state6=new StateDTO("Chhattisgarh", 30.3d,Direction.SOUTH, "Vishnu Deo Sai", 457.608d,121.50d);
		StateDTO state7=new StateDTO("Goa", 15.8d,Direction.SOUTH, "Pramod sawanth", 598.647d, 26.844d);
		StateDTO state8=new StateDTO("Gujarat", 7.27d,Direction.EAST, "Bhupendrabhai Patel", 2459.435d, 301.000d);
		StateDTO state9=new StateDTO("Haryana", 3.09d,Direction.NORTH, "Nayab Singh Saini", 994.1540d,183.950d);
		StateDTO state10=new StateDTO("Himachal Pradesh", 77.56d,Direction.NORTH, "Sukhvinder Singh Sukhu", 195.4050d, 53.413d);
		StateDTO state11=new StateDTO("Jharkhand", 4.06d,Direction.WEST, "Champai Soren", 3937.220d, 116.418d);
		StateDTO state12=new StateDTO("Kerala", 35d,Direction.SOUTH, "Pinarayi Vijayan", 6783.120d, 312.000d);
		StateDTO state13=new StateDTO("Madhya Pradesh", 8.77d,Direction.NORTH, "Mohan Yadav", 13228.210d, 314.024d);
		StateDTO state14=new StateDTO("Maharashtra", 13.16d,Direction.SOUTH, "Ekanth Shinde", 1934.021d, 547.450d);
		StateDTO state15=new StateDTO("Manipur", 36.49d,Direction.WEST, "N.Biren Singh", 2904.174d, 35.022d);
		StateDTO state16=new StateDTO("Meghalaya", 38.16d,Direction.WEST, "Conrad sangma", 426.970d, 22.022d);
		StateDTO state17=new StateDTO("Nagaland", 41.14d,Direction.WEST, "Neiphiu Rio", 2693.410d, 23.086d);
		StateDTO state18=new StateDTO("Odisha", 4.37d,Direction.SOUTH, "Naveen Patnaik", 237.981d, 230.000d);
		StateDTO state19=new StateDTO("Punjab", 3.17d,Direction.NORTH, "Bhagavanth singh Mann", 7748.690d, 196.462d);
		StateDTO state20=new StateDTO("Rajasthan", 8.36d,Direction.EAST, "Bhajan Lal Sharma", 1413.6200d, 297.091d);
		StateDTO state21=new StateDTO("Sikkim", 6.09d,Direction.WEST, "Prem Singh Tamang", 427.560d, 12.146d);
		StateDTO state22=new StateDTO("Tamil Nadu", 8.39d,Direction.SOUTH, "M.K.Stalin", 23645.140d, 360.379d);
		StateDTO state23=new StateDTO("Telangana", 350d,Direction.SOUTH, "Revanth Reddy", 1313.3910d, 290.396d);
		StateDTO state24=new StateDTO("Tripura", 42.32d,Direction.WEST, "Manik Shah", 726.360d, 26.892d);
		StateDTO state25=new StateDTO("Uttar Pradesh", 24.14d,Direction.NORTH, "Yogi Adiyanath", 2257.5750d, 690.242d);
		StateDTO state26=new StateDTO("Uttarakhand", 1.22d,Direction.NORTH, "Pushkar Singh Dhami", 3026.210d, 77.407d);
		StateDTO state27=new StateDTO("West Bengal", 10.42d,Direction.WEST, "Mamatha Benarjee", 1554.9920d, 339.162d);
		StateDTO state28=new StateDTO("Mizoram", 11.2d,Direction.WEST, "Lalduhoma", 26d, 14.209d);
		StateDTO state29=new StateDTO("Jammu&Kashmir", 1.56d,Direction.NORTH, "Vacant-President Rule", 2279.270d, 118.500d);
		
		Collection<StateDTO> state=new ArrayList<StateDTO>();
		state.add(state1);
		state.add(state2);
		state.add(state3);
		state.add(state4);
		state.add(state5);
		state.add(state6);
		state.add(state7);
		state.add(state8);
		state.add(state9);
		state.add(state10);
		state.add(state11);
		state.add(state12);
		state.add(state13);
		state.add(state14);
		state.add(state15);
		state.add(state16);
		state.add(state17);
		state.add(state18);
		state.add(state19);
		state.add(state20);
		state.add(state21);
		state.add(state22);
		state.add(state23);
		state.add(state24);
		state.add(state25);
		state.add(state26);
		state.add(state27);
		state.add(state28);
		state.add(state29);
		
		state
		.stream()
		.map(s->s.getName())
		.sorted()
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of name************");
		
		state
		.stream()
		.sorted((s1,s2)->s2.getName().compareTo(s1.getName()))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state in desc************");
		
		state
		.stream()
		.filter(s -> s.getDirection() == Direction.EAST)
		.sorted((s1,s2)->s1.getDirection().EAST.compareTo(s2.getDirection().EAST))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state in direction east************");
		
		state
		.stream()
		.filter(s->s.getDirection() == Direction.WEST)
		.sorted((s1,s2)->s1.getDirection().WEST.compareTo(s2.getDirection().WEST))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state in direction WEST************");

		state
		.stream()
		.filter(s->s.getDirection() == Direction.NORTH)
		.sorted((s1,s2)->s1.getDirection().NORTH.compareTo(s2.getDirection().NORTH))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state in direction NORTH************");
		
		state
		.stream()
		.filter(s->s.getDirection() == Direction.SOUTH)
		.sorted((s1,s2)->s1.getDirection().SOUTH.compareTo(s2.getDirection().SOUTH))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state in direction SOUTH************");
		
		state
		.stream()
		.map(s->s.getPopulation())
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state population in asc************");
		
		state
		.stream()
		.filter(s->s.getName().equalsIgnoreCase("Karnataka"))
		.map(s->s.getPopulation())
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(s->System.out.println("population by State :"+s));
		
		System.out.println("*********default sort of state population************");
		
		state
		.stream()
		.filter(s->s.getChiefMinsiter().equalsIgnoreCase("Mohan yadav"))
		.map(s->s.getName())
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state population************");
		
		state
		.stream()
		.filter(s->s.getChiefMinsiter().equalsIgnoreCase("Mohan yadav"))
		.map(s->s.getName())
		.sorted((s1,s2)->s1.compareTo(s2))
		.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state population************");
		
		
		state
		.stream()
		.max(Comparator.comparingDouble(st->st.getBudget()))
		.ifPresent(st->System.out.println("max of budget :"+st.getBudget()));
		//.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state max buget************");
		
		state
		.stream()
		.min(Comparator.comparingDouble(st->st.getBudget()))
		.ifPresent(st->System.out.println("min of budget :"+st.getBudget()));
		//.forEach(s->System.out.println(s));
		
		System.out.println("*********default sort of state min buget************");
		
		state
		.stream()
		.filter(s->s.getRevenue()>10d)
		.forEach(s->System.out.println(s));
		
		System.out.println("*********get all revenue by greater than 10************");

		
	}

}
