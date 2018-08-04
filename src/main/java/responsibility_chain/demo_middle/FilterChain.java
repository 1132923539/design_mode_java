package responsibility_chain.demo_middle;

import java.util.ArrayList;
import java.util.List;

/**
 * Author by eltons,  Date on 2018-08-04.
 */

/**
 * 这里的FilterChain实现了Filter接口，因此这个FilterChain也可以看做是一个大的Filter
 * 也即是说FilterChain对象不仅可以添加Filter、同事时可以添加FilterChain
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<Filter>();

    //add完仍然返回FilterChain,因此可以链式编程
    public FilterChain add(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public String process(String msg) {
        for (Filter filter : filters
                ) {
            msg = filter.process(msg);
        }
        return msg;
    }
}
