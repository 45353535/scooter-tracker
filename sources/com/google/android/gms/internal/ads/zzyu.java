package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyu extends zzyw {
    protected zzyu(zzbg zzbgVar, int[] iArr, int i10, zzaas zzaasVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzguf.zzq(list);
    }

    static /* synthetic */ zzguf zzd(zzaab[] zzaabVarArr) {
        int i10;
        long[][] jArr;
        int i11 = 1;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            zzaab zzaabVar = zzaabVarArr[i13];
            if (zzaabVar == null || zzaabVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                zzgucVar.zzf(new zzys(0L, 0L));
                arrayList.add(zzgucVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzaab zzaabVar2 = zzaabVarArr[i15];
            if (zzaabVar2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = zzaabVar2.zzb;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = zzaabVar2.zza.zza(iArr[i16]).zzj;
                    long[] jArr3 = jArr2[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i16] = j10;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgva zzgvaVarZza = zzgvu.zzc(zzgvz.zzb()).zzb(2).zza();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i11) {
                i10 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19 += i11;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i10 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i10];
                int i22 = i10;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22 += i11;
                    zzgvaVarZza.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i10]) / d10), Integer.valueOf(i18));
                    i11 = i11;
                }
            }
            i18++;
            i12 = i10;
            jArr2 = jArr;
            i11 = i11;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        zzguf zzgufVarZzq = zzguf.zzq(zzgvaVarZza.zzt());
        while (i12 < zzgufVarZzq.size()) {
            int iIntValue = ((Integer) zzgufVarZzq.get(i12)).intValue();
            int i24 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i24;
            jArr4[iIntValue] = jArr8[iIntValue][i24];
            zzi(arrayList, jArr4);
            i12++;
        }
        for (int i25 = i23; i25 < 2; i25++) {
            if (arrayList.get(i25) != null) {
                long j12 = jArr4[i25];
                jArr4[i25] = j12 + j12;
            }
        }
        zzi(arrayList, jArr4);
        zzguc zzgucVar2 = new zzguc();
        for (int i26 = i23; i26 < arrayList.size(); i26++) {
            zzguc zzgucVar3 = (zzguc) arrayList.get(i26);
            zzgucVar2.zzf(zzgucVar3 == null ? zzguf.zzi() : zzgucVar3.zzi());
        }
        return zzgucVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzguc zzgucVar = (zzguc) list.get(i11);
            if (zzgucVar != null) {
                zzgucVar.zzf(new zzys(j10, jArr[i11]));
            }
        }
    }
}
