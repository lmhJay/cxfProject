package client;

import hello.myCxfServer;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.math.BigDecimal;

public class wsClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
        bean.setServiceClass(myCxfServer.class);
        bean.setAddress("http://localhost:8081/webService/cxfserver");
        myCxfServer helloWorldService = (myCxfServer) bean.create();
        Double a = new Double(2);
        Double b = new Double(2);
        Double result = helloWorldService.add(a,b);
        System.out.println(result);
    }
}
