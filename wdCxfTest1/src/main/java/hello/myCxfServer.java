package hello;

import javax.jws.WebService;

@WebService
public interface myCxfServer {

    public String sayHello(String name);

    public Double add(Double a,Double b);
}
