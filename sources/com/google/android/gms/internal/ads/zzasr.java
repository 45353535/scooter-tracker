package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
final class zzasr {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzasr(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }

    static zzasr zza(zzass zzassVar) throws IOException {
        if (zzasu.zzi(zzassVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzasu.zzm(zzassVar);
        String strZzm2 = zzasu.zzm(zzassVar);
        long jZzk = zzasu.zzk(zzassVar);
        long jZzk2 = zzasu.zzk(zzassVar);
        long jZzk3 = zzasu.zzk(zzassVar);
        long jZzk4 = zzasu.zzk(zzassVar);
        int iZzi = zzasu.zzi(zzassVar);
        if (iZzi < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb2.append("readHeaderList size=");
            sb2.append(iZzi);
            throw new IOException(sb2.toString());
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iZzi; i10++) {
            arrayList.add(new zzarq(zzasu.zzm(zzassVar).intern(), zzasu.zzm(zzassVar).intern()));
        }
        return new zzasr(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    zzasr(String str, zzarh zzarhVar) {
        String str2 = zzarhVar.zzb;
        long j10 = zzarhVar.zzc;
        long j11 = zzarhVar.zzd;
        long j12 = zzarhVar.zze;
        long j13 = zzarhVar.zzf;
        List arrayList = zzarhVar.zzh;
        if (arrayList == null) {
            Map map = zzarhVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
