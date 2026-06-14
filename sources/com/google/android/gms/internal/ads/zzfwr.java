package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfwr {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbch zzd;

    public zzfwr(@NonNull Context context, zzbch zzbchVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfws.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfws.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbchVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb2.append("FBAMTD");
        sb2.append(iZza);
        return sb2.toString();
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 6);
        sb2.append("LATMTD");
        sb2.append(iZza);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzbcj r9, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfwx r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwr.zza(com.google.android.gms.internal.ads.zzbcj, com.google.android.gms.internal.ads.zzfwx):boolean");
    }

    @Nullable
    public final zzfwq zzb(int i10) {
        zzbcp zzbcpVarZzc = zzc(1);
        if (zzbcpVarZzc == null) {
            return null;
        }
        String strZza = zzbcpVarZzc.zza();
        File fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfws.zza(strZza, "pcam", zzd());
        }
        return new zzfwq(zzbcpVarZzc, fileZza, zzfws.zza(strZza, "pcbc", zzd()), zzfws.zza(strZza, "pcopt", zzd()));
    }

    @Nullable
    @VisibleForTesting
    final zzbcp zzc(int i10) {
        String string = i10 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzian zzianVar = zzian.zza;
            zzbcp zzbcpVarZzg = zzbcp.zzg(zzian.zzs(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzbcpVarZzg.zza();
            File fileZza = zzfws.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfws.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfws.zza(strZza, "pcbc", zzd());
            if (fileZza.exists()) {
                if (fileZza2.exists()) {
                    return zzbcpVarZzg;
                }
            }
        } catch (zzicg unused) {
        }
        return null;
    }
}
