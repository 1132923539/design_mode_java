package responsibility_chain.demo_middle;

/**
 * Author by eltons,  Date on 2018-08-04.
 */
public class HtmlFilter implements Filter {
    @Override
    public String process(String msg) {
        String s = msg.replace("<", "(")
                .replace(">", ")");

        return s;
    }
}
