package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zziay extends zzhzz implements RandomAccess, zzibu, zzidl {
    private static final double[] zza;
    private static final zziay zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zziay(dArr, 0, false);
    }

    zziay() {
        this(zza, 0, true);
    }

    public static zziay zzd() {
        return zzb;
    }

    private static int zzj(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
    }

    private final String zzl(int i10) {
        int i11 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length());
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdV();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i10);
            System.arraycopy(this.zzc, i10, dArr2, i12, this.zzd - i10);
            this.zzc = dArr2;
        }
        this.zzc[i10] = dDoubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zziay)) {
            return super.addAll(collection);
        }
        zziay zziayVar = (zziay) collection;
        int i10 = zziayVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.zzc;
        if (i12 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(zziayVar.zzc, 0, this.zzc, this.zzd, zziayVar.zzd);
        this.zzd = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziay)) {
            return super.equals(obj);
        }
        zziay zziayVar = (zziay) obj;
        if (this.zzd != zziayVar.zzd) {
            return false;
        }
        double[] dArr = zziayVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (Double.doubleToLongBits(this.zzc[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzk(i10);
        return Double.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzc[i11]);
            byte[] bArr = zzice.zzb;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzdV();
        zzk(i10);
        double[] dArr = this.zzc;
        double d10 = dArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdV();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i11, dArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdV();
        zzk(i10);
        double[] dArr = this.zzc;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzibu zzh(int i10) {
        if (i10 >= this.zzd) {
            return new zziay(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzf(int i10) {
        zzk(i10);
        return this.zzc[i10];
    }

    public final void zzg(double d10) {
        zzdV();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        dArr2[i11] = d10;
    }

    final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zziay(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zzc = dArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}
