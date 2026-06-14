package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class O2 implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    public final so a(Object obj) {
        C5155ho[] c5155hoArr = ((C5232ko) obj).f77633a;
        return (c5155hoArr == null || c5155hoArr.length == 0) ? new so(this, false, "attributes list is empty") : new so(this, true, "");
    }
}
