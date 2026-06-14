package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes5.dex */
final class zzde {
    static void zza(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i10, int i11) {
        int i12 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i10, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), i11);
    }

    static void zzb(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i10, int i11, @Nullable String str) {
        int i12 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i10, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), i11);
    }
}
