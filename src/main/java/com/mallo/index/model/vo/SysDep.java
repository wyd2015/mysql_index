package com.mallo.index.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mallo.index.model.po.generator.SysDepartment;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(value={"handler"})
public class SysDep implements Serializable{
	
	private static final long serialVersionUID = -9032728579398063998L;
	private Integer depId;
    private String depName;
    private Integer parentId;
    private Integer depLevel;
    private String depCode;
    private Date createTime;
    private Date updateTime;
    private Integer userNum;
    private Integer operateUserId;

	private List<SysDepartment> depList;
	
}
