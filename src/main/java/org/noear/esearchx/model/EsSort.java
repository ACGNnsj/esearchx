package org.noear.esearchx.model;

import org.noear.snack.ONode;

/**
 * @author noear
 * @since 1.0.3
 */
public class EsSort {
    private final ONode oNode;

    public EsSort(ONode oNode) {
        this.oNode = oNode;
    }

    public EsSort andAes(String field) {
        oNode.addNew().getOrNew(field).set("order", "asc");

        return this;
    }

    public EsSort andDesc(String field) {
        oNode.addNew().getOrNew(field).set("order", "desc");

        return this;
    }
}
