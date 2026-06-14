package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgam extends zzgak {
    private static zzgam zzd;

    private zzgam(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgam zzh(Context context) {
        zzgam zzgamVar;
        synchronized (zzgam.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgam(context);
                }
                zzgamVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgamVar;
    }

    public final zzgah zzi(long j10, boolean z10) throws IOException {
        synchronized (zzgam.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j10, z10);
                }
                return new zzgah();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgam.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
