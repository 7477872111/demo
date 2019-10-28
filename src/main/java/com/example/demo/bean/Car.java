package com.example.demo.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data //get 、set
@AllArgsConstructor //所有参数的有参数构造函数
@NoArgsConstructor  //无参数构造函数
public class Car {

    private Integer id;
    private String name;
    private Float price;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;


}
