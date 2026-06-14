package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgan {
    private static zzgan zzb;
    final zzgaj zza;

    private zzgan(Context context) {
        this.zza = zzgaj.zza(context);
        zzgai.zza(context);
    }

    public static final zzgan zza(Context context) {
        zzgan zzganVar;
        synchronized (zzgan.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgan(context);
                }
                zzganVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzganVar;
    }

    public final void zzb(@Nullable zzgah zzgahVar) throws IOException {
        synchronized (zzgan.class) {
            zzgaj zzgajVar = this.zza;
            zzgajVar.zzf("vendor_scoped_gpid_v2_id");
            zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
