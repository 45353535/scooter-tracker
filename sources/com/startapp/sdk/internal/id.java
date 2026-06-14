package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public final class id implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f64692a;

    public id(od odVar) {
        this.f64692a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f64692a;
        if (odVar.f65030o || odVar.f65022g) {
            return;
        }
        try {
            odVar.f65022g = true;
            h0.d(odVar.f65016a);
            if (odVar.f65026k && MetaData.E().i0()) {
                h0.a(odVar.f65016a, odVar.f65020e);
            } else {
                h0.b(odVar.f65016a, odVar.f65020e);
            }
            Runnable runnable = odVar.f65029n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
