package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Sk {
    public static void a(boolean z10) {
        Ji.f37160d.set(z10);
        if (z10) {
            ((C4155xc) Ji.f37161e.getValue()).b(new I2(101, 6, (String) null));
        } else {
            ((C4155xc) Ji.f37161e.getValue()).b(new I2(102, 6, (String) null));
        }
        Rk runnable = new Rk(z10, null);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        eg.i.d(Ji.f37164h, null, null, new Ii(runnable, null), 3, null);
    }
}
