package com.xworkz.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.xworkz.mapDTO.CeoDTO;
import com.xworkz.mapDTO.CompanyDTO;

public class CompanyCeoRunner {

	public static void main(String[] args) {
		
		Collection<CompanyDTO> companyCollection=new ArrayList<CompanyDTO>();
		CompanyDTO company1=new CompanyDTO("Cognizant", "29AAACD7204L8ZD", "26 jan 1994", "Bangalore");
		CompanyDTO company2=new CompanyDTO("Infosys", "29AAACI4798L1ZU", "2 jul 1981", "Mysore");
		CompanyDTO company3=new CompanyDTO("Capgemini", "27AABCM4573E2ZI", "1 oct 1967", "Hydrabad");
		CompanyDTO company4=new CompanyDTO("NTTData", "29AABCK7777J3ZS", "23 May 1998", "Delhi");
		CompanyDTO company5=new CompanyDTO("Concentrix", "06AABCD4187D8ZP", "9 mar 1995", "Mumbai");
		companyCollection.add(company1);
		companyCollection.add(company2);
		companyCollection.add(company3);
		companyCollection.add(company4);
		companyCollection.add(company5);//name,exp,nativePlace,salary
		
		//System.out.println("****************************************");
		
		Collection<CeoDTO> ceoDTOCollection=new ArrayList<CeoDTO>();
		CeoDTO ceo1=new CeoDTO("Ravi kumar", 35, "Kerala", 186);
		CeoDTO ceo2=new CeoDTO("Salil Parekh", 30, "Mumbai", 71);
		CeoDTO ceo3=new CeoDTO("Aiman Ezzat", 25, "Pune", 75);
		CeoDTO ceo4=new CeoDTO("Yo Honma", 20, "Japan", 45);
		CeoDTO ceo5=new CeoDTO("Chris Caldwell", 35, "US", 96);
		ceoDTOCollection.add(ceo1);
		ceoDTOCollection.add(ceo2);
		ceoDTOCollection.add(ceo3);
		ceoDTOCollection.add(ceo4);
		ceoDTOCollection.add(ceo5);
		
		//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		Map<CompanyDTO, CeoDTO> map=new HashMap<CompanyDTO, CeoDTO>();
		map.put(company1, ceo1);
		map.put(company2, ceo2);
		map.put(company3, ceo3);
		map.put(company4, ceo4);
		map.put(company5, ceo5);
		
		//System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		map.forEach((CompanyDTO,CeoDTO)->System.out.println(CompanyDTO+ ":" +CeoDTO));
		
	}

}
