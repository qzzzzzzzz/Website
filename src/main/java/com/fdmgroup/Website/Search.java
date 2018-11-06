package com.fdmgroup.Website;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "search_record")
public class Search {
	
	@Id 
	private int searchId;
	@Column
	private int userId;
	private int gemId;
	private int countryId;
	private int searchByGem; //1 = searchByGem, 0 = searchByCountry
	
	public Search(int searchId, int userId, int targetId, int searchByGem) {
		
		if (searchByGem == 1) {
			
			this.searchId = searchId;
			this.userId = userId;
			this.gemId = targetId;
			this.countryId = -1;
			this.searchByGem = searchByGem;
		
		}else {
			
			this.searchId = searchId;
			this.userId = userId;
			this.countryId = targetId;
			this.gemId = -1;
			this.searchByGem = searchByGem;
		}
	}

	public int getSearchId() {
		return searchId;
	}

	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int isSearchByGem() {
		return searchByGem;
	}

	public void setSearchByGem(int searchByGem) {
		this.searchByGem = searchByGem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + gemId;
		result = prime * result + searchByGem;
		result = prime * result + searchId;
		result = prime * result + userId;
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
		Search other = (Search) obj;
		if (countryId != other.countryId)
			return false;
		if (gemId != other.gemId)
			return false;
		if (searchByGem != other.searchByGem)
			return false;
		if (searchId != other.searchId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		if (searchByGem == 1) {
			
			return "Search [search_id=" + searchId + ", userId=" + userId + ", gemId=" + gemId + ", searchByGem]";
		
		}else {
			
			return "Search [search_id=" + searchId + ", userId=" + userId + ", countryId=" + countryId + ", searchByCountry]";
		}
	}
	
	
	
	
}
