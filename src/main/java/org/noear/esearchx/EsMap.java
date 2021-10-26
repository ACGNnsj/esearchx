package org.noear.esearchx;

import java.util.LinkedHashMap;

/**
 * @author noear
 * @since 1.0.3
 */
public class EsMap extends LinkedHashMap<String,Object> {
    public EsMap set(String key, Object value) {
        put(key, value);
        return this;
    }
}
