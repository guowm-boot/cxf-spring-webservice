package com.solaris.cxf_spring_webservice;

import lombok.Data;

@Data
public class User {
    String id;
    String name;
    String age;
    User(String id,String name,String age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
