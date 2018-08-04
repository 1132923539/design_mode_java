package responsibility_chain.demo_middle;

/**
 * Author by eltons,  Date on 2018-08-04.
 */
public class PositiveFilter implements Filter {

    @Override
    public String process(String msg) {
        String s = msg.replace("傻", "x")
                .replace("骂", "x");
        return s;
    }
}
