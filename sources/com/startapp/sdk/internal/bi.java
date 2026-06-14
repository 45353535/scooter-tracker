package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes11.dex */
public final class bi implements bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f64320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f64321b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f64322c = Executors.newScheduledThreadPool(1, new v5("scheduler"));

    public bi(Context context) {
        this.f64320a = new WeakReference(context);
    }

    @Override // com.startapp.sdk.internal.bg
    public final boolean a(ge geVar, long j10) {
        Context context = (Context) this.f64320a.get();
        if (context == null) {
            return false;
        }
        return new zh(this, geVar, j10).a(context, geVar.f64570a, new ai(), null);
    }

    @Override // com.startapp.sdk.internal.bg
    public final synchronized boolean a(int i10) {
        Future future = (Future) this.f64321b.get(Integer.valueOf(i10));
        if (future == null) {
            return false;
        }
        this.f64321b.remove(Integer.valueOf(i10));
        return future.cancel(true);
    }
}
