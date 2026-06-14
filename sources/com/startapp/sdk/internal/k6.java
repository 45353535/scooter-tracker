package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f64818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f64819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f64820d;

    public k6(Context context) {
        this.f64817a = context;
        this.f64820d = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object objA = this.f64818b;
        if (objA == null || this.f64819c + this.f64820d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    objA = this.f64818b;
                    boolean z10 = this.f64819c + this.f64820d < SystemClock.uptimeMillis();
                    if (objA == null || z10) {
                        try {
                            objA = a(z10);
                        } catch (Throwable th2) {
                            if (!vi.a(th2, RemoteException.class)) {
                                g9.a(th2);
                            }
                        }
                        if (objA != null) {
                            this.f64818b = objA;
                            this.f64819c = SystemClock.uptimeMillis();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return objA != null ? objA : c();
    }

    public abstract Object c();

    public Object a(boolean z10) {
        return a();
    }

    public k6(Context context, long j10) {
        this.f64817a = context;
        this.f64820d = j10;
    }
}
