package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5143hc implements InterfaceC5288n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5288n4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B4 a(@NotNull Context context, @NotNull C5213k5 c5213k5, @NotNull X3 x32, @NotNull C5512w4 c5512w4) {
        E4 e42;
        C4 c42 = new C4(x32.f76658b);
        F4 f42 = new F4();
        synchronized (c5213k5) {
            e42 = (E4) c5213k5.a(c42, c5512w4, f42, c5213k5.f77588b);
        }
        return new B4(context, e42, c5512w4);
    }
}
