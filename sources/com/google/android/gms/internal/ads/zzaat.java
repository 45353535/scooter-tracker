package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaat implements zzaan {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzaal[] zzd = new zzaal[100];

    public zzaat(boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized zzaal zza() {
        zzaal zzaalVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzaal[] zzaalVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzaalVar = zzaalVarArr[i11];
                if (zzaalVar == null) {
                    throw null;
                }
                zzaalVarArr[i11] = null;
            } else {
                zzaalVar = new zzaal(new byte[65536], 0);
                int i12 = this.zzb;
                zzaal[] zzaalVarArr2 = this.zzd;
                int length = zzaalVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzaal[]) Arrays.copyOf(zzaalVarArr2, length + length);
                    return zzaalVar;
                }
            }
            return zzaalVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzb(zzaal zzaalVar) {
        zzaal[] zzaalVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzaalVarArr[i10] = zzaalVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzc(@Nullable zzaam zzaamVar) {
        while (zzaamVar != null) {
            try {
                zzaal[] zzaalVarArr = this.zzd;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzaalVarArr[i10] = zzaamVar.zzd();
                this.zzb--;
                zzaamVar = zzaamVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final synchronized void zzd() {
        int i10 = this.zza;
        String str = zzfj.zza;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
