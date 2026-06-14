package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Hh implements InterfaceC5288n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5084f5 f75868a;

    public Hh(@NotNull InterfaceC5084f5 interfaceC5084f5) {
        this.f75868a = interfaceC5084f5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5288n4
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fg a(@NotNull Context context, @NotNull C5213k5 c5213k5, @NotNull X3 x32, @NotNull C5512w4 c5512w4) {
        Gg gg2;
        X4 x42 = new X4(x32.f76658b, x32.f76657a);
        Hg hg2 = new Hg(this.f75868a);
        synchronized (c5213k5) {
            gg2 = (Gg) c5213k5.a(x42, c5512w4, hg2, c5213k5.f77587a);
        }
        return new Fg(context, gg2);
    }
}
