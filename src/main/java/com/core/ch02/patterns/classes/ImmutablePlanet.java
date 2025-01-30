package com.core.ch02.patterns.classes;

import java.util.Date;
//Immutable class => all private members + give methods to access attributes
public final class ImmutablePlanet {

	private final String name;
	private final double diameter;
	private final double mass;
	private final Date dateOfDiscovery;
	
	
	public ImmutablePlanet(final String name, final double diameter, final double mass, final Date dateOfDiscovery) {
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.dateOfDiscovery = dateOfDiscovery;
	}
	
	public String getName() {
		return name;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public double getMass() {
		return mass;
	}
	
	public Date getDateOfDiscovery() {
		return dateOfDiscovery;
	}
}
