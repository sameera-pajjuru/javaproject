package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CarInfo
 *
 */
@Entity
@NamedQuery(name="dl", query = "delete  from CarInfo e where e.carName=:xy")
public class CarInfo implements Serializable {

	   
	@Id
	private String carName;
	private String carColor;
	private double carPrice;
	private static final long serialVersionUID = 1L;

	public CarInfo() {
		super();
	}   
	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}   
	public String getCarColor() {
		return this.carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}   
	public double getCarPrice() {
		return this.carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
   
}
