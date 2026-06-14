package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class o6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f64993b;

    public o6(Context context, k kVar) {
        this.f64992a = context;
        this.f64993b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f64992a;
            g7.a(new File(g7.b(context, "startapp_ads")));
            g7.a(new File(g7.a(context, "startapp_ads")));
            new Handler(Looper.getMainLooper()).post(new n6(this));
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
