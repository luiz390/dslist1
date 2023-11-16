package com.devsuperior.dslist1.dto;

import com.devsuperior.dslist1.entity.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
    public GameMinDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public GameMinDTO(Game entity) {
	     id = entity.getId();
		 title = entity.getTitle();
		 year = entity.getYear();
		 imgUrl = entity.getImgUrl();
		 shortDescription = entity.getShortdescription();
	}

	
	

}
