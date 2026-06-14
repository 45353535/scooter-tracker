package com.google.android.gms.common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzv {
    private String zza = null;

    @Nullable
    private Boolean zzb = null;

    @Nullable
    private Boolean zzc = null;

    private zzv() {
    }

    final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    final zzv zzb(boolean z10) {
        this.zzb = Boolean.valueOf(z10);
        return this;
    }

    final zzv zzc(boolean z10) {
        this.zzc = Boolean.valueOf(z10);
        return this;
    }

    final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }

    /* synthetic */ zzv(byte[] bArr) {
    }
}
