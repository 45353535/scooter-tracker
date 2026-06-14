package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfsj {
    public static zzfsj zze(zzfsk zzfskVar, zzfsl zzfslVar) {
        zzfuh.zza();
        return new zzfsn(zzfskVar, zzfslVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(@Nullable View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfsq zzfsqVar, @Nullable String str);
}
