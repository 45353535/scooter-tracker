package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzajf implements zzafy {

    @Nullable
    private final zzaei zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzajf(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        int i11;
        this.zzb = sparseArray;
        this.zzc = j10;
        this.zzd = i10;
        List list = (List) sparseArray.get(i10);
        zzaei zzaeiVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                zzaje zzajeVar = (zzaje) list.get(i13);
                jArrCopyOf3[i13] = zzajeVar.zza();
                jArrCopyOf[i13] = zzajeVar.zzb();
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                zzee.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            zzaeiVar = new zzaei(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzaeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzaei zzaeiVar = this.zza;
        if (zzaeiVar != null) {
            return zzaeiVar.zzc(j10);
        }
        zzafz zzafzVar = zzafz.zza;
        return new zzafw(zzafzVar, zzafzVar);
    }
}
