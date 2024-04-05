package com.microservice.courses.http.response;

import java.util.List;

import com.microservice.courses.controller.DTO.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentByCouseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}