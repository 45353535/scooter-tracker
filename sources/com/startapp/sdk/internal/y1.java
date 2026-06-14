package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f65590b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f65592d = new Runnable() { // from class: com.startapp.sdk.internal.jn
        @Override // java.lang.Runnable
        public final void run() {
            this.f64807b.a();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f65591c = new Handler(Looper.getMainLooper());

    public y1(Context context, zd zdVar) {
        this.f65589a = context;
        this.f65590b = new x1(this, zdVar);
    }

    public abstract void a();
}
