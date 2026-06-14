package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgt implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzhf zzd;

    protected zzgt(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.zzc++;
    }

    protected final void zzf(zzhf zzhfVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhz) this.zzb.get(i10)).zza(this, zzhfVar, this.zza);
        }
    }

    protected final void zzg(zzhf zzhfVar) {
        this.zzd = zzhfVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhz) this.zzb.get(i10)).zzb(this, zzhfVar, this.zza);
        }
    }

    protected final void zzh(int i10) {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhz) this.zzb.get(i11)).zzc(this, zzhfVar, this.zza, i10);
        }
    }

    protected final void zzi() {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhz) this.zzb.get(i10)).zzd(this, zzhfVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ Map zzj() {
        return b1.a(this);
    }
}
