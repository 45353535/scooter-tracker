package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzds extends zzdp implements List, RandomAccess {
    private static final zzdv zza = new zzdq(zzdt.zza, 0);

    zzds() {
    }

    static zzds zzi(Object[] objArr, int i10) {
        return i10 == 0 ? zzdt.zza : new zzdt(objArr, i10);
    }

    public static zzds zzj(Collection collection) {
        if (collection instanceof zzdp) {
            zzds zzdsVarZzd = ((zzdp) collection).zzd();
            if (!zzdsVarZzd.zzf()) {
                return zzdsVarZzd;
            }
            Object[] array = zzdsVarZzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (array2[i10] == null) {
                throw new NullPointerException("at index " + i10);
            }
        }
        return zzi(array2, length);
    }

    public static zzds zzk() {
        return zzdt.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!zzdl.zza(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzdl.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzdp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzdp
    int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    @Deprecated
    public final zzds zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    /* JADX INFO: renamed from: zze */
    public final zzdu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzds subList(int i10, int i11) {
        zzdm.zzc(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzdt.zza : new zzdr(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzdv listIterator(int i10) {
        zzdm.zzb(i10, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzdq(this, i10);
    }
}
