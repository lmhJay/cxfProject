package hello;

import javax.jws.WebService;

@WebService
public class myCxfServerImpl implements  myCxfServer{

    @Override
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
