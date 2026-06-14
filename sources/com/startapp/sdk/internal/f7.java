package com.startapp.sdk.internal;

import android.content.Context;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class f7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f64486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f64487c;

    public f7(Context context, String str, Serializable serializable) {
        this.f64485a = context;
        this.f64486b = str;
        this.f64487c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7.a(this.f64485a, this.f64486b, this.f64487c);
    }
}
