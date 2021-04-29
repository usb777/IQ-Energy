package com.iqenergy.model;

public class Slogan 
{

	private int id;	
	private String slogan;
	
	
	public Slogan()
	{
		super();
	}
	
	public Slogan(String slogan) 
	{
		super();
	this.slogan = slogan;
	}
	
	public Slogan(int id, String slogan) 
	{
		super();
		this.id = id;
		this.slogan = slogan;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getSlogan()
	{
		return slogan;
	}
	public void setSlogan(String slogan)
	{
		this.slogan = slogan;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((slogan == null) ? 0 : slogan.hashCode());
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
		Slogan other = (Slogan) obj;
		if (id != other.id)
			return false;
		if (slogan == null) {
			if (other.slogan != null)
				return false;
		} else if (!slogan.equals(other.slogan))
			return false;
		return true;
	}
	@Override
	public String toString() {		return "Slogan [id=" + id + ", slogan=" + slogan + "]";	}

	
	
	
	
	
	
}
