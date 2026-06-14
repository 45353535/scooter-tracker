package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes12.dex */
public abstract class N9 {
    public static final H9 a(int i10, String str) {
        byte[] bytes;
        H9 h92 = new H9();
        h92.f75853a = i10;
        if (str == null || (bytes = str.getBytes(Charsets.UTF_8)) == null) {
            bytes = h92.f75854b;
        }
        h92.f75854b = bytes;
        return h92;
    }
}
