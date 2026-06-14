package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzaag extends zzaaj {
    protected abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzp(@Nullable Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        List[] listArr;
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzynVar.zzb;
            zzbgVarArr[i10] = new zzbg[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzmnVarArr[i13].zzu();
        }
        int i14 = 0;
        while (i14 < zzynVar.zzb) {
            zzbg zzbgVarZza = zzynVar.zza(i14);
            int i15 = zzbgVarZza.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                zzmn zzmnVar = zzmnVarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < zzbgVarZza.zza; i19++) {
                    iMax = Math.max(iMax, zzmnVar.zzab(zzbgVarZza.zza(i19)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = iMax;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i16];
                int i20 = zzbgVarZza.zza;
                int[] iArr5 = new int[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr5[i21] = zzmnVar2.zzab(zzbgVarZza.zza(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzbgVarArr[i16][i22] = zzbgVarZza;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzyn[] zzynVarArr = new zzyn[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzynVarArr[i23] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzfj.zzb(iArr3[i23], i24);
            strArr[i23] = zzmnVarArr[i23].zzS();
            iArr6[i23] = zzmnVarArr[i23].zza();
            i23++;
            i12 = 2;
        }
        int i25 = i12;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i25], iArr2[i25])));
        Pair pairZzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) pairZzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i26 = 0; i26 < zzaahVarArr.length; i26++) {
            zzaah zzaahVar = zzaahVarArr[i26];
            listArr2[i26] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        for (int i27 = 0; i27 < 2; i27++) {
            zzyn zzynVarZzb = zzaafVar.zzb(i27);
            List list = listArr2[i27];
            int i28 = 0;
            while (i28 < zzynVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzynVarZzb.zza(i28);
                boolean z13 = zzaafVar.zzd(i27, i28, false) != 0;
                int i29 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i29];
                boolean[] zArr = new boolean[i29];
                int i30 = 0;
                while (i30 < i29) {
                    iArr7[i30] = zzaafVar.zzc(i27, i28, i30) & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            listArr = listArr2;
                            z10 = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i31);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zzbgVarZza2) && zzaahVar2.zzg(i30) != -1) {
                            z10 = true;
                            break;
                        }
                        i31++;
                        listArr2 = listArr;
                    }
                    zArr[i30] = z10;
                    i30++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zzbgVarZza2, z13, iArr7, zArr));
                i28++;
                listArr2 = listArr2;
            }
        }
        zzyn zzynVarZze = zzaafVar.zze();
        for (int i32 = 0; i32 < zzynVarZze.zzb; i32++) {
            zzbg zzbgVarZza3 = zzynVarZze.zza(i32);
            int i33 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i33];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i33]));
        }
        return new zzaak((zzmo[]) pairZzh.first, (zzaac[]) pairZzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}
