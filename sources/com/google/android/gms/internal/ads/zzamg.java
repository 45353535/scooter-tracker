package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes8.dex */
public final class zzamg implements zzaex {
    private final zzaex zzb;
    private final zzamd zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzamg(zzaex zzaexVar, zzamd zzamdVar) {
        this.zzb = zzaexVar;
        this.zzc = zzamdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i10, int i11) {
        if (i11 != 3) {
            this.zze = true;
            return this.zzb.zzu(i10, i11);
        }
        SparseArray sparseArray = this.zzd;
        zzami zzamiVar = (zzami) sparseArray.get(i10);
        if (zzamiVar != null) {
            return zzamiVar;
        }
        zzami zzamiVar2 = new zzami(this.zzb.zzu(i10, 3), this.zzc);
        sparseArray.put(i10, zzamiVar2);
        return zzamiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzami) sparseArray.valueAt(i10)).zzf(true);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzb.zzw(zzafyVar);
    }
}
