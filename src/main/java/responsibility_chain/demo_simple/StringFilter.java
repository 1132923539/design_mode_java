package responsibility_chain.demo_simple;

/**
 * Author by eltons,  Date on 2018-08-04.
 */
public class StringFilter implements Filter {
    @Override
    public String process(String msg) {
        String s = msg.replace("哈哈", "呵呵");
        return s;
    }
}
