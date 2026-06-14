package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzaoa implements zzama {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaoa(List list) {
        this.zza = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzanq zzanqVar = (zzanq) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzanqVar.zzb;
            jArr[i11 + 1] = zzanqVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final long zzb(int i10) {
        zzgrc.zza(i10 >= 0);
        long[] jArr = this.zzc;
        zzgrc.zza(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzanq zzanqVar = (zzanq) list.get(i10);
                zzcx zzcxVar = zzanqVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzanqVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, zzanz.zza);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcw zzcwVarZza = ((zzanq) arrayList2.get(i12)).zza.zza();
            zzcwVarZza.zzf((-1) - i12, 1);
            arrayList.add(zzcwVarZza.zzr());
        }
        return arrayList;
    }
}
