package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgqq implements zzgrd {
    protected zzgqq() {
    }

    public static zzgqq zzc(char c10) {
        return new zzgqn(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgrd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
