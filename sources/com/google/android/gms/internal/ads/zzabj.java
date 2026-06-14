package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabj {
    private static final Comparator zza = zzabi.zza;
    private static final Comparator zzb = zzabh.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabg[] zzd = new zzabg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabj(int i10) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i10, float f10) {
        zzabg zzabgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzabg[] zzabgVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzabgVar = zzabgVarArr[i12];
        } else {
            zzabgVar = new zzabg(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzabgVar.zza = i13;
        zzabgVar.zzb = i10;
        zzabgVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabgVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 + C.PRIORITY_PROCESSING_FOREGROUND;
            zzabg zzabgVar2 = (zzabg) arrayList.get(0);
            int i16 = zzabgVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzabg[] zzabgVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzabgVarArr2[i17] = zzabgVar2;
                }
            } else {
                zzabgVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final float zzc(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzabg zzabgVar = (zzabg) arrayList.get(i10);
            i11 += zzabgVar.zzb;
            if (i11 >= f12) {
                return zzabgVar.zzc;
            }
            i10++;
        }
    }
}
