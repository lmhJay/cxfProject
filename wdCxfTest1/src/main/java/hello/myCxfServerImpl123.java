package hello;

import javax.jws.WebService;
import java.math.BigDecimal;

@WebService
public class myCxfServerImpl123 implements  myCxfServer{

    @Override
    public String sayHello(String name) {
        return "hello ,"+name;
    }

    @Override
    public Double add(Double a, Double b) {
        BigDecimal aa = new BigDecimal(a.toString());
        BigDecimal bb = new BigDecimal(b.toString());
        return new Double(aa.add(bb).doubleValue());
    }
}
