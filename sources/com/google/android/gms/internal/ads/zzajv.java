package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzajv implements zzagc {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzajv(int i10, long j10, int i11) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = i11;
    }

    public final String toString() {
        String strZzx = zzfj.zzx(this.zza);
        int length = strZzx.length();
        long j10 = this.zzb;
        int length2 = String.valueOf(j10).length();
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i10).length() + 1);
        sb2.append("AtomSizeTooSmall{type=");
        sb2.append(strZzx);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", minHeaderSize=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
