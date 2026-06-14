package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzguo extends zzgtz {
    Object[] zzd;
    private int zze;

    public zzguo() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz, com.google.android.gms.internal.ads.zzgua
    public final /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzguo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzn = zzgup.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzn <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgty.zza(iHashCode);
                while (true) {
                    int i10 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i10 + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzguo zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            zzf(objArr[i10]);
        }
        return this;
    }

    public final zzguo zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgup zzi() {
        zzgup zzgupVarZzv;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzgwg.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        if (this.zzd == null || zzgup.zzn(i10) != this.zzd.length) {
            zzgupVarZzv = zzgup.zzv(this.zzb, this.zza);
            this.zzb = zzgupVarZzv.size();
        } else {
            int i11 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgup.zzw(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            zzgupVarZzv = new zzgwg(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgupVarZzv;
    }

    zzguo(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzgup.zzn(i10)];
    }
}
