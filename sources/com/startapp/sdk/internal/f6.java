package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f64484b;

    public f6(Context context, ConnectivityManager connectivityManager) {
        this.f64483a = context;
        this.f64484b = connectivityManager;
    }

    public abstract int a();

    public void b() {
    }
}
