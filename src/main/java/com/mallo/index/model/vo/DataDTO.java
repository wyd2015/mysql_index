package com.mallo.index.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class DataDTO implements Serializable{
	
	private static final long serialVersionUID = 1089778520968496367L;
	
	//private List<DataDTO> dtoList;
	
	private int id ;
	
	private String name;
}
