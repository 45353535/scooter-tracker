package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5378qj implements InterfaceC5288n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5288n4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5278mj a(@NotNull Context context, @NotNull C5213k5 c5213k5, @NotNull X3 x32, @NotNull C5512w4 c5512w4) {
        Gg gg2;
        X4 x42 = new X4(x32.f76658b, x32.f76657a);
        synchronized (c5213k5) {
            gg2 = (Gg) c5213k5.f77587a.get(x42.toString());
        }
        return new C5278mj(gg2);
    }
}
