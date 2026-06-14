package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbb {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    zzbb(zzic zzicVar, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzicVar.zzaV().zze().zzb("Event created with reverse previous/current timestamps. appId", zzgu.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzicVar.zzaV().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzE = zzicVar.zzk().zzE(next, bundle2.get(next));
                    if (objZzE == null) {
                        zzicVar.zzaV().zze().zzb("Param value can't be null", zzicVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzicVar.zzk().zzM(bundle2, next, objZzE);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.zzf = zzbeVar;
    }

    public final String toString() {
        String string = this.zzf.toString();
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    final zzbb zza(zzic zzicVar, long j10) {
        return new zzbb(zzicVar, this.zzc, this.zza, this.zzb, this.zzd, j10, this.zzf);
    }

    private zzbb(zzic zzicVar, String str, String str2, String str3, long j10, long j11, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j10;
        this.zze = j11;
        if (j11 != 0 && j11 > j10) {
            zzicVar.zzaV().zze().zzc("Event created with reverse previous/current timestamps. appId, name", zzgu.zzl(str2), zzgu.zzl(str3));
        }
        this.zzf = zzbeVar;
    }
}
