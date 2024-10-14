package com.mbo.miscellaneous;

import java.util.Date;
//To create an immutable class, you have to make all these members as private and give a getMethod for
//the accessible attributes
public final class ImmutablePlanet {

	private final double fMass;
	private final String fName;
	private final Date fDateOfDiscovery;
	
	public ImmutablePlanet(final double aMass, final String aName, final Date aDateOfDiscovery) {
		this.fMass = aMass;
		this.fName = aName;
		this.fDateOfDiscovery = aDateOfDiscovery;
	}
	
	public double getMass() {
		return this.fMass;
	}
	
	public String getName() {
		return this.fName;
	}
	
	public Date getDateOfDiscovery() {
		return fDateOfDiscovery;
	}
}
