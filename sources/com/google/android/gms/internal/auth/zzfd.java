package com.google.android.gms.internal.auth;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfd extends zzdq implements RandomAccess, zzfe {
    public static final zzfe zza;
    private static final zzfd zzb;
    private final List zzc;

    static {
        zzfd zzfdVar = new zzfd(10);
        zzb = zzfdVar;
        zzfdVar.zzb();
        zza = zzfdVar;
    }

    public zzfd() {
        this(10);
    }

    private static String zzh(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzee ? ((zzee) obj).zzm(zzez.zzb) : zzez.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzfe) {
            collection = ((zzfe) collection).zzg();
        }
        boolean zAddAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object objRemove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzh(objRemove);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzh(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.zzc);
        return new zzfd(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final zzfe zze() {
        return zzc() ? new zzhd(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzee) {
            zzee zzeeVar = (zzee) obj;
            String strZzm = zzeeVar.zzm(zzez.zzb);
            if (zzeeVar.zzh()) {
                this.zzc.set(i10, strZzm);
            }
            return strZzm;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzez.zzh(bArr);
        if (zzez.zzi(bArr)) {
            this.zzc.set(i10, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final List zzg() {
        return DesugarCollections.unmodifiableList(this.zzc);
    }

    public zzfd(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzfd(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
