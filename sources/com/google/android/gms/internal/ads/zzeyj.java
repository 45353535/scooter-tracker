package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeyj implements zzfav {

    @Nullable
    private final Boolean zza;

    public zzeyj(@Nullable Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Boolean bool = this.zza;
        if (bool == null) {
            bundle.putInt("lft", -1);
        } else if (bool.booleanValue()) {
            bundle.putInt("lft", 1);
        } else {
            bundle.putInt("lft", 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
