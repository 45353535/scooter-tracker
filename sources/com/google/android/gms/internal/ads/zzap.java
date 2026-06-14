package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j10, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    @Nullable
    private static final zzao zzh(zzao zzaoVar, Class cls, zzgrd zzgrdVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgrdVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + androidx.collection.b.a(-9223372036854775807L);
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 8);
        sb2.append("entries=");
        sb2.append(string);
        sb2.append("");
        return sb2.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i10) {
        return this.zza[i10];
    }

    @Nullable
    public final zzao zzc(Class cls, zzgrd zzgrdVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzaoVarZzh != null) {
                return zzaoVarZzh;
            }
        }
        return null;
    }

    public final zzguf zzd(Class cls) {
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgucVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgucVar.zzi();
    }

    public final zzguf zze(Class cls, zzgrd zzgrdVar) {
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgrdVar);
            if (zzaoVarZzh != null) {
                zzgucVar.zzf(zzaoVarZzh);
            }
        }
        return zzgucVar.zzi();
    }

    public final zzap zzf(@Nullable zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfj.zza;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) objArrCopyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }
}
