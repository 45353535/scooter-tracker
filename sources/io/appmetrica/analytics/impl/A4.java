package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public abstract class A4 extends Hd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f75492f;

    public A4(int i10, String str, Object obj, uo uoVar, R2 r22) {
        super(i10, str, uoVar, r22);
        this.f75492f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Hd, io.appmetrica.analytics.impl.InterfaceC5129go
    public final void a(@NonNull C5103fo c5103fo) {
        if (f()) {
            R2 r22 = this.f75865d;
            int i10 = this.f75863b;
            C5155ho c5155hoA = r22.a(c5103fo, (C5155ho) ((HashMap) c5103fo.f77187a.get(i10)).get(this.f75862a), this);
            if (c5155hoA != null) {
                a(c5155hoA);
            }
        }
    }

    public abstract void a(@NonNull C5155ho c5155ho);

    @NonNull
    public final Object g() {
        return this.f75492f;
    }
}
