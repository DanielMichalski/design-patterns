package polecenie.pj;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class FindCommand extends ComandImpl implements Serializable {
    public FindCommand() {
    }

    @Override
    public void execute() {
        clearResult();
        String regex = (String) getParameter("regex");
        String input = (String) getParameter("input");
        if (regex == null || input == null) {
            setStatusCode(1);
            return;
        }
        Pattern pattern;
        try {
            pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            setStatusCode(2);
            return;
        }
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();
        if (!found)
            setStatusCode(3);
        else {
            setStatusCode(0);
            addResult("\"" + matcher.group() + "\"" + " " +
                    matcher.start() + " " +
                    matcher.end());
        }
        while (matcher.find()) ;
    }
}
