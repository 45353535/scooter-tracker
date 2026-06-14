package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzax {
    private final zzs zza;

    static {
        new zzaw().zze();
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzax) {
            return this.zza.equals(((zzax) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    final /* synthetic */ zzs zza() {
        return this.zza;
    }
}
