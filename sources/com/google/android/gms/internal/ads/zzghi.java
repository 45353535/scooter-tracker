package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzghi {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgfe zzc;
    private final String zzd;

    zzghi(Context context, zzgoe zzgoeVar, zzgfe zzgfeVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgfeVar;
        this.zzd = zzgbfVar.zzb();
    }

    public final String zza(boolean z10, long j10) {
        String string;
        zzgoc zzgocVarZza = this.zzb.zza(55);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    zzaxp zzaxpVarZza = zzaxq.zza();
                    zzaxpVarZza.zzb(this.zzd);
                    zzaxpVarZza.zza("0.825731049");
                    zzaxpVarZza.zzd(this.zza.getPackageName());
                    zzaxpVarZza.zzc(System.currentTimeMillis() / 1000);
                    zzaxpVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
                    try {
                        zzaxpVarZza.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzaxpVarZza.zze(-1L);
                    }
                    zzgfe zzgfeVar = this.zzc;
                    if (!zzgfeVar.zzc()) {
                        zzgfeVar.zza();
                    }
                    zzaxw zzaxwVarZzf = zzgfeVar.zzf(((zzaxq) zzaxpVarZza.zzbu()).zzaN(), null);
                    zzaxwVarZzf.zzc(5);
                    zzaxwVarZzf.zzd(2);
                    string = zzgca.zza(((zzaxx) zzaxwVarZzf.zzbu()).zzaN(), true);
                } catch (Throwable th2) {
                    zzgocVarZza.zzb(th2);
                    throw th2;
                }
            } catch (UnsupportedEncodingException e10) {
                zzgocVarZza.zzb(e10);
                string = Integer.toString(7);
            }
            zzgocVarZza.zzc();
            return string;
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            throw th3;
        }
    }
}
