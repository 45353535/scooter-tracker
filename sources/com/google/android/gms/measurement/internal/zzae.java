package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzae {
    zzae(Context context) {
    }

    public static final boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
