package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
class zzgsu extends zzgss implements List {
    final /* synthetic */ zzgsv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgsu(zzgsv zzgsvVar, Object obj, List list, zzgss zzgssVar) {
        super(zzgsvVar, obj, list, zzgssVar);
        Objects.requireNonNull(zzgsvVar);
        this.zzf = zzgsvVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zza();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgst(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i10);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zza();
        List listSubList = ((List) this.zzb).subList(i10, i11);
        zzgss zzgssVar = this.zzc;
        if (zzgssVar == null) {
            zzgssVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgssVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zza();
        return new zzgst(this, i10);
    }
}
