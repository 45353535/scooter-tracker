package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzby {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzbx zzc;

    public final zzby zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
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
        zzbr.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzbz zzb() {
        zzbx zzbxVar = this.zzc;
        if (zzbxVar != null) {
            throw zzbxVar.zza();
        }
        zzci zzciVarZzg = zzci.zzg(this.zzb, this.zza, this);
        zzbx zzbxVar2 = this.zzc;
        if (zzbxVar2 == null) {
            return zzciVarZzg;
        }
        throw zzbxVar2.zza();
    }
}
