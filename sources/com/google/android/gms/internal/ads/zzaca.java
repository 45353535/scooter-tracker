package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaca {
    private final Context zza;
    private boolean zzb;
    private zzuw zzc = zzuw.zzb;
    private final zzui zzd;

    @Nullable
    private Handler zze;

    @Nullable
    private zzadm zzf;

    public zzaca(Context context) {
        this.zza = context;
        this.zzd = new zzuc(context, null, null);
    }

    public final zzaca zza(zzuw zzuwVar) {
        this.zzc = zzuwVar;
        return this;
    }

    public final zzaca zzb(@Nullable Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaca zzc(@Nullable zzadm zzadmVar) {
        this.zzf = zzadmVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzacc zzd() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzgrc.zzi(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.zzadm r2 = r3.zzf
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzadm r0 = r3.zzf
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.zzgrc.zzi(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzacc r0 = new com.google.android.gms.internal.ads.zzacc
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaca.zzd():com.google.android.gms.internal.ads.zzacc");
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzuw zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzui zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzadm zzi() {
        return this.zzf;
    }
}
