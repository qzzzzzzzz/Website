package com.fdmgroup.Website;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GemDistributionId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1727589127518837667L;
	@Column(nullable = false)
    private int gemId;

    @Column(nullable = false)
    private int countryId;
	
	public GemDistributionId(int gemId, int countryId) {
		this.gemId = gemId;
		this.countryId = countryId;
	}
	
	public GemDistributionId() {
		
	}

	public int getGemId() {
		return gemId;
	}
	
	public void setGemId(int gemId) {
		this.gemId = gemId;
	}
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + gemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GemDistributionId other = (GemDistributionId) obj;
		if (countryId != other.countryId)
			return false;
		if (gemId != other.gemId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GemDistributionId [gemId=" + gemId + ", countryId=" + countryId + "]";
	}
	
	
	
	
}
