package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrm {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private final String zzc;

    /* synthetic */ zzfrm(zzfrl zzfrlVar, byte[] bArr) {
        this.zza = zzfrlVar.zzb();
        this.zzb = zzfrlVar.zzc();
        this.zzc = zzfrlVar.zzd();
    }

    public final boolean equals(@Nullable Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfrm) {
            zzfrm zzfrmVar = (zzfrm) obj;
            if (this.zza.equals(zzfrmVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfrmVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }
}
