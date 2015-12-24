package com.xvitcoder.springmvcangularjs.beans;

public class RailwayStation {

	
	private Long id;
	
	private String name;
	
	private Train train;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
