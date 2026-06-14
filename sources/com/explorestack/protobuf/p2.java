package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class p2 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19303b;

    public p2(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19303b = null;
    }

    private static String g(List list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public p2(List list) {
        super(g(list));
        this.f19303b = list;
    }
}
