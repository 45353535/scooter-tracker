package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5303nj implements InterfaceC5288n4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5288n4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5278mj a(@NotNull Context context, @NotNull C5213k5 c5213k5, @NotNull X3 x32, @NotNull C5512w4 c5512w4) {
        Gg gg2;
        C5470uc c5470uc = new C5470uc(x32.f76658b, x32.f76657a);
        synchronized (c5213k5) {
            gg2 = (Gg) c5213k5.f77587a.get(c5470uc.toString());
        }
        return new C5278mj(gg2);
    }
}
