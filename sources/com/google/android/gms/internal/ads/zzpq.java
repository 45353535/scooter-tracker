package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpq {
    public static final zzpq zza;
    public final String zzb;

    @Nullable
    private final zzpp zzc;

    static {
        new zzpq("");
        zza = new zzpq("preload");
    }

    public zzpq(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpp() : null;
    }

    @RequiresApi(31)
    public final synchronized LogSessionId zza() {
        zzpp zzppVar;
        zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        return zzppVar.zza;
    }

    @RequiresApi(31)
    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpp zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        zzgrc.zzi(zzppVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzppVar.zza = logSessionId;
    }
}
