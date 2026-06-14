package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class kc implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64828b;

    public kc(Context context, String str) {
        this.f64827a = context;
        this.f64828b = str;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i10) {
        if (bitmap != null) {
            Context context = this.f64827a;
            String str = this.f64828b;
            ConcurrentHashMap concurrentHashMap = g2.f64542a;
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new f2(str, bitmap, context));
        }
    }
}
