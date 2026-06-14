package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfu extends zzfw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfu(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public final String toString() {
        List list = this.zzb;
        String strZze = zzfw.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb2.append(strZze);
        sb2.append(" leaves: ");
        sb2.append(string);
        sb2.append(" containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzfv zzfvVar) {
        this.zzb.add(zzfvVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzc.add(zzfuVar);
    }

    @Nullable
    public final zzfv zzc(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfv zzfvVar = (zzfv) list.get(i11);
            if (zzfvVar.zzd == i10) {
                return zzfvVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzfu zzd(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfu zzfuVar = (zzfu) list.get(i11);
            if (zzfuVar.zzd == i10) {
                return zzfuVar;
            }
        }
        return null;
    }
}
