package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes8.dex */
final class zzibi extends zzhzz implements RandomAccess, zziby, zzidl {
    private static final float[] zza;
    private static final zzibi zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzibi(fArr, 0, false);
    }

    zzibi() {
        this(zza, 0, true);
    }

    public static zzibi zzd() {
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
        float fFloatValue = ((Float) obj).floatValue();
        zzdV();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i10);
            System.arraycopy(this.zzc, i10, fArr2, i12, this.zzd - i10);
            this.zzc = fArr2;
        }
        this.zzc[i10] = fFloatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzice.zzb;
        collection.getClass();
        if (!(collection instanceof zzibi)) {
            return super.addAll(collection);
        }
        zzibi zzibiVar = (zzibi) collection;
        int i10 = zzibiVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.zzc;
        if (i12 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(zzibiVar.zzc, 0, this.zzc, this.zzd, zzibiVar.zzd);
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
        if (!(obj instanceof zzibi)) {
            return super.equals(obj);
        }
        zzibi zzibiVar = (zzibi) obj;
        if (this.zzd != zzibiVar.zzd) {
            return false;
        }
        float[] fArr = zzibiVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (Float.floatToIntBits(this.zzc[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzk(i10);
        return Float.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzdV();
        zzk(i10);
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzdV();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i11, fArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzdV();
        zzk(i10);
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicd, com.google.android.gms.internal.ads.zzibt
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zziby zzh(int i10) {
        if (i10 >= this.zzd) {
            return new zzibi(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzf(int i10) {
        zzk(i10);
        return this.zzc[i10];
    }

    public final void zzg(float f10) {
        zzdV();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        fArr2[i11] = f10;
    }

    final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzibi(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzc = fArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhzz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
