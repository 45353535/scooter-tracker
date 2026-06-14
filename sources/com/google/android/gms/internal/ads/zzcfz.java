package com.google.android.gms.internal.ads;

import android.os.Looper;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcfz implements Runnable {
    zzcfz(zzcgb zzcgbVar) {
        Objects.requireNonNull(zzcgbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
