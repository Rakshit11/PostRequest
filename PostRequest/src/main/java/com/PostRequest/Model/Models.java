package com.PostRequest.Model;

import com.PostRequest.Enum.transferType;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Models {
	
	@Id
	private String id;
	private String stateCode;
	private String vin;
	private transferType Enum;


	public Models(String id) {
		this.id = id;
	}
}
