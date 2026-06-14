package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX INFO: loaded from: classes11.dex */
public final class gd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f64569a;

    public gd(od odVar) {
        this.f64569a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f64569a;
        if (odVar.f65022g) {
            return;
        }
        try {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "Failed smart redirect hop info: ".concat(odVar.f65031p ? "Page Finished" : AndroidInitializeBoldSDK.MSG_TIMEOUT);
            g9Var.f64555f = odVar.b();
            g9Var.f64556g = odVar.f65021f;
            g9Var.a();
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            odVar.f65030o = true;
            h0.d(odVar.f65016a);
            odVar.a();
            if (odVar.f65026k && MetaData.E().i0()) {
                h0.a(odVar.f65016a, odVar.f65020e);
            } else {
                h0.b(odVar.f65016a, odVar.f65020e);
            }
            Runnable runnable = odVar.f65029n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }
}
