package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbgx {
    @Nullable
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
            return null;
        }
    }

    @Nullable
    public static final SharedPreferences zzb(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
            return null;
        }
    }
}
