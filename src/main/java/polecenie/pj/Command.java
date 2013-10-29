package polecenie.pj;

import java.util.List;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public interface Command {
    void init();

    void setParameter(String name, Object value);

    Object getParameter(String name);

    void execute();

    List getResult();

    void setStatusCode(int code);

    int getStatusCode();
}
