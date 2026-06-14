package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeul implements zzfav {

    @Nullable
    @VisibleForTesting
    final String zza;

    @VisibleForTesting
    final int zzb;

    public zzeul(@Nullable String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        Bundle bundle = ((zzdah) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i10 = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfjz.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
