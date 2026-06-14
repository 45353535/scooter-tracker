package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzah zzahVar = this.zza;
        zzr.zzb(i10, zzahVar.size(), FirebaseAnalytics.Param.INDEX);
        return zzahVar.get(zzs(i10));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzs(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzs(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: zzi */
    public final zzah subList(int i10, int i11) {
        zzah zzahVar = this.zza;
        zzr.zzd(i10, i11, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i11, zzahVar.size() - i10).zzh();
    }
}
