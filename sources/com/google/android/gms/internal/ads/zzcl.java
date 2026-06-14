package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcl {
    public static final zzcl zza = new zzcl(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcl(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzfj.zzA(i12) ? zzfj.zzD(i12) * i11 : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && this.zzd == zzclVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        int length2 = String.valueOf(i11).length();
        int i12 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i12).length() + 1);
        sb2.append("AudioFormat[sampleRate=");
        sb2.append(i10);
        sb2.append(", channelCount=");
        sb2.append(i11);
        sb2.append(", encoding=");
        sb2.append(i12);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }
}
