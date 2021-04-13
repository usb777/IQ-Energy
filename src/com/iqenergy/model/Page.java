package com.iqenergy.model;

import java.util.Date;

public class Page 
{
	
	private int page_id;
	private String page_name;
	private String page_title;
	private String page_info;
	private int page_order;
	private String template;

	public Page()
	{
		super();		
	}

	public Page(int page_id, String name, String page_title, String page_info, int page_order, String template)
	{
		super();
		this.page_id = page_id;
		this.page_name = name;
		this.page_title = page_title;
		this.page_info = page_info;
		this.page_order = page_order;
		this.template = template;
	}
	

	public Page( String name, String page_title, String page_info, int page_order, String template)
	{
		super();		
		this.page_name = name;
		this.page_title = page_title;
		this.page_info = page_info;
		this.page_order = page_order;
		this.template = template;
	}

	
	
	public int getPage_id() {
		return page_id;
	}

	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}


	
	

	public String getPage_name() {
		return page_name;
	}

	public void setPage_name(String page_name) {
		this.page_name = page_name;
	}

	public String getPage_title() {
		return page_title;
	}

	public void setPage_title(String page_title) {
		this.page_title = page_title;
	}

	public String getPage_info() {
		return page_info;
	}

	public void setPage_info(String page_info) {
		this.page_info = page_info;
	}

	public int getPage_order() {
		return page_order;
	}

	public void setPage_order(int page_order) {
		this.page_order = page_order;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "Page [page_id=" + page_id + ", page_name=" + page_name + ", page_title=" + page_title + ", page_info=" + page_info
				+ ", page_order=" + page_order + ", template=" + template + "]";
	}
	
	
	
	
	
		
	
	
	
	
}