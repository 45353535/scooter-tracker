package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f78982a;

    public V(InterfaceC5615i interfaceC5615i) {
        this.f78982a = interfaceC5615i.a();
    }

    public final void a(C5618l c5618l) {
        for (T t10 : this.f78982a) {
            C5619m c5619m = null;
            if (c5618l != null) {
                C5618l c5618l2 = c5618l.f79028a ? c5618l : null;
                if (c5618l2 != null) {
                    c5619m = c5618l2.f79029b;
                }
            }
            t10.a(c5619m);
        }
    }
}
