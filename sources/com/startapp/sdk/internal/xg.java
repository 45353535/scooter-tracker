package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class xg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65554a;

    public xg(Context context) {
        this.f65554a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.adsbase.g.e(this.f65554a);
    }
}
