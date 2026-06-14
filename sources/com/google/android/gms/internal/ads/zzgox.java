package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgox {
    @SuppressLint({"RestrictedApi"})
    public static zzgow zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzgoy(new zzgpo(context));
    }
}
