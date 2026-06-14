package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;

/* JADX INFO: loaded from: classes5.dex */
interface zzcz {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.play_billing.zzbz.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzjk.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzjk.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzjk.ALTERNATIVE_BILLING_ACTION);
    }

    void zza(zziw zziwVar);

    void zzb(@Nullable zziw zziwVar, int i10);

    void zzc(zziw zziwVar, int i10, long j10);

    void zzd(zziw zziwVar, long j10, boolean z10);

    void zze(zziw zziwVar, int i10, long j10, boolean z10);

    void zzf(@Nullable zzja zzjaVar);

    void zzg(@Nullable zzja zzjaVar, int i10);

    void zzh(zzja zzjaVar, long j10, boolean z10);

    void zzi(zzji zzjiVar);

    void zzj(zzkn zzknVar);

    void zzk(@Nullable zzkr zzkrVar);
}
