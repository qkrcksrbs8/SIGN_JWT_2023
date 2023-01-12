package cg.park.sign_jwt_2023.comm.util;

import java.util.HashMap;

public class Param extends HashMap {

    public Param() {}
    public Param(Object obj) {
        super.put("data", obj);
    }
    public Param(String key, String value) {
        super.put(key, value);
    }

    public Param set(String key, String value) {
        super.put(key, value);
        return this;
    }
    public Param set(String key, int value) {
        super.put(key, value);
        return this;
    }
    public Param set(int key, String value) {
        super.put(key, value);
        return this;
    }
    public Param set(int key, int value) {
        super.put(key, value);
        return this;
    }
    public Param set(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
