package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzef {
    private int zza;
    private long[] zzb;

    public zzef() {
        this(32);
    }

    public final void zza(long j10) {
        int i10 = this.zza;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.zzb;
        int i11 = this.zza;
        this.zza = i11 + 1;
        jArr2[i11] = 0;
    }

    public final void zzb(long[] jArr) {
        int i10 = this.zza;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i11;
    }

    public final long zzc(int i10) {
        if (i10 >= 0 && i10 < this.zza) {
            return this.zzb[i10];
        }
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 24 + String.valueOf(i11).length());
        sb2.append("Invalid index ");
        sb2.append(i10);
        sb2.append(", size is ");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int zzd() {
        return this.zza;
    }

    public zzef(int i10) {
        this.zzb = new long[i10];
    }
}
