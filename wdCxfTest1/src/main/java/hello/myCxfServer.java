package hello;

import javax.jws.WebService;

@WebService
public interface myCxfServer {

    public String sayHello(String name);
}
