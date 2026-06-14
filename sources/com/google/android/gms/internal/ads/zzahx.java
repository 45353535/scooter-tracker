package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public final class zzahx implements zzao {
    public final long zza;

    public zzahx(long j10) {
        this.zza = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahx.class == obj.getClass() && this.zza == ((zzahx) obj).zza;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j10 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 38);
        sb2.append("ThumbnailMetadata: presentationTimeUs=");
        sb2.append(j10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        n.a(this, zzamVar);
    }
}
