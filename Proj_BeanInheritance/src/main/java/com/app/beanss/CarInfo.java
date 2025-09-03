package com.app.beanss;

public class CarInfo {
	
	private String carName;
	private String companyName;
	private Integer price;
	private String engineSize;
	private String tyreType;
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
	public String getTyreType() {
		return tyreType;
	}
	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	@Override
	public String toString() {
		return "CarInfo [carName=" + carName + ", companyName=" + companyName + ", price=" + price + ", engineSize="
				+ engineSize + ", tyreType=" + tyreType + "]";
	}
	
	

	
}
