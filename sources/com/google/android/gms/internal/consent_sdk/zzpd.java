package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzpd extends zzpb implements RandomAccess, zzqr {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzpd(zArr, 0, false);
    }

    zzpd() {
        this(zza, 0, true);
    }

    private static int zzf(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzg(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzc;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[zzf(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i10);
            System.arraycopy(this.zzb, i10, zArr2, i12, this.zzc - i10);
            this.zzb = zArr2;
        }
        this.zzb[i10] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzqs.zzb;
        collection.getClass();
        if (!(collection instanceof zzpd)) {
            return super.addAll(collection);
        }
        zzpd zzpdVar = (zzpd) collection;
        int i10 = zzpdVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.zzb;
        if (i12 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(zzpdVar.zzb, 0, this.zzb, this.zzc, zzpdVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpd)) {
            return super.equals(obj);
        }
        zzpd zzpdVar = (zzpd) obj;
        if (this.zzc != zzpdVar.zzc) {
            return false;
        }
        boolean[] zArr = zzpdVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iZza = (iZza * 31) + zzqs.zza(this.zzb[i10]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqr
    public final /* bridge */ /* synthetic */ zzqr zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzpd(i10 == 0 ? zza : Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zze(int i10) {
        zzh(i10);
        return this.zzb[i10];
    }

    private zzpd(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        int i10 = this.zzc;
        int length = this.zzb.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[zzf(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr2[i11] = zBooleanValue;
        return true;
    }
}
