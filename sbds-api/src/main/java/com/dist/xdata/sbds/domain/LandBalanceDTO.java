package com.dist.xdata.sbds.domain;

import java.io.Serializable;

public class LandBalanceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438582162170260785L;
	private String name;
	private Double area;
	private Double ratio;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	@Override
	public String toString() {
		return "LandBalanceDTO [name=" + name + ", area=" + area + ", ratio=" + ratio + "]";
	}

}
