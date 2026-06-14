package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzwy implements zzwi, zzwh {
    private final zzwi[] zza;
    private final boolean[] zzb;

    @Nullable
    private zzwh zzf;

    @Nullable
    private zzyn zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzye zzi = new zzvu(zzguf.zzi(), zzguf.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzwi[] zzh = new zzwi[0];

    public zzwy(zzvv zzvvVar, long[] jArr, zzwi... zzwiVarArr) {
        this.zza = zzwiVarArr;
        this.zzb = new boolean[zzwiVarArr.length];
        for (int i10 = 0; i10 < zzwiVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zzb[i10] = true;
                this.zza[i10] = new zzyk(zzwiVarArr[i10], j10);
            }
        }
    }

    public final zzwi zza(int i10) {
        return this.zzb[i10] ? ((zzyk) this.zza[i10]).zza() : this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j10) {
        this.zzf = zzwhVar;
        ArrayList arrayList = this.zzd;
        zzwi[] zzwiVarArr = this.zza;
        Collections.addAll(arrayList, zzwiVarArr);
        for (zzwi zzwiVar : zzwiVarArr) {
            zzwiVar.zzb(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        int i10 = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zza;
            if (i10 >= zzwiVarArr.length) {
                return;
            }
            zzwiVarArr[i10].zzc();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzyn zzynVar = this.zzg;
        zzynVar.getClass();
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j10) {
        int length;
        int[] iArr;
        int length2 = zzaacVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzaacVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzyc zzycVar = zzycVarArr[i11];
            Integer num = zzycVar == null ? null : (Integer) this.zzc.get(zzycVar);
            iArr2[i11] = num == null ? -1 : num.intValue();
            zzaac zzaacVar = zzaacVarArr[i11];
            if (zzaacVar != null) {
                String str = zzaacVar.zza().zzb;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzwi[] zzwiVarArr = this.zza;
        zzyc[] zzycVarArr2 = new zzyc[length];
        zzyc[] zzycVarArr3 = new zzyc[length];
        zzaac[] zzaacVarArr2 = new zzaac[length];
        ArrayList arrayList = new ArrayList(zzwiVarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < zzwiVarArr.length) {
            int i13 = i10;
            while (i13 < zzaacVarArr.length) {
                zzycVarArr3[i13] = iArr2[i13] == i12 ? zzycVarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    zzaac zzaacVar2 = zzaacVarArr[i13];
                    zzaacVar2.getClass();
                    iArr = iArr3;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzaacVar2.zza());
                    zzbgVar.getClass();
                    zzaacVarArr2[i13] = new zzwx(zzaacVar2, zzbgVar);
                } else {
                    iArr = iArr3;
                    zzaacVarArr2[i13] = null;
                }
                i13++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            long jZze = zzwiVarArr[i12].zze(zzaacVarArr2, zArr, zzycVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jZze;
            } else if (jZze != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzaacVarArr.length; i15++) {
                if (iArr4[i15] == i14) {
                    zzyc zzycVar2 = zzycVarArr3[i15];
                    zzycVar2.getClass();
                    zzycVarArr2[i15] = zzycVar2;
                    identityHashMap.put(zzycVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr2[i15] == i14) {
                    zzgrc.zzi(zzycVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(zzwiVarArr[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzycVarArr2, i16, zzycVarArr, i16, length);
        this.zzh = (zzwi[]) arrayList3.toArray(new zzwi[i16]);
        this.zzi = new zzvu(arrayList3, zzgvf.zzc(arrayList3, zzww.zza));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j10, boolean z10) {
        for (zzwi zzwiVar : this.zzh) {
            zzwiVar.zzf(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j10) {
        this.zzi.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long j10 = -9223372036854775807L;
        for (zzwi zzwiVar : this.zzh) {
            long jZzh = zzwiVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && zzwiVar.zzj(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (zzwi zzwiVar2 : this.zzh) {
                    if (zzwiVar2 == zzwiVar) {
                        break;
                    }
                    if (zzwiVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzh;
            } else if (jZzh != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j10) {
        long jZzj = this.zzh[0].zzj(j10);
        int i10 = 1;
        while (true) {
            zzwi[] zzwiVarArr = this.zzh;
            if (i10 >= zzwiVarArr.length) {
                return jZzj;
            }
            if (zzwiVarArr[i10].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j10, zzmt zzmtVar) {
        zzwi[] zzwiVarArr = this.zzh;
        return (zzwiVarArr.length > 0 ? zzwiVarArr[0] : this.zza[0]).zzk(j10, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzllVar);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzwi) arrayList.get(i10)).zzm(zzllVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzwiVar);
        if (arrayList.isEmpty()) {
            zzwi[] zzwiVarArr = this.zza;
            int i10 = 0;
            for (zzwi zzwiVar2 : zzwiVarArr) {
                i10 += zzwiVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zzwiVarArr.length; i12++) {
                zzyn zzynVarZzd = zzwiVarArr[i12].zzd();
                int i13 = zzynVarZzd.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbg zzbgVarZza = zzynVarZzd.zza(i14);
                    int i15 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        zzv zzvVarZza = zzbgVarZza.zza(i16);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 1 + str.length());
                        sb2.append(i12);
                        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        sb2.append(str);
                        zztVarZza.zza(sb2.toString());
                        zzvVarArr[i16] = zztVarZza.zzM();
                        i16++;
                        zzwiVarArr = zzwiVarArr;
                    }
                    zzwi[] zzwiVarArr2 = zzwiVarArr;
                    String str2 = zzbgVarZza.zzb;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str2).length());
                    sb3.append(i12);
                    sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb3.append(str2);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    zzbgVarArr[i11] = zzbgVar;
                    i14++;
                    i11++;
                    zzwiVarArr = zzwiVarArr2;
                }
            }
            this.zzg = new zzyn(zzbgVarArr);
            zzwh zzwhVar = this.zzf;
            zzwhVar.getClass();
            zzwhVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
