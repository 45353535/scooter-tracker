package com.startapp.sdk.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f64865a = new Exception();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile k7 f64866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f64867c;

    public lb(k7 k7Var) {
        this.f64866b = k7Var;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f64867c;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f64867c;
                if (objA == null) {
                    k7 k7Var = this.f64866b;
                    this.f64866b = null;
                    if (k7Var == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("3");
                        illegalStateException.addSuppressed(this.f64865a);
                        throw illegalStateException;
                    }
                    try {
                        objA = k7Var.a();
                        if (objA == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException("2");
                            illegalStateException2.addSuppressed(this.f64865a);
                            throw illegalStateException2;
                        }
                        this.f64867c = objA;
                    } catch (Error e10) {
                        e = e10;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(this.f64865a);
                        throw e;
                    } catch (RuntimeException e11) {
                        e = e11;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(this.f64865a);
                        throw e;
                    }
                }
            } finally {
            }
        }
        return objA;
    }
}
