package com.xworkz.mapDTO;

import java.io.Serializable;

public class CompanyDTO implements Serializable{
	
	private String companyName;
	private String gstNo;
	private String estDate;
	private String city;
	
	public CompanyDTO() {
		System.out.println("no argu constr");
	}

	public CompanyDTO(String companyName, String gstNo, String estDate, String city) {
		super();
		this.companyName = companyName;
		this.gstNo = gstNo;
		this.estDate = estDate;
		this.city = city;
	}

	@Override
	public String toString() {
		return "CompanyDTO [companyName=" + companyName + ", gstNo=" + gstNo + ", estDate=" + estDate + ", city=" + city
				+ "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getEstDate() {
		return estDate;
	}

	public void setEstDate(String estDate) {
		this.estDate = estDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	 @Override
	public boolean equals(Object obj) {
		 if(obj!=null) {
				
				if(obj instanceof CompanyDTO) {
				//	System.out.println("running degree in DTO");
					CompanyDTO c=(CompanyDTO)obj;
					return true;				
				}
			}

			return false;
	}

//	@Override
//	public int compareTo(CompanyDTO o) {
//		System.out.println("running companydto");
//		return 10;
//	}

}
