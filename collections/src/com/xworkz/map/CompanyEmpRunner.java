package com.xworkz.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.mapDTO.CompanyDTO;
import com.xworkz.mapDTO.EmployeeDTO;

public class CompanyEmpRunner {

	public static void main(String[] args) {
		
		Collection<CompanyDTO> company=new ArrayList<CompanyDTO>();
		CompanyDTO company1=new CompanyDTO("Cognizant", "29AAACD7204L8ZD", "26 jan 1994", "Bangalore");
		CompanyDTO company2=new CompanyDTO("Infosys", "29AAACI4798L1ZU", "2 jul 1981", "Mysore");
		CompanyDTO company3=new CompanyDTO("Capgemini", "27AABCM4573E2ZI", "1 oct 1967", "Hydrabad");
		CompanyDTO company4=new CompanyDTO("NTTData", "29AABCK7777J3ZS", "23 May 1998", "Delhi");
		CompanyDTO company5=new CompanyDTO("Concentrix", "06AABCD4187D8ZP", "9 mar 1995", "Mumbai");
		company.add(company1);
		company.add(company2);
		company.add(company3);
		company.add(company4);
		company.add(company5);
		
		
		Collection<EmployeeDTO> employeeCollection=new ArrayList<EmployeeDTO>();
		EmployeeDTO emp1=new EmployeeDTO("Dhanushree", "Software Developer", 50000);
		EmployeeDTO emp2=new EmployeeDTO("Varshitha", "QA Engineer", 80000);
		EmployeeDTO emp3=new EmployeeDTO("Chandru", "Trainee Engineer", 30000);
		EmployeeDTO emp4=new EmployeeDTO("Sanjana", "Data Analyst", 25000);
		EmployeeDTO emp5=new EmployeeDTO("Charitha", "Software Engineer", 40000);
		employeeCollection.add(emp1);
		employeeCollection.add(emp2);
		employeeCollection.add(emp3);
		employeeCollection.add(emp4);
		employeeCollection.add(emp5);
		
		Map<CompanyDTO,Set<EmployeeDTO>> map =new HashMap<CompanyDTO, Set<EmployeeDTO>>();
		//map.put(company, );

	}

}
