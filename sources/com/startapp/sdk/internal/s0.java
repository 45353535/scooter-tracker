package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f65234a;

    public s0(t0 t0Var) {
        this.f65234a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0 t0Var = this.f65234a;
        t0Var.getClass();
        try {
            e9.a(t0Var.f65283a, (List) t0.a(t0Var.f65284b), new TrackingParams().a("APP_PRESENCE"));
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
