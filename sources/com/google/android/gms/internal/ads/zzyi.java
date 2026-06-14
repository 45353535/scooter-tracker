package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes8.dex */
final class zzyi {
    private int zza;
    private final SparseArray zzb;
    private final zzdr zzc;

    public zzyi() {
        this(zzyh.zza);
    }

    public final Object zza(int i10) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i11 = this.zza;
            if (i11 <= 0 || i10 >= this.zzb.keyAt(i11)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i12 = this.zza;
            sparseArray = this.zzb;
            if (i12 >= sparseArray.size() - 1 || i10 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i10, Object obj) {
        if (this.zza == -1) {
            zzgrc.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzgrc.zza(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, obj);
    }

    public final Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzd(int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i11 >= sparseArray.size() - 1) {
                return;
            }
            int i12 = i11 + 1;
            if (i10 < sparseArray.keyAt(i12)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i13 = this.zza;
            if (i13 > 0) {
                this.zza = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final void zze() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i10 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i10));
                i10++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzyi(zzdr zzdrVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdrVar;
        this.zza = -1;
    }
}
