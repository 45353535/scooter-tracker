package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeuf implements zzfav {

    @Nullable
    @VisibleForTesting
    final ArrayList zza;

    public zzeuf(@Nullable ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfjz.zzg(((zzdah) obj).zza, "android_permissions", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
