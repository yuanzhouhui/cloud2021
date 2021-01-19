package com.bright.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-18 16:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}
