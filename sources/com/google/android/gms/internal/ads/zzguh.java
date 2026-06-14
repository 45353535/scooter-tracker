package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzguh {
    Object[] zza;
    int zzb;
    zzgug zzc;

    public zzguh() {
        this(4);
    }

    private final void zze(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzgua.zze(length, i11));
        }
    }

    private final zzgui zzf(boolean z10) {
        zzgug zzgugVar;
        zzgug zzgugVar2;
        if (z10 && (zzgugVar2 = this.zzc) != null) {
            throw zzgugVar2.zza();
        }
        zzgwf zzgwfVarZzk = zzgwf.zzk(this.zzb, this.zza, this);
        if (!z10 || (zzgugVar = this.zzc) == null) {
            return zzgwfVarZzk;
        }
        throw zzgugVar.zza();
    }

    public final zzguh zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgtb.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzguh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgui zzc() {
        return zzf(true);
    }

    public final zzgui zzd() {
        return zzf(false);
    }

    zzguh(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
