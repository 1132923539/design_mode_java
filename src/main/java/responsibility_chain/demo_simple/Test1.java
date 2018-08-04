package responsibility_chain.demo_simple;

import org.junit.Test;

/**
 * Author by eltons,  Date on 2018-08-04.
 */

public class Test1 {
    @Test
    public void testResponsibilityChain() {

        Filter[] filters = {new StringFilter(), new PositiveFilter(), new HtmlFilter()};

        String msg = "<H1>哈哈哈哈，你是不是傻x，总是在骂人</H1>";
        for (Filter filter : filters
                ) {
            msg = filter.process(msg);
        }
        System.out.println(msg);
    }
}
