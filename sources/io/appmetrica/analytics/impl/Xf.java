package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Xf implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final so a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new so(this, true, "");
        }
        return new so(this, false, "Invalid quantity value " + num);
    }
}
