package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzakp implements zzagc {
    public static final zzakp zza = new zzakp(true);
    public static final zzakp zzb = new zzakp(false);
    public final boolean zzc;

    private zzakp(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
