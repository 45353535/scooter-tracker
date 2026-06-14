package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzzk extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzzk() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzzk zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final zzzk zzy(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i10) == z10) {
            return this;
        }
        if (z10) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzzk(zzzl zzzlVar, byte[] bArr) {
        super(zzzlVar);
        this.zza = zzzlVar.zzK;
        this.zzb = zzzlVar.zzM;
        this.zzc = zzzlVar.zzO;
        this.zzd = zzzlVar.zzT;
        this.zze = zzzlVar.zzU;
        this.zzf = zzzlVar.zzV;
        this.zzg = zzzlVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzzlVar.zze();
            if (i10 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i10), new HashMap((Map) sparseArrayZze.valueAt(i10)));
                i10++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzzlVar.zzf().clone();
                return;
            }
        }
    }
}
