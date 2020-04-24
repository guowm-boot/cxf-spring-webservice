package com.solaris.cxf_spring_webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CommonService {
    @WebMethod
    String sayHello(@WebParam(name = "param") String param);

    @WebMethod
    String getUser(@WebParam(name = "param") String param);
}
