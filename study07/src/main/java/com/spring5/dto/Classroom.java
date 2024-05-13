package com.spring5.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
	private String part;
	private String classroom;
	private Integer classNum;
	private ArrayList<Student> students;
}
