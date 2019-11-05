package com.packagename.myapp.spring;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SampleModel {

    @Size(min = 5)
    String _string;


}
