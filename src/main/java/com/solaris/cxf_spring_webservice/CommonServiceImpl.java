package com.solaris.cxf_spring_webservice;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "CommonService", // 与接口中指定的name一致
        targetNamespace = "http://cxf_spring_webservice.solaris.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.solaris.cxf_spring_webservice.CommonService"// 接口地址
)
@Component
public class CommonServiceImpl implements CommonService {
    @Override
    public String getUser(String param) {
        User user = new User("1", "吹比龙", param);
        return user.toString();
    }

    @Override
    public String sayHello(String param) {
        return "";
    }
}
