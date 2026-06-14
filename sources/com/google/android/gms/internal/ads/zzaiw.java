package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaiw implements zzao {
    public final List zza;

    public zzaiw(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzaiv) list.get(0)).zzb;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((zzaiv) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((zzaiv) list.get(i10)).zzb;
                    i10++;
                }
            }
        }
        zzgrc.zza(!z10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaiw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        n.a(this, zzamVar);
    }
}
