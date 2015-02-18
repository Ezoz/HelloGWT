package org.main.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.dao.HelloDao;

import org.main.client.HelloRpcService;

public class HelloRpcServiceImpl extends RemoteServiceServlet implements HelloRpcService {

    //ApplicationContext context = new ClassPathXmlApplicationContext("capplicationContext.xml");
    // HelloDao hd = (HelloDao) context.getBean("hd");
    HelloDao hd = new HelloDao();

    String text = hd.createTextList().get(0).getText();

    @Override
    public String myMethod() {
        return text;
    }
}
