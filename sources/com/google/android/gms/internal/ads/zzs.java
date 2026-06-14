package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.equals(zzsVar.zza);
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        if (sparseBooleanArray.size() != zzsVar.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            if (zzc(i10) != zzsVar.zzc(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.zza.hashCode();
        }
        SparseBooleanArray sparseBooleanArray = this.zza;
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + zzc(i10);
        }
        return size;
    }

    public final boolean zza(int i10) {
        return this.zza.get(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i10) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgrc.zzm(i10, sparseBooleanArray.size(), FirebaseAnalytics.Param.INDEX);
        return sparseBooleanArray.keyAt(i10);
    }
}
