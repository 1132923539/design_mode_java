package responsibility_chain;

/**
 * Author by eltons,  Date on 2018-08-04.
 */
public class HtmlFilter implements responsibility_chain.Filter {
    @Override
    public String process(String msg) {
        String s = msg.replace("<", "(")
                .replace(">", ")");

        return s;
    }
}
