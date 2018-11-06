package com.fdmgroup.Website;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gem")
public class Gem {
	
	@Id //use gemName as pk
	private String gemName;
	@Column
	private String picture_link;
	
	public Gem(String gemName, String picture_link) {

		this.gemName = gemName;
		this.picture_link = picture_link;
	}

	public Gem() {
		//for JPA
	}
	
	public String getGemName() {
		return gemName;
	}

	public void setGemName(String gemName) {
		this.gemName = gemName;
	}

	public String getPicture_link() {
		return picture_link;
	}

	public void setPicture_link(String picture_link) {
		this.picture_link = picture_link;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gemName == null) ? 0 : gemName.hashCode());
		result = prime * result + ((picture_link == null) ? 0 : picture_link.hashCode());
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
		Gem other = (Gem) obj;
		if (gemName == null) {
			if (other.gemName != null)
				return false;
		} else if (!gemName.equals(other.gemName))
			return false;
		if (picture_link == null) {
			if (other.picture_link != null)
				return false;
		} else if (!picture_link.equals(other.picture_link))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gem [gemName=" + gemName + ", picture_link=" + picture_link + "]";
	}
}
