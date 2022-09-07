package com.PostRequest.Utility;

import org.springframework.beans.BeanUtils;

import com.PostRequest.Dto.RequestDto;
import com.PostRequest.Model.Models;

public class Utilitiea {

	public static RequestDto entityToDto(Models models) {
		RequestDto modelsDto = new RequestDto();
		BeanUtils.copyProperties(models, modelsDto);
		return modelsDto;
	}
	 public static RequestDto dtoToEntity(RequestDto modelDto) {
	        RequestDto model = new RequestDto();
	        BeanUtils.copyProperties(modelDto, model);
	        return model;
	    }

	public static Object entityToDto(Object o) {
		return null;
	}
}
