package polecenie.pj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class ComandImpl implements Serializable, Command {
    private Map<String, Object> parameterMap = new HashMap<String, Object>();
    private List<Object> resultList = new ArrayList<Object>();

    private int statusCode;

    public ComandImpl() {
    }

    @Override
    public void init() {
    }

    @Override
    public void setParameter(String name, Object value) {
        parameterMap.put(name, value);
    }

    @Override
    public Object getParameter(String name) {
        return parameterMap.get(name);
    }

    @Override
    public void execute() {
    }

    @Override
    public List getResult() {
        return resultList;
    }

    public void addResult(Object o) {
        resultList.add(o);
    }

    public void addResult(String s) {
        addResult(new Object[]{s});
    }

    public void clearResult() {
        resultList.clear();
    }

    @Override
    public void setStatusCode(int code) {
        statusCode = code;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }
}
