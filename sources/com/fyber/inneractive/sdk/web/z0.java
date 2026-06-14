package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends LruCache {
    public z0() {
        super(1048576);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        c1 c1Var = (c1) obj2;
        int length = 0;
        for (String str2 : c1Var.f23937b.keySet()) {
            if (str2 != null && (str = (String) c1Var.f23937b.get(str2)) != null) {
                length += str.length() + str2.length();
            }
        }
        return length + c1Var.f23936a.length;
    }
}
