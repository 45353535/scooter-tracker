package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5500vh extends Wg {
    public C5500vh(C5058e5 c5058e5) {
        super(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        ((C5388r5) this.f76636a.f77077p).e();
        Wk wk = this.f76636a.f77071j;
        synchronized (wk) {
            try {
                Ik ikB = wk.b(w52);
                if (ikB.f75958g) {
                    ikB.f75958g = false;
                    Zk zk = ikB.f75953b;
                    zk.a(Zk.f76766i, Boolean.FALSE);
                    zk.b();
                }
                if (wk.f76645g != 1) {
                    wk.b(wk.f76644f, w52);
                }
                wk.f76645g = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
