package com.google.android.gms.internal.maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbm {
    Object[] zza;
    int zzb;
    zzbl zzc;

    public zzbm() {
        this(4);
    }

    private final void zzb(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 > length) {
                length = length + (length >> 1) + 1;
                if (length < i11) {
                    int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
    }

    public final zzbm zza(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzb(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzb(this.zzb + 1);
            zzbf.zza(key, value);
            Object[] objArr = this.zza;
            int i10 = this.zzb;
            int i11 = i10 + i10;
            objArr[i11] = key;
            objArr[i11 + 1] = value;
            this.zzb = i10 + 1;
        }
        return this;
    }

    zzbm(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
