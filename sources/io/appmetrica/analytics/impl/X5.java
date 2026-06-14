package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class X5 extends A4 {
    public X5(@NonNull String str, double d10) {
        super(2, str, Double.valueOf(d10), new C5544xb(), new C5587z4(new Nb(new C5437t4(100))));
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(@NonNull C5155ho c5155ho) {
        C5206jo c5206jo = c5155ho.f77358d;
        c5206jo.f77575c = ((Double) this.f75492f).doubleValue() + c5206jo.f77575c;
    }
}
