package com.solaris.cxf_spring_webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class CxfClient {
    public static void main(String[] args) throws Exception {
        cl2();
    }
    /**
     * 动态调用方式
     * @throws Exception
     */
    public static void cl2() throws Exception {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf
                .createClient("http://localhost:8080/services/CommonService?wsdl");
        // getUser 为接口中定义的方法名称 张三为传递的参数 返回一个Object数组
        Object[] objects = client.invoke("getUser", "张三");
        System.out.println(objects[0]);
    }
}

